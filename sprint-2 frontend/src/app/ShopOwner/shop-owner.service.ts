import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ShopOwner } from './shop-owner.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ShopOwnerService {

  constructor(private httpClient:HttpClient) { }

  apiURL="http://localhost:8080/ShoppingMall"

  createShopOwner(shopowner:ShopOwner):Observable<ShopOwner>
  {
    return this.httpClient.post<ShopOwner>(this.apiURL,shopowner);
  }

  getShopOwners():Observable<ShopOwner[]>
  {
    return this.httpClient.get<ShopOwner[]>(this.apiURL);

  }
  updateShopOwner(id:number, shopowner:ShopOwner):Observable<ShopOwner>
  {
    return this.httpClient.put<ShopOwner>(this.apiURL+'/'+id,shopowner);
  }
  deleteShopOwner(id:number)
  {
    return this.httpClient.delete(this.apiURL+'/'+id);
  }

}
