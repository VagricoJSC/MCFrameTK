package mcframe.serverMGBF.MGBFL0080;

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
 * "MGBFL_WkCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_WkCostSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBFL0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_WkCostSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0080_Srch01_INFO;
		this.aSrch01 = ((MGBFL_WkCostSrch)this).new Srch01();
	}

	public static MGBFL_WkCostSrch.Srch01 crtSrch01() {
		MGBFL_WkCostSrch lgc = new MGBFL_WkCostSrch();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0080.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0080.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0080.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBF.MGBFL0080.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_RsltR.class);
	}

	/**
	 * Srch01_CostブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0080.Srch01_CostR createSrch01_CostR(){
		return mcframe.serverMGBF.MGBFL0080.Srch01_CostR.create();
	}

	/**
	 * Srch01_CostブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_CostR> createSrch01_CostL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_CostR.class);
	}

	/**
	 * Srch01_QtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0080.Srch01_QtyR createSrch01_QtyR(){
		return mcframe.serverMGBF.MGBFL0080.Srch01_QtyR.create();
	}

	/**
	 * Srch01_QtyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_QtyR> createSrch01_QtyL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_QtyR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工数原価を検索する<br>
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
		private final mcframe.serverMGBF.MGBFL0080.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0080.Srch01_RsltR> down0;
		/** [Srch01_Cost]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0080.Srch01_CostR> aSrch01_Cost;
		/** [Srch01_Qty]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0080.Srch01_QtyR> aSrch01_Qty;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0080.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_RsltR.class);
			aSrch01_Cost = MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_CostR.class);
			aSrch01_Qty = MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_QtyR.class);

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
			invoke((MGBFL_WkCostSrch)MGBFL_WkCostSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0080.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0080.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0080.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBF.MGBFL0080.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_RsltR.class);
		}

		/**
		 * Srch01_CostブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0080.Srch01_CostR createSrch01_CostR(){
			return mcframe.serverMGBF.MGBFL0080.Srch01_CostR.create();
		}

		/**
		 * Srch01_CostブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_CostR> createSrch01_CostL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_CostR.class);
		}

		/**
		 * Srch01_QtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0080.Srch01_QtyR createSrch01_QtyR(){
			return mcframe.serverMGBF.MGBFL0080.Srch01_QtyR.create();
		}

		/**
		 * Srch01_QtyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_QtyR> createSrch01_QtyL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0080.Srch01_QtyR.class);
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
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>except_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>no_bp_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>no_po_no_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>no_slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>no_iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>ym_flg</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>site_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_flg</td></tr>
		 * 	<tr><td><br></td><td>area_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_flg</td></tr>
		 * 	<tr><td><br></td><td>qty_flg</td></tr>
		 * 	<tr><td><br></td><td>odr_qty_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0080.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0080.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>odr_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qty_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>std_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_base_ttl</td></tr>
		 * 	<tr><td><br></td><td>std_base_ttl</td></tr>
		 * 	<tr><td><br></td><td>base_ttl</td></tr>
		 * 	<tr><td><br></td><td>odr_base_ttl</td></tr>
		 * 	<tr><td><br></td><td>diff_base_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>std_base_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_upri</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>diff_rt</td></tr>
		 * 	<tr><td><br></td><td>diff_wk</td></tr>
		 * 	<tr><td><br></td><td>diff_a</td></tr>
		 * 	<tr><td><br></td><td>diff_b</td></tr>
		 * 	<tr><td><br></td><td>diff_c</td></tr>
		 * 	<tr><td><br></td><td>diff_d</td></tr>
		 * 	<tr><td><br></td><td>diff_e</td></tr>
		 * 	<tr><td><br></td><td>diff_oth</td></tr>
		 * 	<tr><td><br></td><td>diff_cost</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var</td></tr>
		 * 	<tr><td><br></td><td>fxd</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Srch01_Cost]ブロックのコンテナaSrch01_CostLを返します。
		 *
		 * @return Srch01_CostL
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_CostR> Srch01_Cost() {
			return aSrch01_Cost;
		}

		/**
		 * [Srch01_Qty]ブロックのコンテナaSrch01_QtyLを返します。
		 *
		 * @return Srch01_QtyL
		 */
		public MCList<mcframe.serverMGBF.MGBFL0080.Srch01_QtyR> Srch01_Qty() {
			return aSrch01_Qty;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_WkCostSrch)MGBFL_WkCostSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}