import Vue from 'vue';
import Router from 'vue-router';
import Landing from '@/views/Landing';
import Home from '@/views/Home';
import Error from '@/views/Error404'
import Userdetail from '@/views/Userdetail';
Vue.use(Router)

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'landing',
            component: Landing
        },
        {
            path: '/home',
            name: 'home',
            component: Home
        },
        {
            path: '/user/:id',
            name: 'userdetail',
            component: Userdetail
        },
        {
            path: '*',
            name: 'error',
            component: Error
        }
    ],
});