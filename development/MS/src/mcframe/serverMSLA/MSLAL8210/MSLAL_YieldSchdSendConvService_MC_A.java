package mcframe.serverMSLA.MSLAL8210;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSLAL_YieldSchdSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_YieldSchdSendConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL8210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv01 aYieldSchdSendConv_Conv01;

	protected void initYieldSchdSendConv_Conv01() {
		this.info = PDef.MS_MSLAL8210_YieldSchdSendConv_Conv01_INFO;
		this.aYieldSchdSendConv_Conv01 = ((MSLAL_YieldSchdSendConvService)this).new YieldSchdSendConv_Conv01();
	}

	public static MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv01 crtYieldSchdSendConv_Conv01() {
		MSLAL_YieldSchdSendConvService lgc = new MSLAL_YieldSchdSendConvService();
		lgc.initYieldSchdSendConv_Conv01();
		return lgc.aYieldSchdSendConv_Conv01;
	}

	protected void paramYieldSchdSendConv_Conv01(MCParam p) {
		if (this.aYieldSchdSendConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldSchdSendConv_Conv01.up0());
		p.addDownBlock(aYieldSchdSendConv_Conv01.down0());
	}

	protected void doYieldSchdSendConv_Conv01() {
		aYieldSchdSendConv_Conv01.call();
	};
	protected MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv02 aYieldSchdSendConv_Conv02;

	protected void initYieldSchdSendConv_Conv02() {
		this.info = PDef.MS_MSLAL8210_YieldSchdSendConv_Conv02_INFO;
		this.aYieldSchdSendConv_Conv02 = ((MSLAL_YieldSchdSendConvService)this).new YieldSchdSendConv_Conv02();
	}

	public static MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv02 crtYieldSchdSendConv_Conv02() {
		MSLAL_YieldSchdSendConvService lgc = new MSLAL_YieldSchdSendConvService();
		lgc.initYieldSchdSendConv_Conv02();
		return lgc.aYieldSchdSendConv_Conv02;
	}

	protected void paramYieldSchdSendConv_Conv02(MCParam p) {
		if (this.aYieldSchdSendConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldSchdSendConv_Conv02.up0());
		p.addDownBlock(aYieldSchdSendConv_Conv02.down0());
	}

	protected void doYieldSchdSendConv_Conv02() {
		aYieldSchdSendConv_Conv02.call();
	};
	protected MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv03 aYieldSchdSendConv_Conv03;

	protected void initYieldSchdSendConv_Conv03() {
		this.info = PDef.MS_MSLAL8210_YieldSchdSendConv_Conv03_INFO;
		this.aYieldSchdSendConv_Conv03 = ((MSLAL_YieldSchdSendConvService)this).new YieldSchdSendConv_Conv03();
	}

	public static MSLAL_YieldSchdSendConvService.YieldSchdSendConv_Conv03 crtYieldSchdSendConv_Conv03() {
		MSLAL_YieldSchdSendConvService lgc = new MSLAL_YieldSchdSendConvService();
		lgc.initYieldSchdSendConv_Conv03();
		return lgc.aYieldSchdSendConv_Conv03;
	}

	protected void paramYieldSchdSendConv_Conv03(MCParam p) {
		if (this.aYieldSchdSendConv_Conv03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aYieldSchdSendConv_Conv03.up0());
		p.addDownBlock(aYieldSchdSendConv_Conv03.down0());
	}

	protected void doYieldSchdSendConv_Conv03() {
		aYieldSchdSendConv_Conv03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * YieldSchdSendConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class YieldSchdSendConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldSchdSendConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldSchdSendConv_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this).info;
		}


	}
	/**
	 * YieldSchdSendConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class YieldSchdSendConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldSchdSendConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldSchdSendConv_Conv02() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this).info;
		}


	}
	/**
	 * YieldSchdSendConv_Conv03オペレーション.<p>
	 *
	 */
	abstract public class YieldSchdSendConv_Conv03 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase05 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "YieldSchdSendConv_Conv03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected YieldSchdSendConv_Conv03() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_YieldSchdSendConvService)MSLAL_YieldSchdSendConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}