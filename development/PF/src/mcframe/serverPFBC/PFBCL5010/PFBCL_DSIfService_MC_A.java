package mcframe.serverPFBC.PFBCL5010;

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
 * "PFBCL_DSIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBCL_DSIfService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBCL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBCL_DSIfService.DSIf_Imp01 aDSIf_Imp01;

	protected void initDSIf_Imp01() {
		this.info = PDef.PF_PFBCL5010_DSIf_Imp01_INFO;
		this.aDSIf_Imp01 = ((PFBCL_DSIfService)this).new DSIf_Imp01();
	}

	public static PFBCL_DSIfService.DSIf_Imp01 crtDSIf_Imp01() {
		PFBCL_DSIfService lgc = new PFBCL_DSIfService();
		lgc.initDSIf_Imp01();
		return lgc.aDSIf_Imp01;
	}

	protected void paramDSIf_Imp01(MCParam p) {
		if (this.aDSIf_Imp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDSIf_Imp01.up0());
		p.addDownBlock(aDSIf_Imp01.down0());
	}

	protected void doDSIf_Imp01() {
		aDSIf_Imp01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DSIf_Imp01オペレーション.<p>
	 *
	 */
	abstract public class DSIf_Imp01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase07 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DSIf_Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected DSIf_Imp01() {
			
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
			invoke((PFBCL_DSIfService)PFBCL_DSIfService_MC_A.this);
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
			return ((PFBCL_DSIfService)PFBCL_DSIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}