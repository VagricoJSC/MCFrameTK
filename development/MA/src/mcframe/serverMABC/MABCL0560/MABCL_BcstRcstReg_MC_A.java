package mcframe.serverMABC.MABCL0560;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_BcstRcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_BcstRcstReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0560";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_BcstRcstReg.BpBcst_UpdChk01 aBpBcst_UpdChk01;

	protected void initBpBcst_UpdChk01() {
		this.info = PDef.MA_MABCL0560_BpBcst_UpdChk01_INFO;
		this.aBpBcst_UpdChk01 = ((MABCL_BcstRcstReg)this).new BpBcst_UpdChk01();
	}

	public static MABCL_BcstRcstReg.BpBcst_UpdChk01 crtBpBcst_UpdChk01() {
		MABCL_BcstRcstReg lgc = new MABCL_BcstRcstReg();
		lgc.initBpBcst_UpdChk01();
		return lgc.aBpBcst_UpdChk01;
	}

	protected void paramBpBcst_UpdChk01(MCParam p) {
		if (this.aBpBcst_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpBcst_UpdChk01.up0());
	}

	protected void doBpBcst_UpdChk01() {
		aBpBcst_UpdChk01.call();
	};

	/**
	 * BpBcst_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createBpBcst_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
	}

	/**
	 * BpBcst_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createBpBcst_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
	}
	protected MABCL_BcstRcstReg.BpBcst_Upd01 aBpBcst_Upd01;

	protected void initBpBcst_Upd01() {
		this.info = PDef.MA_MABCL0560_BpBcst_Upd01_INFO;
		this.aBpBcst_Upd01 = ((MABCL_BcstRcstReg)this).new BpBcst_Upd01();
	}

	public static MABCL_BcstRcstReg.BpBcst_Upd01 crtBpBcst_Upd01() {
		MABCL_BcstRcstReg lgc = new MABCL_BcstRcstReg();
		lgc.initBpBcst_Upd01();
		return lgc.aBpBcst_Upd01;
	}

	protected void paramBpBcst_Upd01(MCParam p) {
		if (this.aBpBcst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpBcst_Upd01.up0());
	}

	protected void doBpBcst_Upd01() {
		aBpBcst_Upd01.call();
	};

	/**
	 * BpBcst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createBpBcst_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
	}

	/**
	 * BpBcst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createBpBcst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
	}
	protected MABCL_BcstRcstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0560_Srch01_INFO;
		this.aSrch01 = ((MABCL_BcstRcstReg)this).new Srch01();
	}

	public static MABCL_BcstRcstReg.Srch01 crtSrch01() {
		MABCL_BcstRcstReg lgc = new MABCL_BcstRcstReg();
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
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0560.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0560.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0560.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0560.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL0560.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABC.MABCL0560.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt5R.class);
	}
	protected MABCL_BcstRcstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0560_Upd01_INFO;
		this.aUpd01 = ((MABCL_BcstRcstReg)this).new Upd01();
	}

	public static MABCL_BcstRcstReg.Upd01 crtUpd01() {
		MABCL_BcstRcstReg lgc = new MABCL_BcstRcstReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BpBcst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタを登録する前のチェックを行う<br>
	 */
	abstract public class BpBcst_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpBcst_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpBcst_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);

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
			invoke((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpBcst_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createBpBcst_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
		}

		/**
		 * BpBcst_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createBpBcst_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this).info;
		}


	}
	/**
	 * BpBcst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタを登録する<br>
	 */
	abstract public class BpBcst_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpBcst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpBcst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpBcst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createBpBcst_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
		}

		/**
		 * BpBcst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createBpBcst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src_BpBcst_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpBcst_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src_BpBcst_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpBcst_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0560.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> down4;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RCV_SCHD_CTL__R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RCV_SCHD_CTL__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_RCV_SCHD_CTL__R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_RCV_SCHD_CTL__R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_RCV_SCHD_CTL__R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COM_PAID_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COM_PAID_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_COM_PAID_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_COM_PAID_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_COM_PAID_R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_FB_IF_CTL_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_FB_IF_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_FB_IF_CTL_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_FB_IF_CTL_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_FB_IF_CTL_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EDI_IF_CTL_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_EDI_IF_CTL_R> c4_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0560.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt5R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_BP_R.create("T1"));
			c1 = MCController.create(MAM_RCV_SCHD_CTL__R.create("T1"));
			c2 = MCController.create(MAM_COM_PAID_R.create("T1"));
			c3 = MCController.create(MAM_FB_IF_CTL_R.create("T1"));
			c4 = MCController.create(MAM_EDI_IF_CTL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_BP_R>)c0.down(0);
			c1_down0 = (MCList<MAM_RCV_SCHD_CTL__R>)c1.down(0);
			c2_down0 = (MCList<MAM_COM_PAID_R>)c2.down(0);
			c3_down0 = (MCList<MAM_FB_IF_CTL_R>)c3.down(0);
			c4_down0 = (MCList<MAM_EDI_IF_CTL_R>)c4.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB2<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB3<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB4<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1();
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2();
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3();
			}
			if (key.equals(SELECT_SUB4)) {
				up_SELECT_SUB4();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_BP_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_RCV_SCHD_CTL__R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_COM_PAID_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;MAM_FB_IF_CTL_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;MAM_EDI_IF_CTL_R&gt;（{@link #c4_down0}）=> down4()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down3(), c3_down0);
			}
			if (key.equals(SELECT_SUB4)) {
				down_SELECT_SUB4(down4(), c4_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0560.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0560.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0560.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0560.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL0560.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABC.MABCL0560.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.Srch01_Rslt5R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0560.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0560.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>min_amt</td></tr>
		 * 	<tr><td><br></td><td>sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rate</td></tr>
		 * 	<tr><td><br></td><td>crryovr_mons_typ</td></tr>
		 * 	<tr><td><br></td><td>crryovr_mons_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_day1</td></tr>
		 * 	<tr><td><br></td><td>rcv_day2</td></tr>
		 * 	<tr><td><br></td><td>rcv_day3</td></tr>
		 * 	<tr><td><br></td><td>rcv_day4</td></tr>
		 * 	<tr><td><br></td><td>rcv_day5</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons1</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons2</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons3</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons4</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>min_amt</td></tr>
		 * 	<tr><td><br></td><td>max_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd_null_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>not_onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(){
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(){
		}
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(){
		}
		//-----------------------SELECT_SUB4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB4(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_BP_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("rcst_nm", "rcst_nm");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("ar_cred_nm", "ar_cred_nm");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("bill_cal_nm", "bill_cal_nm");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("ar_setoff_grp_nm", "ar_setoff_grp_nm");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0560.Srch01_Rslt1R r_dest, MAM_BP_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt1R> dest, MCList<MAM_BP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_BP_R r_src : src){
				mcframe.serverMABC.MABCL0560.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_RCV_SCHD_CTL__R> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("sttl_cd", "sttl_cd");
				addColumnPathMap("sttl_nm", "sttl_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("rate", "rate");
				addColumnPathMap("crryovr_mons_typ", "crryovr_mons_typ");
				addColumnPathMap("rcv_day1", "rcv_day1");
				addColumnPathMap("rcv_day2", "rcv_day2");
				addColumnPathMap("rcv_day3", "rcv_day3");
				addColumnPathMap("rcv_day4", "rcv_day4");
				addColumnPathMap("rcv_day5", "rcv_day5");
				addColumnPathMap("rcv_crryovr_mons1", "rcv_crryovr_mons1");
				addColumnPathMap("rcv_crryovr_mons2", "rcv_crryovr_mons2");
				addColumnPathMap("rcv_crryovr_mons3", "rcv_crryovr_mons3");
				addColumnPathMap("rcv_crryovr_mons4", "rcv_crryovr_mons4");
				addColumnPathMap("rcv_crryovr_mons5", "rcv_crryovr_mons5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0560.Srch01_Rslt2R r_dest, MAM_RCV_SCHD_CTL__R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt2R> dest, MCList<MAM_RCV_SCHD_CTL__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_RCV_SCHD_CTL__R r_src : src){
				mcframe.serverMABC.MABCL0560.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_COM_PAID_R> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("max_amt", "max_amt");
				addColumnPathMap("com_paid", "com_paid");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0560.Srch01_Rslt3R r_dest, MAM_COM_PAID_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt3R> dest, MCList<MAM_COM_PAID_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_COM_PAID_R r_src : src){
				mcframe.serverMABC.MABCL0560.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_FB_IF_CTL_R> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_cd_null_flg", "bp_cd_null_flg");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("ar_sttl_typ", "ar_sttl_typ");
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_nm", "bank_nm");
				addColumnPathMap("bank_ac_cd", "bank_ac_cd");
				addColumnPathMap("bank_ac_nm", "bank_ac_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL0560.Srch01_Rslt4R r_dest, MAM_FB_IF_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt4R> dest, MCList<MAM_FB_IF_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(MAM_FB_IF_CTL_R r_src : src){
				mcframe.serverMABC.MABCL0560.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_EDI_IF_CTL_R> src0_0){
			down_SELECT_SUB4_c4_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABC.MABCL0560.Srch01_Rslt5R r_dest, MAM_EDI_IF_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABC.MABCL0560.Srch01_Rslt5R> dest, MCList<MAM_EDI_IF_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(MAM_EDI_IF_CTL_R r_src : src){
				mcframe.serverMABC.MABCL0560.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up4;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.BpBcst_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.RcvSchdCtl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.ComPaid_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.FbIfCtl_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.crtBpBcst_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0560.MABCL_BcstRcstReg.crtBpBcst_Upd01();
			chk02 = mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.crtRcvSchdCtl_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL1020.MABSL_RcvSchdCtlReg.crtRcvSchdCtl_Upd01();
			chk03 = mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.crtComPaid_UpdChk01();
			upd03 = mcframe.serverMABS.MABSL1030.MABSL_ComPaidReg.crtComPaid_Upd01();
			chk04 = mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.crtFbIfCtl_UpdChk01();
			upd04 = mcframe.serverMABS.MABSL1040.MABSL_FbIfCtlReg.crtFbIfCtl_Upd01();
			chk05 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_UpdChk01();
			upd05 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)upd05.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
			appendOpe(CALL_OPE05, chk05);
			appendOpe(CALL_OPE05, upd05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up2());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up3());
			}
			if (key.equals(CALL_OPE05)) {
				up_CALL_OPE05(chk05_up0, upd05_up0, up4());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE04<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE05<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
			if (key.equals(CALL_OPE05)) {
				down_CALL_OPE05();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>min_amt</td></tr>
		 * 	<tr><td><br></td><td>sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rate</td></tr>
		 * 	<tr><td><br></td><td>crryovr_mons_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_day1</td></tr>
		 * 	<tr><td><br></td><td>rcv_day2</td></tr>
		 * 	<tr><td><br></td><td>rcv_day3</td></tr>
		 * 	<tr><td><br></td><td>rcv_day4</td></tr>
		 * 	<tr><td><br></td><td>rcv_day5</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons1</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons2</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons3</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons4</td></tr>
		 * 	<tr><td><br></td><td>rcv_crryovr_mons5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>min_amt</td></tr>
		 * 	<tr><td><br></td><td>max_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>not_onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up4() {
			return up4;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BcstRcstReg)MABCL_BcstRcstReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("check_bcst_dpt_cd", "check_bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0560.BpBcst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("sttl_cd", "sttl_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rate", "rate");
				addColumnPathMap("crryovr_mons_typ", "crryovr_mons_typ");
				addColumnPathMap("rcv_day1", "rcv_day1");
				addColumnPathMap("rcv_day2", "rcv_day2");
				addColumnPathMap("rcv_day3", "rcv_day3");
				addColumnPathMap("rcv_day4", "rcv_day4");
				addColumnPathMap("rcv_day5", "rcv_day5");
				addColumnPathMap("rcv_crryovr_mons1", "rcv_crryovr_mons1");
				addColumnPathMap("rcv_crryovr_mons2", "rcv_crryovr_mons2");
				addColumnPathMap("rcv_crryovr_mons3", "rcv_crryovr_mons3");
				addColumnPathMap("rcv_crryovr_mons4", "rcv_crryovr_mons4");
				addColumnPathMap("rcv_crryovr_mons5", "rcv_crryovr_mons5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("sttl_cd", "sttl_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rate", "rate");
				addColumnPathMap("crryovr_mons_typ", "crryovr_mons_typ");
				addColumnPathMap("rcv_day1", "rcv_day1");
				addColumnPathMap("rcv_day2", "rcv_day2");
				addColumnPathMap("rcv_day3", "rcv_day3");
				addColumnPathMap("rcv_day4", "rcv_day4");
				addColumnPathMap("rcv_day5", "rcv_day5");
				addColumnPathMap("rcv_crryovr_mons1", "rcv_crryovr_mons1");
				addColumnPathMap("rcv_crryovr_mons2", "rcv_crryovr_mons2");
				addColumnPathMap("rcv_crryovr_mons3", "rcv_crryovr_mons3");
				addColumnPathMap("rcv_crryovr_mons4", "rcv_crryovr_mons4");
				addColumnPathMap("rcv_crryovr_mons5", "rcv_crryovr_mons5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1020.RcvSchdCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("max_amt", "max_amt");
				addColumnPathMap("com_paid", "com_paid");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("min_amt", "min_amt");
				addColumnPathMap("max_amt", "max_amt");
				addColumnPathMap("com_paid", "com_paid");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1030.ComPaid_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> src_Upd01_Dtl4){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl4);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl4);
		}
		
		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_chk04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_chk04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_cd_null_flg", "bp_cd_null_flg");
				addColumnPathMap("ar_sttl_typ", "ar_sttl_typ");
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_ac_cd", "bank_ac_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_upd04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_upd04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_cd_null_flg", "bp_cd_null_flg");
				addColumnPathMap("ar_sttl_typ", "ar_sttl_typ");
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_ac_cd", "bank_ac_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1040.FbIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src_Upd01_Dtl5){
			up_CALL_OPE05_chk05_0(dest0_0, src_Upd01_Dtl5);
			up_CALL_OPE05_upd05_0(dest1_0, src_Upd01_Dtl5);
		}
		
		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_chk05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_chk05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_chk05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_upd05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_upd05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_upd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
		//-----------------------CALL_OPE05専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE05の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE05(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}