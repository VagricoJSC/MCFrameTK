package mcframe.serverMSLA.MSLAL5220;

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
 * "MSLAL_BillRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_BillRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_BillRecvIfService.BillRecvIf_Chk01 aBillRecvIf_Chk01;

	protected void initBillRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5220_BillRecvIf_Chk01_INFO;
		this.aBillRecvIf_Chk01 = ((MSLAL_BillRecvIfService)this).new BillRecvIf_Chk01();
	}

	public static MSLAL_BillRecvIfService.BillRecvIf_Chk01 crtBillRecvIf_Chk01() {
		MSLAL_BillRecvIfService lgc = new MSLAL_BillRecvIfService();
		lgc.initBillRecvIf_Chk01();
		return lgc.aBillRecvIf_Chk01;
	}

	protected void paramBillRecvIf_Chk01(MCParam p) {
		if (this.aBillRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvIf_Chk01.up0());
		p.addDownBlock(aBillRecvIf_Chk01.down0());
		p.addDownBlock(aBillRecvIf_Chk01.down1());
		p.addDownBlock(aBillRecvIf_Chk01.down2());
	}

	protected void doBillRecvIf_Chk01() {
		aBillRecvIf_Chk01.call();
	};

	/**
	 * BillRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR createBillRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.create();
	}

	/**
	 * BillRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> createBillRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
	}

	/**
	 * BillRecvIf_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createBillRecvIf_Chk01_HdrR(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
	}

	/**
	 * BillRecvIf_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createBillRecvIf_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
	}

	/**
	 * BillRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createBillRecvIf_Chk01_Dtl2R(){
		return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
	}

	/**
	 * BillRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createBillRecvIf_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
	}
	protected MSLAL_BillRecvIfService.BillRecvIf_Upd01 aBillRecvIf_Upd01;

	protected void initBillRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5220_BillRecvIf_Upd01_INFO;
		this.aBillRecvIf_Upd01 = ((MSLAL_BillRecvIfService)this).new BillRecvIf_Upd01();
	}

	public static MSLAL_BillRecvIfService.BillRecvIf_Upd01 crtBillRecvIf_Upd01() {
		MSLAL_BillRecvIfService lgc = new MSLAL_BillRecvIfService();
		lgc.initBillRecvIf_Upd01();
		return lgc.aBillRecvIf_Upd01;
	}

	protected void paramBillRecvIf_Upd01(MCParam p) {
		if (this.aBillRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvIf_Upd01.up0());
	}

	protected void doBillRecvIf_Upd01() {
		aBillRecvIf_Upd01.call();
	};

	/**
	 * BillRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createBillRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * BillRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createBillRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_BillRecvIfService.BillRecvIf_Upd02 aBillRecvIf_Upd02;

	protected void initBillRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5220_BillRecvIf_Upd02_INFO;
		this.aBillRecvIf_Upd02 = ((MSLAL_BillRecvIfService)this).new BillRecvIf_Upd02();
	}

	public static MSLAL_BillRecvIfService.BillRecvIf_Upd02 crtBillRecvIf_Upd02() {
		MSLAL_BillRecvIfService lgc = new MSLAL_BillRecvIfService();
		lgc.initBillRecvIf_Upd02();
		return lgc.aBillRecvIf_Upd02;
	}

	protected void paramBillRecvIf_Upd02(MCParam p) {
		if (this.aBillRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvIf_Upd02.up0());
		p.addUpBlock(aBillRecvIf_Upd02.up1());
		p.addDownBlock(aBillRecvIf_Upd02.down0());
	}

	protected void doBillRecvIf_Upd02() {
		aBillRecvIf_Upd02.call();
	};

	/**
	 * BillRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createBillRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * BillRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createBillRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * BillRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createBillRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * BillRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createBillRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_BillRecvIfService.BillRecvIf_Upd03 aBillRecvIf_Upd03;

	protected void initBillRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5220_BillRecvIf_Upd03_INFO;
		this.aBillRecvIf_Upd03 = ((MSLAL_BillRecvIfService)this).new BillRecvIf_Upd03();
	}

	public static MSLAL_BillRecvIfService.BillRecvIf_Upd03 crtBillRecvIf_Upd03() {
		MSLAL_BillRecvIfService lgc = new MSLAL_BillRecvIfService();
		lgc.initBillRecvIf_Upd03();
		return lgc.aBillRecvIf_Upd03;
	}

	protected void paramBillRecvIf_Upd03(MCParam p) {
		if (this.aBillRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvIf_Upd03.up0());
		p.addDownBlock(aBillRecvIf_Upd03.down0());
	}

	protected void doBillRecvIf_Upd03() {
		aBillRecvIf_Upd03.call();
	};

	/**
	 * BillRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR createBillRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR.create();
	}

	/**
	 * BillRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR> createBillRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR.class);
	}

	/**
	 * BillRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR createBillRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_BillRecvIfService.BillRecvIf_Upd04 aBillRecvIf_Upd04;

	protected void initBillRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5220_BillRecvIf_Upd04_INFO;
		this.aBillRecvIf_Upd04 = ((MSLAL_BillRecvIfService)this).new BillRecvIf_Upd04();
	}

	public static MSLAL_BillRecvIfService.BillRecvIf_Upd04 crtBillRecvIf_Upd04() {
		MSLAL_BillRecvIfService lgc = new MSLAL_BillRecvIfService();
		lgc.initBillRecvIf_Upd04();
		return lgc.aBillRecvIf_Upd04;
	}

	protected void paramBillRecvIf_Upd04(MCParam p) {
		if (this.aBillRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillRecvIf_Upd04.up0());
		p.addDownBlock(aBillRecvIf_Upd04.down0());
	}

	protected void doBillRecvIf_Upd04() {
		aBillRecvIf_Upd04.call();
	};

	/**
	 * BillRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR createBillRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.create();
	}

	/**
	 * BillRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> createBillRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillRecvIf_Chk01オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class BillRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down2;
		
		
		// コンストラクタ
		protected BillRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * BillRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR createBillRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.create();
		}

		/**
		 * BillRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> createBillRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
		}

		/**
		 * BillRecvIf_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_HdrR createBillRecvIf_Chk01_HdrR(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.create();
		}

		/**
		 * BillRecvIf_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> createBillRecvIf_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_HdrR.class);
		}

		/**
		 * BillRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5140.Chk01_DtlR createBillRecvIf_Chk01_Dtl2R(){
			return mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.create();
		}

		/**
		 * BillRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> createBillRecvIf_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBH.MSBHL5140.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill.data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_st_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_end_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>bill.last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.ret_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt_bal</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder_sub</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_rev</td></tr>
		 * 	<tr><td><br></td><td>bill.act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>bill.sno1</td></tr>
		 * 	<tr><td><br></td><td>bill.sno2</td></tr>
		 * 	<tr><td><br></td><td>bill.sno3</td></tr>
		 * 	<tr><td><br></td><td>bill.sno4</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bill.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill.data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_st_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_end_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>bill.last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.ret_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt_bal</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder_sub</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_rev</td></tr>
		 * 	<tr><td><br></td><td>bill.act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>bill.sno1</td></tr>
		 * 	<tr><td><br></td><td>bill.sno2</td></tr>
		 * 	<tr><td><br></td><td>bill.sno3</td></tr>
		 * 	<tr><td><br></td><td>bill.sno4</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bill.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> down0() {
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
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
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
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5140.Chk01_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvIf_Upd01オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class BillRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected BillRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

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
			invoke((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BillRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createBillRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * BillRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createBillRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvIf_Upd02オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（ＩＦデータ確認、および請求受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class BillRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected BillRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BillRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createBillRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * BillRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createBillRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * BillRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createBillRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * BillRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createBillRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvIf_Upd03オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class BillRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected BillRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BillRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR createBillRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR.create();
		}

		/**
		 * BillRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR> createBillRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR.class);
		}

		/**
		 * BillRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR createBillRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill.data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * BillRecvIf_Upd04オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。<br>
	 */
	abstract public class BillRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected BillRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);

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
			invoke((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BillRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR createBillRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.create();
		}

		/**
		 * BillRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> createBillRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill.data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_no</td></tr>
		 * 	<tr><td><br></td><td>bill.pre_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_st_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_end_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill.wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_src_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_xrate</td></tr>
		 * 	<tr><td><br></td><td>bill.last_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.ret_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_sls_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate_base_tax_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt_bal</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.adv_setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd1</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd2</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd3</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd4</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd5</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd6</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd7</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd8</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd9</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_dt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_schd_amt10</td></tr>
		 * 	<tr><td><br></td><td>bill.pay_mtd_cd10</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_ac_holder_sub</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bank_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.branch_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_no</td></tr>
		 * 	<tr><td><br></td><td>bill.act_rev</td></tr>
		 * 	<tr><td><br></td><td>bill.act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_no</td></tr>
		 * 	<tr><td><br></td><td>bill.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bill.itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>bill.sno1</td></tr>
		 * 	<tr><td><br></td><td>bill.sno2</td></tr>
		 * 	<tr><td><br></td><td>bill.sno3</td></tr>
		 * 	<tr><td><br></td><td>bill.sno4</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bill.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_ein</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill.bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>bill.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>bill.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill.data_lno</td></tr>
		 * 	<tr><td><br></td><td>bill.data_no</td></tr>
		 * 	<tr><td><br></td><td>bill.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5220.BillRecvIf_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillRecvIfService)MSLAL_BillRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}