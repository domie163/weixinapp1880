import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import tejiacanpin from '@/views/modules/tejiacanpin/list'
    import canpinfenlei from '@/views/modules/canpinfenlei/list'
    import tesecanpin from '@/views/modules/tesecanpin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongdingdan from '@/views/modules/huodongdingdan/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '餐厅资讯',
        component: news
      }
          ,{
	path: '/tejiacanpin',
        name: '特价餐品',
        component: tejiacanpin
      }
          ,{
	path: '/canpinfenlei',
        name: '餐品分类',
        component: canpinfenlei
      }
          ,{
	path: '/tesecanpin',
        name: '特色餐品',
        component: tesecanpin
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/huodongdingdan',
        name: '活动订单',
        component: huodongdingdan
      }
          ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
