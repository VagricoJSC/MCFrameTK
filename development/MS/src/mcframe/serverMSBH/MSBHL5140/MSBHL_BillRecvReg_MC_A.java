package mcframe.serverMSBH.MSBHL5140;

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
 * "MSBHL_BillRecvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_BillRecvReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_BillRecvReg.BillRcpt_Chk01 aBillRcpt_Chk01;

	protected void initBillRcpt_Chk01() {
		this.info = PDef.MS_MSBHL5140_BillRcpt_Chk01_INFO;
		this.aBillRcpt_Chk01 = ((MSBHL_BillRecvReg)this).new BillRcpt_Chk01();
	}

	public static MSBHL_BillRecvReg.BillRcpt_Chk01 crtBillRcpt_Chk01() {
		MSBHL_BillRecvReg lgc = new MSBHL_BillRecvReg();
		lgc.initBillRcpt_Chk01();
		return lgc.aBillRcpt_Chk01;
	}

	protected void paramBillRcpt_Chk01(MCParam p) {
		if (this.aBillRcpt_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRcpt_Chk01.up0());
		p.addUpBlock(aBillRcpt_Chk01.up1());
		p.addDownBlock(aBillRcpt_Chk01.down0());
		p.addDownBlock(aBillRcpt_Chk01.down1());
	}

	protected void doBillRcpt_Chk01() {
		aBillRcpt_Chk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
	}

	/**
	 * Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createChk01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
	}
	protected MSBHL_BillRecvReg.BillRcpt_Ins01 aBillRcpt_Ins01;

	protected void initBillRcpt_Ins01() {
		this.info = PDef.MS_MSBHL5140_BillRcpt_Ins01_INFO;
		this.aBillRcpt_Ins01 = ((MSBHL_BillRecvReg)this).new BillRcpt_Ins01();
	}

	public static MSBHL_BillRecvReg.BillRcpt_Ins01 crtBillRcpt_Ins01() {
		MSBHL_BillRecvReg lgc = new MSBHL_BillRecvReg();
		lgc.initBillRcpt_Ins01();
		return lgc.aBillRcpt_Ins01;
	}

	protected void paramBillRcpt_Ins01(MCParam p) {
		if (this.aBillRcpt_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRcpt_Ins01.up0());
		p.addUpBlock(aBillRcpt_Ins01.up1());
		p.addDownBlock(aBillRcpt_Ins01.down0());
		p.addDownBlock(aBillRcpt_Ins01.down1());
	}

	protected void doBillRcpt_Ins01() {
		aBillRcpt_Ins01.call();
	};

	/**
	 * BillRcpt_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createBillRcpt_Ins01_HdrR(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
	}

	/**
	 * BillRcpt_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createBillRcpt_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
	}

	/**
	 * BillRcpt_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createBillRcpt_Ins01_DtlR(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
	}

	/**
	 * BillRcpt_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createBillRcpt_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillRcpt_Chk01オペレーション.<p>
	 *
	 * 受領した請求を登録する前のチェックをする<br>
	 */
	abstract public class BillRcpt_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRcpt_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected BillRcpt_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_BillRecvReg)MSBHL_BillRecvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
		}

		/**
		 * Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createChk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		 * 	<tr><td><br></td><td>bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_amt</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		 * 	<tr><td><br></td><td>bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_amt</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_BillRecvReg)MSBHL_BillRecvReg_MC_A.this).info;
		}


	}
	/**
	 * BillRcpt_Ins01オペレーション.<p>
	 *
	 * 受領した請求を登録する<br>
	 */
	abstract public class BillRcpt_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRcpt_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected BillRcpt_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_BillRecvReg)MSBHL_BillRecvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * BillRcpt_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createBillRcpt_Ins01_HdrR(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
		}

		/**
		 * BillRcpt_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createBillRcpt_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
		}

		/**
		 * BillRcpt_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createBillRcpt_Ins01_DtlR(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
		}

		/**
		 * BillRcpt_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createBillRcpt_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		 * 	<tr><td><br></td><td>bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_amt</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_BillRecvReg)MSBHL_BillRecvReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}