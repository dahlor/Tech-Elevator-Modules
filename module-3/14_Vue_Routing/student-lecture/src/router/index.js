import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products.vue'
import ProductDetail from '@/views/ProductDetail.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  // We need to define a dynamic path that takes a path variable
  // A dynamic has a path variable defined with a :variable-name
  {
    path: '/product/:id',  // this path has a variable called id
    name: 'product-name', // name for the path-view association
    component: ProductDetail //name of router view in the views folder
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
