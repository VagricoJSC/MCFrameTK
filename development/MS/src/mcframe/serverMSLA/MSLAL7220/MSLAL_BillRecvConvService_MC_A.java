package mcframe.serverMSLA.MSLAL7220;

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
 * "MSLAL_BillRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_BillRecvConvService_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL7220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_BillRecvConvService.BillRecvConv_Conv01 aBillRecvConv_Conv01;

	protected void initBillRecvConv_Conv01() {
		this.info = PDef.MS_MSLAL7220_BillRecvConv_Conv01_INFO;
		this.aBillRecvConv_Conv01 = ((MSLAL_BillRecvConvService)this).new BillRecvConv_Conv01();
	}

	public static MSLAL_BillRecvConvService.BillRecvConv_Conv01 crtBillRecvConv_Conv01() {
		MSLAL_BillRecvConvService lgc = new MSLAL_BillRecvConvService();
		lgc.initBillRecvConv_Conv01();
		return lgc.aBillRecvConv_Conv01;
	}

	protected void paramBillRecvConv_Conv01(MCParam p) {
		if (this.aBillRecvConv_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvConv_Conv01.up0());
		p.addDownBlock(aBillRecvConv_Conv01.down0());
	}

	protected void doBillRecvConv_Conv01() {
		aBillRecvConv_Conv01.call();
	};
	protected MSLAL_BillRecvConvService.BillRecvConv_Conv02 aBillRecvConv_Conv02;

	protected void initBillRecvConv_Conv02() {
		this.info = PDef.MS_MSLAL7220_BillRecvConv_Conv02_INFO;
		this.aBillRecvConv_Conv02 = ((MSLAL_BillRecvConvService)this).new BillRecvConv_Conv02();
	}

	public static MSLAL_BillRecvConvService.BillRecvConv_Conv02 crtBillRecvConv_Conv02() {
		MSLAL_BillRecvConvService lgc = new MSLAL_BillRecvConvService();
		lgc.initBillRecvConv_Conv02();
		return lgc.aBillRecvConv_Conv02;
	}

	protected void paramBillRecvConv_Conv02(MCParam p) {
		if (this.aBillRecvConv_Conv02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvConv_Conv02.up0());
		p.addDownBlock(aBillRecvConv_Conv02.down0());
	}

	protected void doBillRecvConv_Conv02() {
		aBillRecvConv_Conv02.call();
	};
	protected MSLAL_BillRecvConvService.BillRecvConv_Conv03 aBillRecvConv_Conv03;

	protected void initBillRecvConv_Conv03() {
		this.info = PDef.MS_MSLAL7220_BillRecvConv_Conv03_INFO;
		this.aBillRecvConv_Conv03 = ((MSLAL_BillRecvConvService)this).new BillRecvConv_Conv03();
	}

	public static MSLAL_BillRecvConvService.BillRecvConv_Conv03 crtBillRecvConv_Conv03() {
		MSLAL_BillRecvConvService lgc = new MSLAL_BillRecvConvService();
		lgc.initBillRecvConv_Conv03();
		return lgc.aBillRecvConv_Conv03;
	}

	protected void paramBillRecvConv_Conv03(MCParam p) {
		if (this.aBillRecvConv_Conv03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvConv_Conv03.up0());
		p.addUpBlock(aBillRecvConv_Conv03.up1());
		p.addDownBlock(aBillRecvConv_Conv03.down0());
	}

	protected void doBillRecvConv_Conv03() {
		aBillRecvConv_Conv03.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonMSLA.MSLAR2410.BillHdrRowR createDtlR(){
		return mcframe.commonMSLA.MSLAR2410.BillHdrRowR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonMSLA.MSLAR2410.BillHdrRowR> createDtlL(){
		return MCList.create(mcframe.commonMSLA.MSLAR2410.BillHdrRowR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillRecvConv_Conv01オペレーション.<p>
	 *
	 */
	abstract public class BillRecvConv_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvConv_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected BillRecvConv_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

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
			invoke((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvConv_Conv02オペレーション.<p>
	 *
	 */
	abstract public class BillRecvConv_Conv02 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvConv_Conv02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected BillRecvConv_Conv02() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			// down0 の初期化は、superOperationのコンストラクタで行います。

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
			invoke((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvConv_Conv03オペレーション.<p>
	 *
	 */
	abstract public class BillRecvConv_Conv03 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase04 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvConv_Conv03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonMSLA.MSLAR2410.BillHdrRowR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected BillRecvConv_Conv03() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonMSLA.MSLAR2410.BillHdrRowR.class);
			// down0 の初期化は、superOperationのコンストラクタで行います。

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
			invoke((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonMSLA.MSLAR2410.BillHdrRowR createDtlR(){
			return mcframe.commonMSLA.MSLAR2410.BillHdrRowR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonMSLA.MSLAR2410.BillHdrRowR> createDtlL(){
			return MCList.create(mcframe.commonMSLA.MSLAR2410.BillHdrRowR.class);
		}

		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>trd_typ_cd</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>pre_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pre_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_st_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_end_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_co_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_co_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_co_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_co_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_co_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_co_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_co_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_co_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_co_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_co_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_co_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_co_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_ein</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_rcpt_co_cntry_cd</td></tr>
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
		 * 	<tr><td><br></td><td>rcv_schd_dt1</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt1</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd1</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm1</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm2</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm4</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm5</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm6</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm7</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm8</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm9</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm10</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_typ</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_holder</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_holder_sub</td></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.commonMSLA.MSLAR2410.BillHdrRowR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvConvService)MSLAL_BillRecvConvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}