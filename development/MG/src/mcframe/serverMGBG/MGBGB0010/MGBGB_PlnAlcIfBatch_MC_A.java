package mcframe.serverMGBG.MGBGB0010;

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
 * "MGBGB_PlnAlcIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGB_PlnAlcIfBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGB_PlnAlcIfBatch.PlnAlcIf_Upd01 aPlnAlcIf_Upd01;

	protected void initPlnAlcIf_Upd01() {
		this.info = PDef.MG_MGBGB0010_PlnAlcIf_Upd01_INFO;
		this.aPlnAlcIf_Upd01 = ((MGBGB_PlnAlcIfBatch)this).new PlnAlcIf_Upd01();
	}

	public static MGBGB_PlnAlcIfBatch.PlnAlcIf_Upd01 crtPlnAlcIf_Upd01() {
		MGBGB_PlnAlcIfBatch lgc = new MGBGB_PlnAlcIfBatch();
		lgc.initPlnAlcIf_Upd01();
		return lgc.aPlnAlcIf_Upd01;
	}

	protected void paramPlnAlcIf_Upd01(MCParam p) {
		if (this.aPlnAlcIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnAlcIf_Upd01.up0());
	}

	protected void doPlnAlcIf_Upd01() {
		aPlnAlcIf_Upd01.call();
	};

	/**
	 * PlnAlcIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR createPlnAlcIf_Upd01_CndR(){
		return mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PlnAlcIf_Upd01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを取り込む。<br>
	 */
	abstract public class PlnAlcIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnAlcIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected PlnAlcIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBGB_PlnAlcIfBatch)MGBGB_PlnAlcIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnAlcIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR createPlnAlcIf_Upd01_CndR(){
			return mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR
		 */
		public mcframe.serverMGBG.MGBGB0010.PlnAlcIf_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGB_PlnAlcIfBatch)MGBGB_PlnAlcIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}