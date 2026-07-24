package mcframe.serverMGBB.MGBBB0030;

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
 * "MGBBB_ActItmCopyBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBB_ActItmCopyBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBBB0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBB_ActItmCopyBatch.ActItmCopy_Ins01 aActItmCopy_Ins01;

	protected void initActItmCopy_Ins01() {
		this.info = PDef.MG_MGBBB0030_ActItmCopy_Ins01_INFO;
		this.aActItmCopy_Ins01 = ((MGBBB_ActItmCopyBatch)this).new ActItmCopy_Ins01();
	}

	public static MGBBB_ActItmCopyBatch.ActItmCopy_Ins01 crtActItmCopy_Ins01() {
		MGBBB_ActItmCopyBatch lgc = new MGBBB_ActItmCopyBatch();
		lgc.initActItmCopy_Ins01();
		return lgc.aActItmCopy_Ins01;
	}

	protected void paramActItmCopy_Ins01(MCParam p) {
		if (this.aActItmCopy_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActItmCopy_Ins01.up0());
	}

	protected void doActItmCopy_Ins01() {
		aActItmCopy_Ins01.call();
	};

	/**
	 * ActItmCopy_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR createActItmCopy_Ins01_CndR(){
		return mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ActItmCopy_Ins01オペレーション.<p>
	 *
	 * 原価実績品目情報コピー<br>
	 */
	abstract public class ActItmCopy_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActItmCopy_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected ActItmCopy_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR.create();

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
			invoke((MGBBB_ActItmCopyBatch)MGBBB_ActItmCopyBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ActItmCopy_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR createActItmCopy_Ins01_CndR(){
			return mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>ptn_set_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR
		 */
		public mcframe.serverMGBB.MGBBB0030.ActItmCopy_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBB_ActItmCopyBatch)MGBBB_ActItmCopyBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}