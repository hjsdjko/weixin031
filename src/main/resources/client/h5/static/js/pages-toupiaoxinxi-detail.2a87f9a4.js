(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-toupiaoxinxi-detail"],{"19af":function(t,i,e){"use strict";var n={"mescroll-uni":e("f05e").default},r=function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("v-uni-view",[e("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(i){arguments[0]=i=t.$handleEvent(i),t.mescrollInit.apply(void 0,arguments)},down:function(i){arguments[0]=i=t.$handleEvent(i),t.downCallback.apply(void 0,arguments)},up:function(i){arguments[0]=i=t.$handleEvent(i),t.upCallback.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"container",style:{width:"100%",padding:"0px",position:"relative",background:"#ffffff",height:"auto"}},[e("v-uni-swiper",{staticClass:"swiper",style:{width:"100%",background:"#ffffff",height:"400rpx"},attrs:{"indicator-dots":!0,autoplay:!0,circular:!0,"indicator-active-color":"#ffffff","indicator-color":"#6484ff30",duration:500,interval:5e3,vertical:!1}},t._l(t.swiperList,(function(i,n){return e("v-uni-swiper-item",{key:n,style:{width:"100%",textAlign:"center",background:"#ffffff",height:"100%"}},["http"==i.substring(0,4)?e("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"#3da742",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:i}}):e("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"#3da742",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:t.baseUrl+i}})])})),1),e("v-uni-view",{staticClass:"detail-content",style:{padding:"24rpx 24rpx 24rpx 24rpx",flexWrap:"wrap",background:"#ffffff",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",borderWidth:"0 0 0px 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("投票标题：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666"}},[t._v(t._s(t.detail.toupiaobiaoti))])],1),e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",borderWidth:"0 0 0px 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("开始时间：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666"}},[t._v(t._s(t.detail.kaishishijian))])],1),e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",borderWidth:"0 0 0px 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("结束时间：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666"}},[t._v(t._s(t.detail.jieshushijian))])],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",borderWidth:"0 0 0px 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("投票数：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666"}},[t._v(t._s(t.detail.toupiaoshu))])],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",borderWidth:"0 0 0px 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("状态：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666"}},[t._v(t._s(t.detail.zhuangtai))])],1),e("v-uni-view",{staticClass:"detail-list-item rich",style:{margin:"24rpx 0 24rpx 0",borderColor:"#cccccc",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0 0 0px 0",background:"#ffffff",display:"block",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 24rpx 0 24rpx",margin:"0 0 12rpx",color:"#333333",textAlign:"left",background:"#3da74210",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",fontWeight:"600"}},[t._v("投票描述")]),e("v-uni-view",{staticClass:"rich-text",style:{padding:"0px 24rpx 24rpx",margin:"0 0 0 0",lineHeight:"48rpx",color:"#666666"}},[e("v-uni-rich-text",{attrs:{nodes:t.detail.toupiaomiaoshu}})],1)],1),e("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{width:"100%",padding:"0",flexWrap:"wrap",background:"none",display:"flex",height:"auto"}},[t.userid&&t.isAuth("toupiaoxinxi","投票")?e("v-uni-button",{staticClass:"cu-btn bg-brown round shadow-blur",style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 20rpx 12rpx 0",color:"#ffffff",borderRadius:"0",background:"#3da742",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onAcrossTap("wodetoupiao","","zhuangtai","你已投票",t.zhuangtaiCrossSelect[0])}}},[t._v("投票")]):t._e(),!t.userid&&t.isAuthFront("toupiaoxinxi","投票")?e("v-uni-button",{staticClass:"cu-btn bg-brown round shadow-blur",style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 20rpx 12rpx 0",color:"#ffffff",borderRadius:"0",background:"#3da742",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onAcrossTap("wodetoupiao","","zhuangtai","你已投票",t.zhuangtaiCrossSelect[0])}}},[t._v("投票")]):t._e(),t.userid&&t.isAuth("toupiaoxinxi","取消投票")?e("v-uni-button",{staticClass:"cu-btn bg-brown round shadow-blur",style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 20rpx 12rpx 0",color:"#ffffff",borderRadius:"0",background:"#3da742",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onAcrossTap("quxiaotoupiao","","zhuangtai","已取消投票",t.zhuangtaiCrossSelect[0])}}},[t._v("取消投票")]):t._e(),!t.userid&&t.isAuthFront("toupiaoxinxi","取消投票")?e("v-uni-button",{staticClass:"cu-btn bg-brown round shadow-blur",style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 20rpx 12rpx 0",color:"#ffffff",borderRadius:"0",background:"#3da742",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onAcrossTap("quxiaotoupiao","","zhuangtai","已取消投票",t.zhuangtaiCrossSelect[0])}}},[t._v("取消投票")]):t._e()],1)],1)],1)],1)],1)],1)},a=[];e.d(i,"b",(function(){return r})),e.d(i,"c",(function(){return a})),e.d(i,"a",(function(){return n}))},"2af7":function(t,i,e){var n=e("c35f");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=e("4f06").default;r("763ae144",n,!0,{sourceMap:!1,shadowMode:!1})},3586:function(t,i,e){"use strict";var n=e("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,e("a481"),e("f559"),e("55dd"),e("96cf");var r=n(e("3b8d")),a=n(e("bd86"));e("28a5");var o={data:function(){var t;return t={btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:null,zhuangtaiCrossSelect:"已投票,未投票".split(",")},(0,a.default)(t,"zhuangtaiCrossSelect","已投票,未投票".split(",")),(0,a.default)(t,"count",0),(0,a.default)(t,"timer",null),t},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=i.id,i.userid&&(this.userid=i.userid),this.init();case 3:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){var e,n,r;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(e);case 3:if(n=t.sent,this.user=n.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),r=uni.getStorageSync("crossCleanType"),!r){t.next=13;break}return uni.removeStorageSync("crossCleanType"),t.next=11,this.$api.info("toupiaoxinxi",this.id);case 11:n=t.sent,this.detail=n.data;case 13:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","toupiaoxinxi"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},onAcrossTap:function(t,i,e,n,r){if(!this.user)return!1;if(uni.setStorageSync("crossTable","toupiaoxinxi"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",e),uni.setStorageSync("statusColumnValue",r),uni.setStorageSync("tips",n),""!=e&&!e.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var o in a)if(o==e&&a[o]==r)return void this.$utils.msg(n)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))},init:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.timer&&clearInterval(this.timer),t.next=3,this.$api.info("toupiaoxinxi",this.id);case 3:i=t.sent,this.detail=i.data,this.detail.toupiaomiaoshu=this.detail.toupiaomiaoshu.replace(/img src/gi,'img style="width:100%;" src'),this.swiperList=this.detail.tupian?this.detail.tupian.split(","):[];case 7:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:i.endSuccess(i.size,this.hasNext);case 1:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var i=this;t=i.$base.url+t,uni.downloadFile({url:t,success:function(e){200===e.statusCode&&(i.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:this.$utils.jump("../discusstoupiaoxinxi/add-or-update?refid=".concat(this.id));case 3:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),onSHTap:function(){if(!this.user)return!1;this.$refs.popup.open()}}};i.default=o},"72c7":function(t,i,e){"use strict";e.r(i);var n=e("3586"),r=e.n(n);for(var a in n)"default"!==a&&function(t){e.d(i,t,(function(){return n[t]}))}(a);i["default"]=r.a},c35f:function(t,i,e){var n=e("24fb");i=n(!1),i.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-737eeecc]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-737eeecc]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-737eeecc]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-737eeecc]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-737eeecc]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-737eeecc] .uni-audio-default{width:inherit}',""]),t.exports=i},e959:function(t,i,e){"use strict";e.r(i);var n=e("19af"),r=e("72c7");for(var a in r)"default"!==a&&function(t){e.d(i,t,(function(){return r[t]}))}(a);e("fe89");var o,s=e("f0c5"),c=Object(s["a"])(r["default"],n["b"],n["c"],!1,null,"737eeecc",null,!1,n["a"],o);i["default"]=c.exports},fe89:function(t,i,e){"use strict";var n=e("2af7"),r=e.n(n);r.a}}]);