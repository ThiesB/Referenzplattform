import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { DownloadsComponent } from './downloads.component';
import { DownloadsDetailComponent } from './downloads-detail.component';
import { DownloadsPopupComponent } from './downloads-dialog.component';
import { DownloadsDeletePopupComponent } from './downloads-delete-dialog.component';

export const downloadsRoute: Routes = [
    {
        path: 'downloads',
        component: DownloadsComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'referenzplattformApp.downloads.home.title'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'downloads/:id',
        component: DownloadsDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'referenzplattformApp.downloads.home.title'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const downloadsPopupRoute: Routes = [
    {
        path: 'downloads-new',
        component: DownloadsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'referenzplattformApp.downloads.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'downloads/:id/edit',
        component: DownloadsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'referenzplattformApp.downloads.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'downloads/:id/delete',
        component: DownloadsDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'referenzplattformApp.downloads.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
