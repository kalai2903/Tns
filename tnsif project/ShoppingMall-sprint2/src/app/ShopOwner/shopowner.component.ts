import { Component, OnInit } from '@angular/core';
import { ShopOwner } from './shop-owner.model';
import { ShopOwnerService } from './shop-owner.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-shopowner',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './shopowner.component.html',
  styleUrl: './shopowner.component.css'
})
export class ShopownerComponent implements OnInit {

  constructor(private shopService:ShopOwnerService){}


  ngOnInit(): void 
  {
    this.getShopOwners();
  }
  
  newShop:ShopOwner = {name:" ",shopName:" ",contactNumber:" ",email:" "};
  shopList:ShopOwner[] = [];
  editingShopOwner:ShopOwner|null=null;
  updateShopOwner:ShopOwner={name:" ",shopName:" ",contactNumber:" ",email:" "};

createShopOwner()
{
  this.shopService.createShopOwner(this.newShop).subscribe(result=>{
    this.shopList.push(result);
  });

  this.newShop ={name:" ",shopName:" ",contactNumber:" ",email:" "};
}

getShopOwners()
{
  this.shopService.getShopOwners().subscribe(result=>{
  this.shopList=result;
});
}
editShopOwner(editShopOwner:ShopOwner)
{
  this.editingShopOwner=editShopOwner;
  this.updateShopOwner={...editShopOwner}
}

updateShopOwnerById()
{
  this.shopService.updateShopOwner(this.editingShopOwner!.id!,this.updateShopOwner).subscribe(result=>{
    const index= this.shopList.findIndex((shop)=>shop.id=this.editingShopOwner!.id);

    if(index!==-1)
    {
      this.shopList[index]=result;
    }
  });

 this.updateShopOwner={name:" ",shopName:" ",contactNumber:" ",email:" "};
} 


deleteShopOwnerById()
{
  this.shopService.deleteShopOwner(this.editingShopOwner!.id!).subscribe(()=>
  {
    this.getShopOwners();

  });
}

}
