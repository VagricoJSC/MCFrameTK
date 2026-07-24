package mcframe.serverMSBE.MSBEL5020;

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
 * "MSBEL_IoSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_IoSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_IoSchdService.IoSchd_Ins01 aIoSchd_Ins01;

	protected void initIoSchd_Ins01() {
		this.info = PDef.MS_MSBEL5020_IoSchd_Ins01_INFO;
		this.aIoSchd_Ins01 = ((MSBEL_IoSchdService)this).new IoSchd_Ins01();
	}

	public static MSBEL_IoSchdService.IoSchd_Ins01 crtIoSchd_Ins01() {
		MSBEL_IoSchdService lgc = new MSBEL_IoSchdService();
		lgc.initIoSchd_Ins01();
		return lgc.aIoSchd_Ins01;
	}

	protected void paramIoSchd_Ins01(MCParam p) {
		if (this.aIoSchd_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIoSchd_Ins01.up0());
	}

	protected void doIoSchd_Ins01() {
		aIoSchd_Ins01.call();
	};

	/**
	 * IoSchd_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR createIoSchd_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.create();
	}

	/**
	 * IoSchd_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> createIoSchd_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.class);
	}
	protected MSBEL_IoSchdService.IoSchd_Del01 aIoSchd_Del01;

	protected void initIoSchd_Del01() {
		this.info = PDef.MS_MSBEL5020_IoSchd_Del01_INFO;
		this.aIoSchd_Del01 = ((MSBEL_IoSchdService)this).new IoSchd_Del01();
	}

	public static MSBEL_IoSchdService.IoSchd_Del01 crtIoSchd_Del01() {
		MSBEL_IoSchdService lgc = new MSBEL_IoSchdService();
		lgc.initIoSchd_Del01();
		return lgc.aIoSchd_Del01;
	}

	protected void paramIoSchd_Del01(MCParam p) {
		if (this.aIoSchd_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIoSchd_Del01.up0());
	}

	protected void doIoSchd_Del01() {
		aIoSchd_Del01.call();
	};

	/**
	 * IoSchd_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createIoSchd_Del01_CndR(){
		return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
	}

	/**
	 * IoSchd_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createIoSchd_Del01_CndL(){
		return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
	}
	protected MSBEL_IoSchdService.IoSchd_Del02 aIoSchd_Del02;

	protected void initIoSchd_Del02() {
		this.info = PDef.MS_MSBEL5020_IoSchd_Del02_INFO;
		this.aIoSchd_Del02 = ((MSBEL_IoSchdService)this).new IoSchd_Del02();
	}

	public static MSBEL_IoSchdService.IoSchd_Del02 crtIoSchd_Del02() {
		MSBEL_IoSchdService lgc = new MSBEL_IoSchdService();
		lgc.initIoSchd_Del02();
		return lgc.aIoSchd_Del02;
	}

	protected void paramIoSchd_Del02(MCParam p) {
		if (this.aIoSchd_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIoSchd_Del02.up0());
		p.addUpBlock(aIoSchd_Del02.up1());
	}

	protected void doIoSchd_Del02() {
		aIoSchd_Del02.call();
	};

	/**
	 * IoSchd_Del02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createIoSchd_Del02_CndR(){
		return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
	}

	/**
	 * IoSchd_Del02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createIoSchd_Del02_CndL(){
		return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
	}

	/**
	 * IoSchd_Del02_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R createIoSchd_Del02_Cnd2R(){
		return mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R.create();
	}

	/**
	 * IoSchd_Del02_Cnd2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R> createIoSchd_Del02_Cnd2L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R.class);
	}
	protected MSBEL_IoSchdService.IoSchd_Upd01 aIoSchd_Upd01;

	protected void initIoSchd_Upd01() {
		this.info = PDef.MS_MSBEL5020_IoSchd_Upd01_INFO;
		this.aIoSchd_Upd01 = ((MSBEL_IoSchdService)this).new IoSchd_Upd01();
	}

	public static MSBEL_IoSchdService.IoSchd_Upd01 crtIoSchd_Upd01() {
		MSBEL_IoSchdService lgc = new MSBEL_IoSchdService();
		lgc.initIoSchd_Upd01();
		return lgc.aIoSchd_Upd01;
	}

	protected void paramIoSchd_Upd01(MCParam p) {
		if (this.aIoSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIoSchd_Upd01.up0());
	}

	protected void doIoSchd_Upd01() {
		aIoSchd_Upd01.call();
	};

	/**
	 * IoSchd_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR createIoSchd_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR.create();
	}

	/**
	 * IoSchd_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR> createIoSchd_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * IoSchd_Ins01オペレーション.<p>
	 *
	 * 受払予定にデータを追加する<br>
	 */
	abstract public class IoSchd_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoSchd_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> up0;
		
		
		// コンストラクタ
		protected IoSchd_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.class);

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
			invoke((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoSchd_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR createIoSchd_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.create();
		}

		/**
		 * IoSchd_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> createIoSchd_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_typ1</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_no1</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_seq1</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_typ2</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_no2</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_seq2</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_typ3</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_no3</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_seq3</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_typ4</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_no4</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_sub_seq4</td></tr>
		 * 	<tr><td><br></td><td>io_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ex_cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this).info;
		}


	}
	/**
	 * IoSchd_Del01オペレーション.<p>
	 *
	 * 受払予定のデータを削除する<br>
	 */
	abstract public class IoSchd_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoSchd_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up0;
		
		
		// コンストラクタ
		protected IoSchd_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);

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
			invoke((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoSchd_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createIoSchd_Del01_CndR(){
			return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
		}

		/**
		 * IoSchd_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createIoSchd_Del01_CndL(){
			return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this).info;
		}


	}
	/**
	 * IoSchd_Del02オペレーション.<p>
	 *
	 * 受払予定のデータを予備区分、予備ＮＯを使用して削除する<br>
	 */
	abstract public class IoSchd_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoSchd_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R> up1;
		
		
		// コンストラクタ
		protected IoSchd_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoSchd_Del02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createIoSchd_Del02_CndR(){
			return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
		}

		/**
		 * IoSchd_Del02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createIoSchd_Del02_CndL(){
			return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
		}

		/**
		 * IoSchd_Del02_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R createIoSchd_Del02_Cnd2R(){
			return mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R.create();
		}

		/**
		 * IoSchd_Del02_Cnd2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R> createIoSchd_Del02_Cnd2L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Del02_Cnd2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this).info;
		}


	}
	/**
	 * IoSchd_Upd01オペレーション.<p>
	 *
	 * 受払予定データの状況や日付を更新する<br>
	 */
	abstract public class IoSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected IoSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR.class);

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
			invoke((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoSchd_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR createIoSchd_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR.create();
		}

		/**
		 * IoSchd_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR> createIoSchd_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>upd_io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_insp_cmpl_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoSchdService)MSBEL_IoSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}