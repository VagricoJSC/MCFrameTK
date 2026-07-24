package mcframe.serverMSBC.MSBCL1060;

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
 * "MSBCL_InptTrgtSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_InptTrgtSel_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL1060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_InptTrgtSel.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL1060_Srch01_INFO;
		this.aSrch01 = ((MSBCL_InptTrgtSel)this).new Srch01();
	}

	public static MSBCL_InptTrgtSel.Srch01 crtSrch01() {
		MSBCL_InptTrgtSel lgc = new MSBCL_InptTrgtSel();
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
	public mcframe.serverMSBC.MSBCL1060.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL1060.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1060.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBC.MSBCL1060.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1060.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1060.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 現時点在庫あるいは引当可能数量を照会する<br>
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
		private final mcframe.serverMSBC.MSBCL1060.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1060.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1060.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1060.Srch01_RsltR.class);

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
			invoke((MSBCL_InptTrgtSel)MSBCL_InptTrgtSel_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1060.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL1060.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1060.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBC.MSBCL1060.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1060.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1060.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>only_int_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_to</td></tr>
		 * 	<tr><td><br></td><td>unreg_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>positive_flg</td></tr>
		 * 	<tr><td><br></td><td>except_alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>grs_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_good_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_dfct_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_dfct_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_sspnd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_ing_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_wait_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_fin_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_costk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_rtn_pre_accpt_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_rnt_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_purc_pre_accpt_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_ncv_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_opn_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_non_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_opn_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_not_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_non_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_flg</td></tr>
		 * 	<tr><td><br></td><td>site_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_info_srch_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_info_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_info_loc_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1060.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL1060.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>alloc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>base_gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_lot_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_alloc_avl_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_avl_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>avl_act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>stk_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_avl_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>avl_std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>alloc.cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc.cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>alloc.cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc.unreg_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc.plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc.schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1060.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_InptTrgtSel)MSBCL_InptTrgtSel_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}