import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ShopownerComponent } from './ShopOwner/shopowner.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ShopownerComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ShopApp';
}
