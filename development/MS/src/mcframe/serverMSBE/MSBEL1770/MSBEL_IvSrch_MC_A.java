package mcframe.serverMSBE.MSBEL1770;

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
 * "MSBEL_IvSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_IvSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL1770";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_IvSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL1770_Srch01_INFO;
		this.aSrch01 = ((MSBEL_IvSrch)this).new Srch01();
	}

	public static MSBEL_IvSrch.Srch01 crtSrch01() {
		MSBEL_IvSrch lgc = new MSBEL_IvSrch();
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
	public mcframe.serverMSBE.MSBEL1770.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL1770.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1770.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL1770.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1770.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1770.Srch01_RsltR.class);
	}
	protected MSBEL_IvSrch.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBEL1770_Prnt01_INFO;
		this.aPrnt01 = ((MSBEL_IvSrch)this).new Prnt01();
	}

	public static MSBEL_IvSrch.Prnt01 crtPrnt01() {
		MSBEL_IvSrch lgc = new MSBEL_IvSrch();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1770.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.create();
	}

	/**
	 * Prnt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> createPrnt01_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.class);
	}

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR.create();
	}
	protected MSBEL_IvSrch.Prnt02 aPrnt02;

	protected void initPrnt02() {
		this.info = PDef.MS_MSBEL1770_Prnt02_INFO;
		this.aPrnt02 = ((MSBEL_IvSrch)this).new Prnt02();
	}

	public static MSBEL_IvSrch.Prnt02 crtPrnt02() {
		MSBEL_IvSrch lgc = new MSBEL_IvSrch();
		lgc.initPrnt02();
		return lgc.aPrnt02;
	}

	protected void paramPrnt02(MCParam p) {
		if (this.aPrnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt02.up0());
		p.addUpBlock(aPrnt02.up1());
		p.addDownBlock(aPrnt02.down0());
	}

	protected void doPrnt02() {
		aPrnt02.call();
	};

	/**
	 * Prnt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1770.Prnt02_CndR createPrnt02_CndR(){
		return mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.create();
	}

	/**
	 * Prnt02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> createPrnt02_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.class);
	}

	/**
	 * Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR createPrnt02_HdrR(){
		return mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * インボイス情報、インボイスに紐づく出荷指図、出荷実績、売上実績を照会する<br>
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
		private final mcframe.serverMSBE.MSBEL1770.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1770.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1770.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1770.Srch01_RsltR.class);

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
			invoke((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL1770.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL1770.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1770.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>srch_mode</td></tr>
		 * 	<tr><td><br></td><td>ex_im_not_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_im_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_im_not_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_im_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_not_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_not_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>part_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>not_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>part_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_not_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>iv_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>iv_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_site_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_d_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inc_can_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_past_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm10</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1770.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1770.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_im_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ttl_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_net_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_grss_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_dim</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pre_rcpt_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_site_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ttl_iv_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_ncv_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_base_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_freight_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_insurance_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_oth_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_d_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * インボイスを発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.class);
			up1 = mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.create();
		}

		/**
		 * Prnt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> createPrnt01_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt01_CndR.class);
		}

		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt01_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this).info;
		}


	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * パッキングリストを発行する<br>
	 */
	abstract public class Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> down0;
		
		
		// コンストラクタ
		protected Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.class);
			up1 = mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt02_CndR createPrnt02_CndR(){
			return mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.create();
		}

		/**
		 * Prnt02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> createPrnt02_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1770.Prnt02_CndR.class);
		}

		/**
		 * Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR createPrnt02_HdrR(){
			return mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1770.Prnt02_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1770.Prnt02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvSrch)MSBEL_IvSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}