package mcframe.serverMGBF.MGBFL0240;

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
 * "MGBFL_RptSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_RptSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBFL0240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_RptSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0240_Srch01_INFO;
		this.aSrch01 = ((MGBFL_RptSrch)this).new Srch01();
	}

	public static MGBFL_RptSrch.Srch01 crtSrch01() {
		MGBFL_RptSrch lgc = new MGBFL_RptSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0240.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0240.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0240.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMGBF.MGBFL0240.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_DtlR.class);
	}

	/**
	 * Srch01_KeyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0240.Srch01_KeyR createSrch01_KeyR(){
		return mcframe.serverMGBF.MGBFL0240.Srch01_KeyR.create();
	}

	/**
	 * Srch01_KeyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_KeyR> createSrch01_KeyL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_KeyR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポートを検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBF.MGBFL0240.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0240.Srch01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0240.Srch01_KeyR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0240.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_DtlR.class);
			down1 = MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_KeyR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBFL_RptSrch)MGBFL_RptSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0240.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0240.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0240.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMGBF.MGBFL0240.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_DtlR.class);
		}

		/**
		 * Srch01_KeyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0240.Srch01_KeyR createSrch01_KeyR(){
			return mcframe.serverMGBF.MGBFL0240.Srch01_KeyR.create();
		}

		/**
		 * Srch01_KeyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_KeyR> createSrch01_KeyL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0240.Srch01_KeyR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0240.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0240.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_seq</td></tr>
		 * 	<tr><td><br></td><td>rpt_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>rpt_row_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_pre_word</td></tr>
		 * 	<tr><td><br></td><td>rpt_row_nm</td></tr>
		 * 	<tr><td><br></td><td>fg_r</td></tr>
		 * 	<tr><td><br></td><td>fg_g</td></tr>
		 * 	<tr><td><br></td><td>fg_b</td></tr>
		 * 	<tr><td><br></td><td>bg_r</td></tr>
		 * 	<tr><td><br></td><td>bg_g</td></tr>
		 * 	<tr><td><br></td><td>bg_b</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_typ</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cost_io_typ</td></tr>
		 * 	<tr><td><br></td><td>qty_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>col_all</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cd</td></tr>
		 * 	<tr><td><br></td><td>nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0240.Srch01_KeyR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_RptSrch)MGBFL_RptSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}