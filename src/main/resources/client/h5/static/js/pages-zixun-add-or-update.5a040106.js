(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-zixun-add-or-update"],{5340:function(e,t,i){var r=i("24fb");t=r(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-65ba2a2b]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t},6373:function(e,t,i){var r=i("5340");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var n=i("4f06").default;n("386e4b52",r,!0,{sourceMap:!1,shadowMode:!1})},"78fa":function(e,t,i){"use strict";i.r(t);var r=i("8ea8"),n=i("a27a");for(var a in n)"default"!==a&&function(e){i.d(t,e,(function(){return n[e]}))}(a);i("e8c7");var o,s=i("f0c5"),u=Object(s["a"])(n["default"],r["b"],r["c"],!1,null,"65ba2a2b",null,!1,r["a"],o);t["default"]=u.exports},"8ea8":function(e,t,i){"use strict";var r={"xia-editor":i("064f").default,"w-picker":i("e2b1").default},n=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[i("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("标题")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.biaoti,placeholder:"标题"},model:{value:e.ruleForm.biaoti,callback:function(t){e.$set(e.ruleForm,"biaoti",t)},expression:"ruleForm.biaoti"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.tupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),i("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("类型")]),i("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.leixingIndex,range:e.leixingOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.leixingChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.leixing?e.ruleForm.leixing:"请选择类型"))])],1)],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("发布时间")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{placeholder:"发布时间"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.toggleTab("fabushijian")}},model:{value:e.ruleForm.fabushijian,callback:function(t){e.$set(e.ruleForm,"fabushijian",t)},expression:"ruleForm.fabushijian"}})],1),i("v-uni-view",{style:{padding:"12rpx 0 12rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",borderWidth:"0 0 2rpx 0",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",fontWeight:"500"}},[e._v("内容")]),i("xia-editor",{ref:"editor",style:{minHeight:"300rpx",border:"0px solid #efefef",padding:"0px",color:"#666666",borderRadius:"8rpx 0 0 8rpx",background:"#ffffff",width:"100%",height:"auto"},attrs:{placeholder:"内容"},on:{editorChange:function(t){arguments[0]=t=e.$handleEvent(t),e.neirongChange.apply(void 0,arguments)}},model:{value:e.ruleForm.neirong,callback:function(t){e.$set(e.ruleForm,"neirong",t)},expression:"ruleForm.neirong"}})],1),i("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[i("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#ffffff",background:"#3da742",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),i("w-picker",{ref:"fabushijian",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(t){arguments[0]=t=e.$handleEvent(t),e.fabushijianConfirm.apply(void 0,arguments)}}})],1)],1)},a=[];i.d(t,"b",(function(){return n})),i.d(t,"c",(function(){return a})),i.d(t,"a",(function(){return r}))},a27a:function(e,t,i){"use strict";i.r(t);var r=i("dd36"),n=i.n(r);for(var a in r)"default"!==a&&function(e){i.d(t,e,(function(){return r[e]}))}(a);t["default"]=n.a},dd36:function(e,t,i){"use strict";var r=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("a481"),i("c5f6"),i("f559"),i("456d"),i("ac6a"),i("28a5"),i("96cf");var n=r(i("3b8d")),a=r(i("e2b1")),o=r(i("064f")),s=r(i("bd56")),u={data:function(){return{cross:"",ruleForm:{biaoti:"",neirong:"",tupian:"",leixing:"",fabushijian:""},leixingOptions:[],leixingIndex:0,user:{},ro:{biaoti:!1,neirong:!1,tupian:!1,leixing:!1,fabushijian:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(t){var i,r,n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.ruleForm.fabushijian=this.$utils.getCurDateTime(),i=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(i);case 4:return r=e.sent,this.user=r.data,e.next=8,this.$api.option("zixunleixing","leixing",{});case 8:if(r=e.sent,this.leixingOptions=r.data,this.leixingOptions.unshift("请选择类型"),this.ruleForm.userid=uni.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!t.id){e.next=19;break}return this.ruleForm.id=t.id,e.next=17,this.$api.info("zixun",this.ruleForm.id);case 17:r=e.sent,this.ruleForm=r.data;case 19:if(this.cross=t.cross,!t.cross){e.next=47;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 23:if((e.t1=e.t0()).done){e.next=47;break}if(a=e.t1.value,"biaoti"!=a){e.next=29;break}return this.ruleForm.biaoti=n[a],this.ro.biaoti=!0,e.abrupt("continue",23);case 29:if("neirong"!=a){e.next=33;break}return this.ruleForm.neirong=n[a],this.ro.neirong=!0,e.abrupt("continue",23);case 33:if("tupian"!=a){e.next=37;break}return this.ruleForm.tupian=n[a].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",23);case 37:if("leixing"!=a){e.next=41;break}return this.ruleForm.leixing=n[a],this.ro.leixing=!0,e.abrupt("continue",23);case 41:if("fabushijian"!=a){e.next=45;break}return this.ruleForm.fabushijian=n[a],this.ro.fabushijian=!0,e.abrupt("continue",23);case 45:e.next=23;break;case 47:this.styleChange(),this.$forceUpdate();case 49:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{neirongChange:function(e){this.ruleForm.neirong=e},styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var t={color:"#666666"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var t={color:"#3da742"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var t={color:"#666666"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var t={color:"#3da742"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #3da742",borderRadius:"100%",background:"#3da742"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #3da742",color:"#ffffff",borderRadius:"100%",background:"#3da742"};Object.keys(t).forEach((function(i){e.style[i]=t[i]}))}))}))},fabushijianConfirm:function(e){console.log(e),this.ruleForm.fabushijian=e.result,this.$forceUpdate()},leixingChange:function(e){this.leixingIndex=e.target.value,this.ruleForm.leixing=this.leixingOptions[this.leixingIndex]},tupianTap:function(){var e=this;this.$api.upload((function(t){e.ruleForm.tupian="file/"+t.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var t,i,r,n,a,o,s,u,l,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.cross){e.next=17;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=17;break}if(t||(t=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=13;break}for(s in t)s==a&&(t[s]=o);return u=uni.getStorageSync("crossTable"),e.next=11,this.$api.update("".concat(u),t);case 11:e.next=17;break;case 13:i=Number(uni.getStorageSync("userid")),r=t["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 17:if(!r||!i){e.next=40;break}return this.ruleForm.crossuserid=i,this.ruleForm.crossrefid=r,l={page:1,limit:10,crossuserid:i,crossrefid:r},e.next=23,this.$api.list("zixun",l);case 23:if(c=e.sent,!(c.data.total>=n)){e.next=30;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 30:if(!this.ruleForm.id){e.next=35;break}return e.next=33,this.$api.update("zixun",this.ruleForm);case 33:e.next=37;break;case 35:return e.next=37,this.$api.add("zixun",this.ruleForm);case 37:this.$utils.msgBack("提交成功");case 38:e.next=48;break;case 40:if(!this.ruleForm.id){e.next=45;break}return e.next=43,this.$api.update("zixun",this.ruleForm);case 43:e.next=47;break;case 45:return e.next=47,this.$api.add("zixun",this.ruleForm);case 47:this.$utils.msgBack("提交成功");case 48:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,i=t.getFullYear(),r=t.getMonth()+1,n=t.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),r=r>9?r:"0"+r,n=n>9?n:"0"+n,"".concat(i,"-").concat(r,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};t.default=u},e8c7:function(e,t,i){"use strict";var r=i("6373"),n=i.n(r);n.a}}]);