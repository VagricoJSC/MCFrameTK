package mcframe.serverMSBC.MSBCB1030;

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
 * "MSBCB_BfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCB_BfBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCB1030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCB_BfBatch.Bf_Upd01 aBf_Upd01;

	protected void initBf_Upd01() {
		this.info = PDef.MS_MSBCB1030_Bf_Upd01_INFO;
		this.aBf_Upd01 = ((MSBCB_BfBatch)this).new Bf_Upd01();
	}

	public static MSBCB_BfBatch.Bf_Upd01 crtBf_Upd01() {
		MSBCB_BfBatch lgc = new MSBCB_BfBatch();
		lgc.initBf_Upd01();
		return lgc.aBf_Upd01;
	}

	protected void paramBf_Upd01(MCParam p) {
		if (this.aBf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBf_Upd01.up0());
	}

	protected void doBf_Upd01() {
		aBf_Upd01.call();
	};

	/**
	 * Bf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR createBf_Upd01_CndR(){
		return mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Bf_Upd01オペレーション.<p>
	 *
	 * バックフラッシュ未反映ＦＬＧがオンの工程の投入実績を登録する<br>
	 */
	abstract public class Bf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected Bf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR.create();

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
			invoke((MSBCB_BfBatch)MSBCB_BfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR createBf_Upd01_CndR(){
			return mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR
		 */
		public mcframe.serverMSBC.MSBCB1030.Bf_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCB_BfBatch)MSBCB_BfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}