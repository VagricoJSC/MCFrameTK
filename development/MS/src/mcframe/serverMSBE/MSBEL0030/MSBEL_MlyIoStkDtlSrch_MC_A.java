package mcframe.serverMSBE.MSBEL0030;

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
 * "MSBEL_MlyIoStkDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_MlyIoStkDtlSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_MlyIoStkDtlSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL0030_Srch01_INFO;
		this.aSrch01 = ((MSBEL_MlyIoStkDtlSrch)this).new Srch01();
	}

	public static MSBEL_MlyIoStkDtlSrch.Srch01 crtSrch01() {
		MSBEL_MlyIoStkDtlSrch lgc = new MSBEL_MlyIoStkDtlSrch();
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
	public mcframe.serverMSBE.MSBEL0030.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL0030.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL0030.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL0030.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL0030.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL0030.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指定された締月度、締日の月次受払在庫情報を照会する<br>
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
		private final mcframe.serverMSBE.MSBEL0030.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL0030.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL0030.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL0030.Srch01_RsltR.class);

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
			invoke((MSBEL_MlyIoStkDtlSrch)MSBEL_MlyIoStkDtlSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0030.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL0030.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL0030.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL0030.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL0030.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mly_io_cl_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>mly_io_cl_ym_to</td></tr>
		 * 	<tr><td><br></td><td>mly_io_cl_day</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
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
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>only_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>site_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_unit</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL0030.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL0030.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mly_io_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_unit_cost</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>ini_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_total_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_ret_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_qty</td></tr>
		 * 	<tr><td><br></td><td>bymfg_qty</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_cmpl_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>reinsp_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_adjst_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_in_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_xfr_in_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_cststk_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_itm_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_sno_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_grd_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_pack_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_in_qty</td></tr>
		 * 	<tr><td><br></td><td>ex_ship_in_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_rtn_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_total_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_rtn_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_ret_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_cmpl_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>reinsp_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_adjst_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_out_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_xfr_out_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>scrp_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_itm_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_sno_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_grd_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_pack_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_out_qty</td></tr>
		 * 	<tr><td><br></td><td>ex_ship_out_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_rtn_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>end_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>ini_stk_amt</td></tr>
		 * 	<tr><td><br></td><td>gr_total_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_ret_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_amt</td></tr>
		 * 	<tr><td><br></td><td>bymfg_amt</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_cmpl_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>reinsp_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>stk_adjst_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_in_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_xfr_in_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_cststk_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_itm_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_sno_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_grd_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_pack_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>ship_in_amt</td></tr>
		 * 	<tr><td><br></td><td>ex_ship_in_amt</td></tr>
		 * 	<tr><td><br></td><td>ship_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_rtn_gr_amt</td></tr>
		 * 	<tr><td><br></td><td>gi_total_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_rtn_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_rcv_ret_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>inpt_amt</td></tr>
		 * 	<tr><td><br></td><td>loss_amt</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_cmpl_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>reinsp_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>stk_adjst_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>prdct_wh_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_out_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_xfr_out_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>scrp_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_itm_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_sno_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_grd_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_pack_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>ship_out_amt</td></tr>
		 * 	<tr><td><br></td><td>ex_ship_out_amt</td></tr>
		 * 	<tr><td><br></td><td>ship_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_rtn_gi_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>end_stk_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL0030.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_MlyIoStkDtlSrch)MSBEL_MlyIoStkDtlSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}