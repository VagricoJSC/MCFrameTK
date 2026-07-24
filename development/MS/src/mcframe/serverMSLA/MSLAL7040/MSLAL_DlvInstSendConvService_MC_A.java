package mcframe.serverMSLA.MSLAL7040;

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
 * "MSLAL_DlvInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_DlvInstSendConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String LOGIC_ID = "MSLAL7040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_DlvInstSendConvService.DlvInstSendConv_Conv01 aDlvInstSendConv_Conv01;

	protected void initDlvInstSendConv_Conv01() {
		this.info = PDef.MS_MSLAL7040_DlvInstSendConv_Conv01_INFO;
		this.aDlvInstSendConv_Conv01 = ((MSLAL_DlvInstSendConvService)this).new DlvInstSendConv_Conv01();
	}

	public static MSLAL_DlvInstSendConvService.DlvInstSendConv_Conv01 crtDlvInstSendConv_Conv01() {
		MSLAL_DlvInstSendConvService lgc = new MSLAL_DlvInstSendConvService();
		lgc.initDlvInstSendConv_Conv01();
		return lgc.aDlvInstSendConv_Conv01;
	}

	protected void paramDlvInstSendConv_Conv01(MCParam p) {
		if (this.aDlvInstSendConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstSendConv_Conv01.up0());
		p.addDownBlock(aDlvInstSendConv_Conv01.down0());
	}

	protected void doDlvInstSendConv_Conv01() {
		aDlvInstSendConv_Conv01.call();
	};
	protected MSLAL_DlvInstSendConvService.DlvInstSendConv_Conv02 aDlvInstSendConv_Conv02;

	protected void initDlvInstSendConv_Conv02() {
		this.info = PDef.MS_MSLAL7040_DlvInstSendConv_Conv02_INFO;
		this.aDlvInstSendConv_Conv02 = ((MSLAL_DlvInstSendConvService)this).new DlvInstSendConv_Conv02();
	}

	public static MSLAL_DlvInstSendConvService.DlvInstSendConv_Conv02 crtDlvInstSendConv_Conv02() {
		MSLAL_DlvInstSendConvService lgc = new MSLAL_DlvInstSendConvService();
		lgc.initDlvInstSendConv_Conv02();
		return lgc.aDlvInstSendConv_Conv02;
	}

	protected void paramDlvInstSendConv_Conv02(MCParam p) {
		if (this.aDlvInstSendConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstSendConv_Conv02.up0());
		p.addDownBlock(aDlvInstSendConv_Conv02.down0());
	}

	protected void doDlvInstSendConv_Conv02() {
		aDlvInstSendConv_Conv02.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DlvInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class DlvInstSendConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstSendConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected DlvInstSendConv_Conv01() {
			
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
			invoke((MSLAL_DlvInstSendConvService)MSLAL_DlvInstSendConvService_MC_A.this);
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
			return ((MSLAL_DlvInstSendConvService)MSLAL_DlvInstSendConvService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class DlvInstSendConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase02 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstSendConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected DlvInstSendConv_Conv02() {
			
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
			invoke((MSLAL_DlvInstSendConvService)MSLAL_DlvInstSendConvService_MC_A.this);
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
			return ((MSLAL_DlvInstSendConvService)MSLAL_DlvInstSendConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}