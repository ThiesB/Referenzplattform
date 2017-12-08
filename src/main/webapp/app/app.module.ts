import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';

import { ReferenzplattformSharedModule, UserRouteAccessService } from './shared';
import { ReferenzplattformAppRoutingModule} from './app-routing.module';
import { ReferenzplattformHomeModule } from './home/home.module';
import { ReferenzplattformAdminModule } from './admin/admin.module';
import { ReferenzplattformAccountModule } from './account/account.module';
import { ReferenzplattformEntityModule } from './entities/entity.module';
import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ActiveMenuDirective,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        ReferenzplattformAppRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        ReferenzplattformSharedModule,
        ReferenzplattformHomeModule,
        ReferenzplattformAdminModule,
        ReferenzplattformAccountModule,
        ReferenzplattformEntityModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        ActiveMenuDirective,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class ReferenzplattformAppModule {}
