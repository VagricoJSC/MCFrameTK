package mcframe.serverMSLA.MSLAL8010;

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
 * "MSLAL_ShipInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_ShipInstSendConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String LOGIC_ID = "MSLAL8010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_ShipInstSendConvService.ShipInstSendConv_Conv01 aShipInstSendConv_Conv01;

	protected void initShipInstSendConv_Conv01() {
		this.info = PDef.MS_MSLAL8010_ShipInstSendConv_Conv01_INFO;
		this.aShipInstSendConv_Conv01 = ((MSLAL_ShipInstSendConvService)this).new ShipInstSendConv_Conv01();
	}

	public static MSLAL_ShipInstSendConvService.ShipInstSendConv_Conv01 crtShipInstSendConv_Conv01() {
		MSLAL_ShipInstSendConvService lgc = new MSLAL_ShipInstSendConvService();
		lgc.initShipInstSendConv_Conv01();
		return lgc.aShipInstSendConv_Conv01;
	}

	protected void paramShipInstSendConv_Conv01(MCParam p) {
		if (this.aShipInstSendConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInstSendConv_Conv01.up0());
		p.addDownBlock(aShipInstSendConv_Conv01.down0());
	}

	protected void doShipInstSendConv_Conv01() {
		aShipInstSendConv_Conv01.call();
	};
	protected MSLAL_ShipInstSendConvService.ShipInstSendConv_Conv02 aShipInstSendConv_Conv02;

	protected void initShipInstSendConv_Conv02() {
		this.info = PDef.MS_MSLAL8010_ShipInstSendConv_Conv02_INFO;
		this.aShipInstSendConv_Conv02 = ((MSLAL_ShipInstSendConvService)this).new ShipInstSendConv_Conv02();
	}

	public static MSLAL_ShipInstSendConvService.ShipInstSendConv_Conv02 crtShipInstSendConv_Conv02() {
		MSLAL_ShipInstSendConvService lgc = new MSLAL_ShipInstSendConvService();
		lgc.initShipInstSendConv_Conv02();
		return lgc.aShipInstSendConv_Conv02;
	}

	protected void paramShipInstSendConv_Conv02(MCParam p) {
		if (this.aShipInstSendConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInstSendConv_Conv02.up0());
		p.addDownBlock(aShipInstSendConv_Conv02.down0());
	}

	protected void doShipInstSendConv_Conv02() {
		aShipInstSendConv_Conv02.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class ShipInstSendConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInstSendConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipInstSendConv_Conv01() {
			
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
			invoke((MSLAL_ShipInstSendConvService)MSLAL_ShipInstSendConvService_MC_A.this);
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
			return ((MSLAL_ShipInstSendConvService)MSLAL_ShipInstSendConvService_MC_A.this).info;
		}


	}
	/**
	 * ShipInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class ShipInstSendConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInstSendConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected ShipInstSendConv_Conv02() {
			
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
			invoke((MSLAL_ShipInstSendConvService)MSLAL_ShipInstSendConvService_MC_A.this);
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
			return ((MSLAL_ShipInstSendConvService)MSLAL_ShipInstSendConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}