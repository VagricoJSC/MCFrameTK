package mcframe.serverPFUD.PFUDL5000;

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
 * "PFUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_LogicBase_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "PFUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFUDL5000";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_LogicBase.OperationBase aOperationBase;

	protected void initOperationBase() {
		this.info = PDef.PF_PFUDL5000_OperationBase_INFO;
		this.aOperationBase = ((PFUDL_LogicBase)this).new OperationBase();
	}

	public static PFUDL_LogicBase.OperationBase crtOperationBase() {
		PFUDL_LogicBase lgc = new PFUDL_LogicBase();
		lgc.initOperationBase();
		return lgc.aOperationBase;
	}

	protected void paramOperationBase(MCParam p) {
		if (this.aOperationBase == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doOperationBase() {
		aOperationBase.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OperationBaseオペレーション.<p>
	 *
	 */
	abstract public class OperationBase extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperationBase";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected OperationBase() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((PFUDL_LogicBase)PFUDL_LogicBase_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_LogicBase)PFUDL_LogicBase_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}