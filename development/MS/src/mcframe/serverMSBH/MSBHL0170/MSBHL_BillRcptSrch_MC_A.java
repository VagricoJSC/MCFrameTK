package mcframe.serverMSBH.MSBHL0170;

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
 * "MSBHL_BillRcptSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_BillRcptSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL0170";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_BillRcptSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0170_Srch01_INFO;
		this.aSrch01 = ((MSBHL_BillRcptSrch)this).new Srch01();
	}

	public static MSBHL_BillRcptSrch.Srch01 crtSrch01() {
		MSBHL_BillRcptSrch lgc = new MSBHL_BillRcptSrch();
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
	public mcframe.serverMSBH.MSBHL0170.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0170.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0170.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBH.MSBHL0170.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0170.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0170.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求受領一覧の情報を取得する<br>
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
		private final mcframe.serverMSBH.MSBHL0170.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0170.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0170.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0170.Srch01_RsltR.class);

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
			invoke((MSBHL_BillRcptSrch)MSBHL_BillRcptSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0170.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0170.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0170.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBH.MSBHL0170.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0170.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0170.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt_from</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_from</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>inc_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_not_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0170.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0170.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>pre_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pre_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_st_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_end_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_src_tel</td></tr>
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
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_typ</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_holder</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_holder_sub</td></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate4</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt4</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>tax_rate5</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt5</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>tax_rate6</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt6</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>tax_rate7</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt7</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>tax_rate8</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt8</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>tax_rate9</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt9</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>tax_rate10</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_sls_amt10</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>tax_rate_base_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>adv_amt_bal</td></tr>
		 * 	<tr><td><br></td><td>adv_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt1</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd1</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_nm10</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0170.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_BillRcptSrch)MSBHL_BillRcptSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}