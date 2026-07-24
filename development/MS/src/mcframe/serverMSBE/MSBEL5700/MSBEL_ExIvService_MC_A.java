package mcframe.serverMSBE.MSBEL5700;

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
 * "MSBEL_ExIvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ExIvService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5700";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ExIvService.ExIv_Upd01 aExIv_Upd01;

	protected void initExIv_Upd01() {
		this.info = PDef.MS_MSBEL5700_ExIv_Upd01_INFO;
		this.aExIv_Upd01 = ((MSBEL_ExIvService)this).new ExIv_Upd01();
	}

	public static MSBEL_ExIvService.ExIv_Upd01 crtExIv_Upd01() {
		MSBEL_ExIvService lgc = new MSBEL_ExIvService();
		lgc.initExIv_Upd01();
		return lgc.aExIv_Upd01;
	}

	protected void paramExIv_Upd01(MCParam p) {
		if (this.aExIv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExIv_Upd01.up0());
		p.addUpBlock(aExIv_Upd01.up1());
	}

	protected void doExIv_Upd01() {
		aExIv_Upd01.call();
	};

	/**
	 * ExIv_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR createExIv_HdrR(){
		return mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
	}

	/**
	 * ExIv_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MST_IV_D_R createExIv_DtlR(){
		return mcframe.serverMS.dbc.MST_IV_D_R.create();
	}

	/**
	 * ExIv_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MST_IV_D_R> createExIv_DtlL(){
		return MCList.create(mcframe.serverMS.dbc.MST_IV_D_R.class);
	}
	protected MSBEL_ExIvService.ExIv_Chk01 aExIv_Chk01;

	protected void initExIv_Chk01() {
		this.info = PDef.MS_MSBEL5700_ExIv_Chk01_INFO;
		this.aExIv_Chk01 = ((MSBEL_ExIvService)this).new ExIv_Chk01();
	}

	public static MSBEL_ExIvService.ExIv_Chk01 crtExIv_Chk01() {
		MSBEL_ExIvService lgc = new MSBEL_ExIvService();
		lgc.initExIv_Chk01();
		return lgc.aExIv_Chk01;
	}

	protected void paramExIv_Chk01(MCParam p) {
		if (this.aExIv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExIv_Chk01.up0());
		p.addDownBlock(aExIv_Chk01.down0());
	}

	protected void doExIv_Chk01() {
		aExIv_Chk01.call();
	};
	protected MSBEL_ExIvService.ExIv_Del01 aExIv_Del01;

	protected void initExIv_Del01() {
		this.info = PDef.MS_MSBEL5700_ExIv_Del01_INFO;
		this.aExIv_Del01 = ((MSBEL_ExIvService)this).new ExIv_Del01();
	}

	public static MSBEL_ExIvService.ExIv_Del01 crtExIv_Del01() {
		MSBEL_ExIvService lgc = new MSBEL_ExIvService();
		lgc.initExIv_Del01();
		return lgc.aExIv_Del01;
	}

	protected void paramExIv_Del01(MCParam p) {
		if (this.aExIv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExIv_Del01.up0());
	}

	protected void doExIv_Del01() {
		aExIv_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ExIv_Upd01オペレーション.<p>
	 *
	 * インボイスにデータを登録する。<br>
	 */
	abstract public class ExIv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExIv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MST_IV_D_R> up1;
		
		
		// コンストラクタ
		protected ExIv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
			up1 = MCList.create(mcframe.serverMS.dbc.MST_IV_D_R.class);

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
			invoke((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExIv_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR createExIv_HdrR(){
			return mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
		}

		/**
		 * ExIv_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MST_IV_D_R createExIv_DtlR(){
			return mcframe.serverMS.dbc.MST_IV_D_R.create();
		}

		/**
		 * ExIv_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MST_IV_D_R> createExIv_DtlL(){
			return MCList.create(mcframe.serverMS.dbc.MST_IV_D_R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv.iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>iv.load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.etd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.eta_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv.pre_rcpt_iv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5700.ExIv_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MST_IV_D_R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this).info;
		}


	}
	/**
	 * ExIv_Chk01オペレーション.<p>
	 *
	 * 削除対象のインボイスをチェックする。<br>
	 */
	abstract public class ExIv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExIv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5700.ExIv_HdrR down0;
		
		
		// コンストラクタ
		protected ExIv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
			down0 = mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();

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
			invoke((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExIv_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR createExIv_HdrR(){
			return mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5700.ExIv_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0() {
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
		 * @see mcframe.serverMSBE.MSBEL5700.ExIv_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this).info;
		}


	}
	/**
	 * ExIv_Del01オペレーション.<p>
	 *
	 * インボイスからデータを削除する。<br>
	 */
	abstract public class ExIv_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExIv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0;
		
		
		// コンストラクタ
		protected ExIv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();

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
			invoke((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExIv_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR createExIv_HdrR(){
			return mcframe.serverMSBE.MSBEL5700.ExIv_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5700.ExIv_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5700.ExIv_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExIvService)MSBEL_ExIvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}