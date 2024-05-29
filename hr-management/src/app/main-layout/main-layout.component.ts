import { Component } from '@angular/core';
import {SidebarComponent} from "../sidebar/sidebar.component";
import {ContentComponent} from "../content/content.component";

@Component({
  selector: 'app-main-layout',
  standalone: true,
  imports: [
    SidebarComponent,
    ContentComponent
  ],
  templateUrl: './main-layout.component.html',
  styleUrl: './main-layout.component.css'
})
export class MainLayoutComponent {

}
