<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">餐品编号</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{ruleForm.canpinbianhao}}
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">餐品名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.canpinmingcheng" placeholder="餐品名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">餐品分类</view>
				<picker @change="canpinfenleiChange" :value="canpinfenleiIndex" :range="canpinfenleiOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(242, 8, 8, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.canpinfenlei?ruleForm.canpinfenlei:"请选择餐品分类"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">原价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yuanjiage" placeholder="原价格"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">活动价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.huodongjiage" placeholder="活动价格"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">数量</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(247, 6, 6, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shuliang" placeholder="数量"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
																											
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"180rpx","fontSize":"28rpx","color":"rgba(0, 204, 0, 1)","textAlign":"left"}' class="title">详情</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"16rpx","color":"rgba(255, 69, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.xiangqing" placeholder="详情"></textarea>
			</view>
						          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 204, 0, 1)","borderColor":"rgba(0, 204, 0, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																						<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="reversetimeConfirm" ref="reversetime" themeColor="#333333"></w-picker>
							
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												canpinbianhao: this.getUUID(),
																canpinmingcheng: '',
																canpinfenlei: '',
																yuanjiage: '',
																huodongjiage: '',
																shuliang: '',
																tupian: '',
																xiangqing: '',
																reversetime: '',
												},
																												canpinfenleiOptions: [],
				canpinfenleiIndex: 0,
																																																												// 登陆用户信息
				user: {},
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																												
																								// 下拉框
			res = await this.$api.option(`canpinfenlei`,`canpinfenlei`,{});
			this.canpinfenleiOptions = res.data;
																																													
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`tejiacanpin`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
															if(o=='canpinbianhao'){
					this.ruleForm.canpinbianhao = obj[o];
					continue;
					}
																				if(o=='canpinmingcheng'){
					this.ruleForm.canpinmingcheng = obj[o];
					continue;
					}
																				if(o=='canpinfenlei'){
					this.ruleForm.canpinfenlei = obj[o];
					continue;
					}
																				if(o=='yuanjiage'){
					this.ruleForm.yuanjiage = obj[o];
					continue;
					}
																				if(o=='huodongjiage'){
					this.ruleForm.huodongjiage = obj[o];
					continue;
					}
																				if(o=='shuliang'){
					this.ruleForm.shuliang = obj[o];
					continue;
					}
																				if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					continue;
					}
																				if(o=='xiangqing'){
					this.ruleForm.xiangqing = obj[o];
					continue;
					}
																				if(o=='reversetime'){
					this.ruleForm.reversetime = obj[o];
					continue;
					}
														}
																																																																															}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																												
			// 多级联动参数
																																																												
																																																									
																																																									// 日长控件选择日期时间
			reversetimeConfirm(val) {
				console.log(val)
				this.ruleForm.reversetime = val.result;
				this.$forceUpdate();
			},
						
																					// 下拉变化
			canpinfenleiChange(e) {
				this.canpinfenleiIndex = e.target.value
				this.ruleForm.canpinfenlei = this.canpinfenleiOptions[this.canpinfenleiIndex]
			},
																																										
																																																															tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																											
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																				if(this.ruleForm.yuanjiage&&(!this.$validate.isIntNumer(this.ruleForm.yuanjiage))){
					this.$utils.msg(`原价格应输入整数`);
					return
				}
																																								if(this.ruleForm.huodongjiage&&(!this.$validate.isIntNumer(this.ruleForm.huodongjiage))){
					this.$utils.msg(`活动价格应输入整数`);
					return
				}
																																								if(this.ruleForm.shuliang&&(!this.$validate.isIntNumer(this.ruleForm.shuliang))){
					this.$utils.msg(`数量应输入整数`);
					return
				}
																																																																																																																																if(this.ruleForm.id){
					await this.$api.update(`tejiacanpin`, this.ruleForm);
				}else{
					await this.$api.add(`tejiacanpin`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20201207/18e60648bb684cf196230ae29d4e8f96.jpg);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
