package mcframe.serverMSBE.MSBEL5900;

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
 * "MSBEL_ArrSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ArrSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5900";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ArrSchdService.ArrSchd_Upd01 aArrSchd_Upd01;

	protected void initArrSchd_Upd01() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Upd01_INFO;
		this.aArrSchd_Upd01 = ((MSBEL_ArrSchdService)this).new ArrSchd_Upd01();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Upd01 crtArrSchd_Upd01() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Upd01();
		return lgc.aArrSchd_Upd01;
	}

	protected void paramArrSchd_Upd01(MCParam p) {
		if (this.aArrSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Upd01.up0());
		p.addUpBlock(aArrSchd_Upd01.up1());
		p.addDownBlock(aArrSchd_Upd01.down0());
	}

	protected void doArrSchd_Upd01() {
		aArrSchd_Upd01.call();
	};

	/**
	 * ArrPr_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR createArrPr_DtlR(){
		return mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.create();
	}

	/**
	 * ArrPr_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> createArrPr_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
	}

	/**
	 * ArrSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
	}

	/**
	 * ArrSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
	}
	protected MSBEL_ArrSchdService.ArrSchd_Upd02 aArrSchd_Upd02;

	protected void initArrSchd_Upd02() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Upd02_INFO;
		this.aArrSchd_Upd02 = ((MSBEL_ArrSchdService)this).new ArrSchd_Upd02();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Upd02 crtArrSchd_Upd02() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Upd02();
		return lgc.aArrSchd_Upd02;
	}

	protected void paramArrSchd_Upd02(MCParam p) {
		if (this.aArrSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Upd02.up0());
		p.addDownBlock(aArrSchd_Upd02.down0());
	}

	protected void doArrSchd_Upd02() {
		aArrSchd_Upd02.call();
	};
	protected MSBEL_ArrSchdService.ArrSchd_Upd03 aArrSchd_Upd03;

	protected void initArrSchd_Upd03() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Upd03_INFO;
		this.aArrSchd_Upd03 = ((MSBEL_ArrSchdService)this).new ArrSchd_Upd03();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Upd03 crtArrSchd_Upd03() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Upd03();
		return lgc.aArrSchd_Upd03;
	}

	protected void paramArrSchd_Upd03(MCParam p) {
		if (this.aArrSchd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Upd03.up0());
	}

	protected void doArrSchd_Upd03() {
		aArrSchd_Upd03.call();
	};
	protected MSBEL_ArrSchdService.ArrSchd_Upd04 aArrSchd_Upd04;

	protected void initArrSchd_Upd04() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Upd04_INFO;
		this.aArrSchd_Upd04 = ((MSBEL_ArrSchdService)this).new ArrSchd_Upd04();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Upd04 crtArrSchd_Upd04() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Upd04();
		return lgc.aArrSchd_Upd04;
	}

	protected void paramArrSchd_Upd04(MCParam p) {
		if (this.aArrSchd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Upd04.up0());
	}

	protected void doArrSchd_Upd04() {
		aArrSchd_Upd04.call();
	};
	protected MSBEL_ArrSchdService.ArrSchd_Chk01 aArrSchd_Chk01;

	protected void initArrSchd_Chk01() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Chk01_INFO;
		this.aArrSchd_Chk01 = ((MSBEL_ArrSchdService)this).new ArrSchd_Chk01();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Chk01 crtArrSchd_Chk01() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Chk01();
		return lgc.aArrSchd_Chk01;
	}

	protected void paramArrSchd_Chk01(MCParam p) {
		if (this.aArrSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Chk01.up0());
		p.addDownBlock(aArrSchd_Chk01.down0());
	}

	protected void doArrSchd_Chk01() {
		aArrSchd_Chk01.call();
	};
	protected MSBEL_ArrSchdService.ArrSchd_Chk02 aArrSchd_Chk02;

	protected void initArrSchd_Chk02() {
		this.info = PDef.MS_MSBEL5900_ArrSchd_Chk02_INFO;
		this.aArrSchd_Chk02 = ((MSBEL_ArrSchdService)this).new ArrSchd_Chk02();
	}

	public static MSBEL_ArrSchdService.ArrSchd_Chk02 crtArrSchd_Chk02() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initArrSchd_Chk02();
		return lgc.aArrSchd_Chk02;
	}

	protected void paramArrSchd_Chk02(MCParam p) {
		if (this.aArrSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrSchd_Chk02.up0());
		p.addDownBlock(aArrSchd_Chk02.down0());
	}

	protected void doArrSchd_Chk02() {
		aArrSchd_Chk02.call();
	};
	protected MSBEL_ArrSchdService.ChkUpd1 aChkUpd1;

	protected void initChkUpd1() {
		this.info = PDef.MS_MSBEL5900_ChkUpd1_INFO;
		this.aChkUpd1 = ((MSBEL_ArrSchdService)this).new ChkUpd1();
	}

	public static MSBEL_ArrSchdService.ChkUpd1 crtChkUpd1() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initChkUpd1();
		return lgc.aChkUpd1;
	}

	protected void paramChkUpd1(MCParam p) {
		if (this.aChkUpd1 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChkUpd1.up0());
		p.addUpBlock(aChkUpd1.up1());
		p.addUpBlock(aChkUpd1.up2());
		p.addDownBlock(aChkUpd1.down0());
		p.addDownBlock(aChkUpd1.down1());
	}

	protected void doChkUpd1() {
		aChkUpd1.call();
	};

	/**
	 * ChkUpd1_Chk0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd1_Chk0R(){
		return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
	}

	/**
	 * ChkUpd1_Chk0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd1_Chk0L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
	}

	/**
	 * ChkUpd1_Upd0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR createChkUpd1_Upd0R(){
		return mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.create();
	}

	/**
	 * ChkUpd1_Upd0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> createChkUpd1_Upd0L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
	}

	/**
	 * ChkUpd1_Upd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd1_Upd1R(){
		return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
	}

	/**
	 * ChkUpd1_Upd1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd1_Upd1L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
	}
	protected MSBEL_ArrSchdService.ChkUpd2 aChkUpd2;

	protected void initChkUpd2() {
		this.info = PDef.MS_MSBEL5900_ChkUpd2_INFO;
		this.aChkUpd2 = ((MSBEL_ArrSchdService)this).new ChkUpd2();
	}

	public static MSBEL_ArrSchdService.ChkUpd2 crtChkUpd2() {
		MSBEL_ArrSchdService lgc = new MSBEL_ArrSchdService();
		lgc.initChkUpd2();
		return lgc.aChkUpd2;
	}

	protected void paramChkUpd2(MCParam p) {
		if (this.aChkUpd2 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChkUpd2.up0());
		p.addUpBlock(aChkUpd2.up1());
		p.addDownBlock(aChkUpd2.down0());
		p.addDownBlock(aChkUpd2.down1());
	}

	protected void doChkUpd2() {
		aChkUpd2.call();
	};

	/**
	 * ChkUpd2_Chk0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd2_Chk0R(){
		return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
	}

	/**
	 * ChkUpd2_Chk0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd2_Chk0L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
	}

	/**
	 * ChkUpd2_Upd0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd2_Upd0R(){
		return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
	}

	/**
	 * ChkUpd2_Upd0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd2_Upd0L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArrSchd_Upd01オペレーション.<p>
	 *
	 * 更新（入荷進捗・予定）を行います。<br>
	 */
	abstract public class ArrSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrPr_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR createArrPr_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.create();
		}

		/**
		 * ArrPr_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> createArrPr_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
		}

		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>arr_pr.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rcpt_iv_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.std_purc_lt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_mng_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_mng_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.re_arr_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcact_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>no_cred_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ArrSchd_Upd02オペレーション.<p>
	 *
	 * 更新（予定・実績）を行います。<br>
	 */
	abstract public class ArrSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_arract_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcact_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ArrSchd_Upd03オペレーション.<p>
	 *
	 * 更新（仕入・売上返品）を行います。<br>
	 */
	abstract public class ArrSchd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		
		
		// コンストラクタ
		protected ArrSchd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcact_srv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ArrSchd_Upd04オペレーション.<p>
	 *
	 * 入荷予定の納品書ＮＯを更新します。<br>
	 */
	abstract public class ArrSchd_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		
		
		// コンストラクタ
		protected ArrSchd_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ArrSchd_Chk01オペレーション.<p>
	 *
	 * 更新（入荷進捗・予定）前チェックを行います。<br>
	 */
	abstract public class ArrSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.re_arr_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcact_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ArrSchd_Chk02オペレーション.<p>
	 *
	 * 更新（予定・実績）前チェックを行います。<br>
	 */
	abstract public class ArrSchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrSchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrSchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createArrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ArrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createArrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_arract_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcact_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_purcdlvadjst_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ChkUpd1オペレーション.<p>
	 *
	 * Chk01->Upd01（単層実行テスト用）<br>
	 */
	abstract public class ChkUpd1 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ChkUpd1";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down1;
		
		
		// コンストラクタ
		protected ChkUpd1() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ChkUpd1_Chk0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd1_Chk0R(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ChkUpd1_Chk0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd1_Chk0L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		/**
		 * ChkUpd1_Upd0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR createChkUpd1_Upd0R(){
			return mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.create();
		}

		/**
		 * ChkUpd1_Upd0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> createChkUpd1_Upd0L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR.class);
		}

		/**
		 * ChkUpd1_Upd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd1_Upd1R(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ChkUpd1_Upd1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd1_Upd1L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.dlv_inst_prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.std_purc_lt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_pr.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrPr_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.re_arr_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}
	/**
	 * ChkUpd2オペレーション.<p>
	 *
	 * Chk02->Upd02（単層実行テスト用）<br>
	 */
	abstract public class ChkUpd2 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ChkUpd2";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down1;
		
		
		// コンストラクタ
		protected ChkUpd2() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);

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
			invoke((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ChkUpd2_Chk0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd2_Chk0R(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ChkUpd2_Chk0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd2_Chk0L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		/**
		 * ChkUpd2_Upd0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR createChkUpd2_Upd0R(){
			return mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.create();
		}

		/**
		 * ChkUpd2_Upd0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> createChkUpd2_Upd0L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.pre_mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> up1() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5900.ArrSchd_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrSchdService)MSBEL_ArrSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}