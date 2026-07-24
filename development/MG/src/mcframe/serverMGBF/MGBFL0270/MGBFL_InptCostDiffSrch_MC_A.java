package mcframe.serverMGBF.MGBFL0270;

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
 * "MGBFL_InptCostDiffSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_InptCostDiffSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBFL0270";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_InptCostDiffSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0270_Srch01_INFO;
		this.aSrch01 = ((MGBFL_InptCostDiffSrch)this).new Srch01();
	}

	public static MGBFL_InptCostDiffSrch.Srch01 crtSrch01() {
		MGBFL_InptCostDiffSrch lgc = new MGBFL_InptCostDiffSrch();
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
	public mcframe.serverMGBF.MGBFL0270.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0270.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0270.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBF.MGBFL0270.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltR.class);
	}

	/**
	 * Srch01_RsltQtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR createSrch01_RsltQtyR(){
		return mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR.create();
	}

	/**
	 * Srch01_RsltQtyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR> createSrch01_RsltQtyL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR.class);
	}

	/**
	 * Srch01_CompQtyブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR createSrch01_CompQtyR(){
		return mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR.create();
	}

	/**
	 * Srch01_CompQtyブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR> createSrch01_CompQtyL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 投入原価差異を検索する<br>
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
		private final mcframe.serverMGBF.MGBFL0270.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltR> down0;
		/** [Srch01_CompQty]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR> aSrch01_CompQty;
		/** [Srch01_RsltQty]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR> aSrch01_RsltQty;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0270.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltR.class);
			aSrch01_CompQty = MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR.class);
			aSrch01_RsltQty = MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR.class);

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
			invoke((MGBFL_InptCostDiffSrch)MGBFL_InptCostDiffSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0270.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0270.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0270.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBF.MGBFL0270.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltR.class);
		}

		/**
		 * Srch01_RsltQtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR createSrch01_RsltQtyR(){
			return mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR.create();
		}

		/**
		 * Srch01_RsltQtyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR> createSrch01_RsltQtyL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR.class);
		}

		/**
		 * Srch01_CompQtyブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR createSrch01_CompQtyR(){
			return mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR.create();
		}

		/**
		 * Srch01_CompQtyブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR> createSrch01_CompQtyL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR.class);
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
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>par_asst_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>inpt_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>chd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>chd_sno1</td></tr>
		 * 	<tr><td><br></td><td>chd_sno2</td></tr>
		 * 	<tr><td><br></td><td>chd_sno3</td></tr>
		 * 	<tr><td><br></td><td>chd_sno4</td></tr>
		 * 	<tr><td><br></td><td>chd_asst_typ</td></tr>
		 * 	<tr><td><br></td><td>except_other_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_typ</td></tr>
		 * 	<tr><td><br></td><td>except_ss_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_purc_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>no_ac_rsn_flg</td></tr>
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
		 * 	<tr><td><br></td><td>par_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>par_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_flg</td></tr>
		 * 	<tr><td><br></td><td>par_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>par_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>par_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>par_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>par_asst_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_flg</td></tr>
		 * 	<tr><td><br></td><td>area_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_qty_flg</td></tr>
		 * 	<tr><td><br></td><td>odr_qty_flg</td></tr>
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
		 * 	<tr><td><br></td><td>inpt_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_sublot_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_asst_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>site_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0270.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0270.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>par_asst_typ</td></tr>
		 * 	<tr><td><br></td><td>par_asst_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>comp_qty</td></tr>
		 * 	<tr><td><br></td><td>odr_qty</td></tr>
		 * 	<tr><td><br></td><td>par_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inpt_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>chd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>chd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>chd_sno1</td></tr>
		 * 	<tr><td><br></td><td>chd_sno2</td></tr>
		 * 	<tr><td><br></td><td>chd_sno3</td></tr>
		 * 	<tr><td><br></td><td>chd_sno4</td></tr>
		 * 	<tr><td><br></td><td>chd_asst_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>qty_diff</td></tr>
		 * 	<tr><td><br></td><td>std_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_diff</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>act_upri</td></tr>
		 * 	<tr><td><br></td><td>diff_qty</td></tr>
		 * 	<tr><td><br></td><td>diff_up</td></tr>
		 * 	<tr><td><br></td><td>cost_diff</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>act_cost</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>ttl_qty</td></tr>
		 * 	<tr><td><br></td><td>var_cost_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost_qty</td></tr>
		 * 	<tr><td><br></td><td>ttl_up</td></tr>
		 * 	<tr><td><br></td><td>var_cost_up</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost_up</td></tr>
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
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * 	<tr><td><br></td><td>col_200</td></tr>
		 * 	<tr><td><br></td><td>col_201</td></tr>
		 * 	<tr><td><br></td><td>col_202</td></tr>
		 * 	<tr><td><br></td><td>col_203</td></tr>
		 * 	<tr><td><br></td><td>col_204</td></tr>
		 * 	<tr><td><br></td><td>col_205</td></tr>
		 * 	<tr><td><br></td><td>col_206</td></tr>
		 * 	<tr><td><br></td><td>col_207</td></tr>
		 * 	<tr><td><br></td><td>col_208</td></tr>
		 * 	<tr><td><br></td><td>col_209</td></tr>
		 * 	<tr><td><br></td><td>col_210</td></tr>
		 * 	<tr><td><br></td><td>col_211</td></tr>
		 * 	<tr><td><br></td><td>col_212</td></tr>
		 * 	<tr><td><br></td><td>col_213</td></tr>
		 * 	<tr><td><br></td><td>col_214</td></tr>
		 * 	<tr><td><br></td><td>col_215</td></tr>
		 * 	<tr><td><br></td><td>col_216</td></tr>
		 * 	<tr><td><br></td><td>col_217</td></tr>
		 * 	<tr><td><br></td><td>col_218</td></tr>
		 * 	<tr><td><br></td><td>col_219</td></tr>
		 * 	<tr><td><br></td><td>col_220</td></tr>
		 * 	<tr><td><br></td><td>col_221</td></tr>
		 * 	<tr><td><br></td><td>col_222</td></tr>
		 * 	<tr><td><br></td><td>col_223</td></tr>
		 * 	<tr><td><br></td><td>col_224</td></tr>
		 * 	<tr><td><br></td><td>col_225</td></tr>
		 * 	<tr><td><br></td><td>col_226</td></tr>
		 * 	<tr><td><br></td><td>col_227</td></tr>
		 * 	<tr><td><br></td><td>col_228</td></tr>
		 * 	<tr><td><br></td><td>col_229</td></tr>
		 * 	<tr><td><br></td><td>col_230</td></tr>
		 * 	<tr><td><br></td><td>col_231</td></tr>
		 * 	<tr><td><br></td><td>col_232</td></tr>
		 * 	<tr><td><br></td><td>col_233</td></tr>
		 * 	<tr><td><br></td><td>col_234</td></tr>
		 * 	<tr><td><br></td><td>col_235</td></tr>
		 * 	<tr><td><br></td><td>col_236</td></tr>
		 * 	<tr><td><br></td><td>col_237</td></tr>
		 * 	<tr><td><br></td><td>col_238</td></tr>
		 * 	<tr><td><br></td><td>col_239</td></tr>
		 * 	<tr><td><br></td><td>col_240</td></tr>
		 * 	<tr><td><br></td><td>col_241</td></tr>
		 * 	<tr><td><br></td><td>col_242</td></tr>
		 * 	<tr><td><br></td><td>col_243</td></tr>
		 * 	<tr><td><br></td><td>col_244</td></tr>
		 * 	<tr><td><br></td><td>col_245</td></tr>
		 * 	<tr><td><br></td><td>col_246</td></tr>
		 * 	<tr><td><br></td><td>col_247</td></tr>
		 * 	<tr><td><br></td><td>col_248</td></tr>
		 * 	<tr><td><br></td><td>col_249</td></tr>
		 * 	<tr><td><br></td><td>col_250</td></tr>
		 * 	<tr><td><br></td><td>col_251</td></tr>
		 * 	<tr><td><br></td><td>col_252</td></tr>
		 * 	<tr><td><br></td><td>col_253</td></tr>
		 * 	<tr><td><br></td><td>col_254</td></tr>
		 * 	<tr><td><br></td><td>col_255</td></tr>
		 * 	<tr><td><br></td><td>col_256</td></tr>
		 * 	<tr><td><br></td><td>col_257</td></tr>
		 * 	<tr><td><br></td><td>col_258</td></tr>
		 * 	<tr><td><br></td><td>col_259</td></tr>
		 * 	<tr><td><br></td><td>col_260</td></tr>
		 * 	<tr><td><br></td><td>col_261</td></tr>
		 * 	<tr><td><br></td><td>col_262</td></tr>
		 * 	<tr><td><br></td><td>col_263</td></tr>
		 * 	<tr><td><br></td><td>col_264</td></tr>
		 * 	<tr><td><br></td><td>col_265</td></tr>
		 * 	<tr><td><br></td><td>col_266</td></tr>
		 * 	<tr><td><br></td><td>col_267</td></tr>
		 * 	<tr><td><br></td><td>col_268</td></tr>
		 * 	<tr><td><br></td><td>col_269</td></tr>
		 * 	<tr><td><br></td><td>col_270</td></tr>
		 * 	<tr><td><br></td><td>col_271</td></tr>
		 * 	<tr><td><br></td><td>col_272</td></tr>
		 * 	<tr><td><br></td><td>col_273</td></tr>
		 * 	<tr><td><br></td><td>col_274</td></tr>
		 * 	<tr><td><br></td><td>col_275</td></tr>
		 * 	<tr><td><br></td><td>col_276</td></tr>
		 * 	<tr><td><br></td><td>col_277</td></tr>
		 * 	<tr><td><br></td><td>col_278</td></tr>
		 * 	<tr><td><br></td><td>col_279</td></tr>
		 * 	<tr><td><br></td><td>col_280</td></tr>
		 * 	<tr><td><br></td><td>col_281</td></tr>
		 * 	<tr><td><br></td><td>col_282</td></tr>
		 * 	<tr><td><br></td><td>col_283</td></tr>
		 * 	<tr><td><br></td><td>col_284</td></tr>
		 * 	<tr><td><br></td><td>col_285</td></tr>
		 * 	<tr><td><br></td><td>col_286</td></tr>
		 * 	<tr><td><br></td><td>col_287</td></tr>
		 * 	<tr><td><br></td><td>col_288</td></tr>
		 * 	<tr><td><br></td><td>col_289</td></tr>
		 * 	<tr><td><br></td><td>col_290</td></tr>
		 * 	<tr><td><br></td><td>col_291</td></tr>
		 * 	<tr><td><br></td><td>col_292</td></tr>
		 * 	<tr><td><br></td><td>col_293</td></tr>
		 * 	<tr><td><br></td><td>col_294</td></tr>
		 * 	<tr><td><br></td><td>col_295</td></tr>
		 * 	<tr><td><br></td><td>col_296</td></tr>
		 * 	<tr><td><br></td><td>col_297</td></tr>
		 * 	<tr><td><br></td><td>col_298</td></tr>
		 * 	<tr><td><br></td><td>col_299</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Srch01_CompQty]ブロックのコンテナaSrch01_CompQtyLを返します。
		 *
		 * @return Srch01_CompQtyL
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_CompQtyR> Srch01_CompQty() {
			return aSrch01_CompQty;
		}

		/**
		 * [Srch01_RsltQty]ブロックのコンテナaSrch01_RsltQtyLを返します。
		 *
		 * @return Srch01_RsltQtyL
		 */
		public MCList<mcframe.serverMGBF.MGBFL0270.Srch01_RsltQtyR> Srch01_RsltQty() {
			return aSrch01_RsltQty;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_InptCostDiffSrch)MGBFL_InptCostDiffSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}