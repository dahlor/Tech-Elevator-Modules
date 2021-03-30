import Vue from 'vue';
import VueRouter from 'vue-router';
import Books from '@/views/AllBooks.vue'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'all-books',
    component: AllBooks
  }

];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
