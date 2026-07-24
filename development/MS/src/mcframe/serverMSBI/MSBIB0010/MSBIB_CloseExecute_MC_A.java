package mcframe.serverMSBI.MSBIB0010;

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
 * "MSBIB_CloseExecute"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBIB_CloseExecute_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBI";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBIB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBIB_CloseExecute.CloseExecute_Upd01 aCloseExecute_Upd01;

	protected void initCloseExecute_Upd01() {
		this.info = PDef.MS_MSBIB0010_CloseExecute_Upd01_INFO;
		this.aCloseExecute_Upd01 = ((MSBIB_CloseExecute)this).new CloseExecute_Upd01();
	}

	public static MSBIB_CloseExecute.CloseExecute_Upd01 crtCloseExecute_Upd01() {
		MSBIB_CloseExecute lgc = new MSBIB_CloseExecute();
		lgc.initCloseExecute_Upd01();
		return lgc.aCloseExecute_Upd01;
	}

	protected void paramCloseExecute_Upd01(MCParam p) {
		if (this.aCloseExecute_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doCloseExecute_Upd01() {
		aCloseExecute_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CloseExecute_Upd01オペレーション.<p>
	 *
	 * 本締処理を実行する。<br>
	 */
	abstract public class CloseExecute_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CloseExecute_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected CloseExecute_Upd01() {
			
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
			invoke((MSBIB_CloseExecute)MSBIB_CloseExecute_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIB_CloseExecute)MSBIB_CloseExecute_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}