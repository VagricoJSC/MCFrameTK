package mcframe.serverMSBG.MSBGL5180;

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
 * "MSBGL_RcvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_RcvRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5180";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_RcvRegService.Rcv_Chk01 aRcv_Chk01;

	protected void initRcv_Chk01() {
		this.info = PDef.MS_MSBGL5180_Rcv_Chk01_INFO;
		this.aRcv_Chk01 = ((MSBGL_RcvRegService)this).new Rcv_Chk01();
	}

	public static MSBGL_RcvRegService.Rcv_Chk01 crtRcv_Chk01() {
		MSBGL_RcvRegService lgc = new MSBGL_RcvRegService();
		lgc.initRcv_Chk01();
		return lgc.aRcv_Chk01;
	}

	protected void paramRcv_Chk01(MCParam p) {
		if (this.aRcv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcv_Chk01.up0());
		p.addDownBlock(aRcv_Chk01.down0());
	}

	protected void doRcv_Chk01() {
		aRcv_Chk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
	}

	/**
	 * Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createChk01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
	}
	protected MSBGL_RcvRegService.Rcv_Chk02 aRcv_Chk02;

	protected void initRcv_Chk02() {
		this.info = PDef.MS_MSBGL5180_Rcv_Chk02_INFO;
		this.aRcv_Chk02 = ((MSBGL_RcvRegService)this).new Rcv_Chk02();
	}

	public static MSBGL_RcvRegService.Rcv_Chk02 crtRcv_Chk02() {
		MSBGL_RcvRegService lgc = new MSBGL_RcvRegService();
		lgc.initRcv_Chk02();
		return lgc.aRcv_Chk02;
	}

	protected void paramRcv_Chk02(MCParam p) {
		if (this.aRcv_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcv_Chk02.up0());
		p.addDownBlock(aRcv_Chk02.down0());
	}

	protected void doRcv_Chk02() {
		aRcv_Chk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
	}

	/**
	 * Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createChk02_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
	}
	protected MSBGL_RcvRegService.Rcv_Ins01 aRcv_Ins01;

	protected void initRcv_Ins01() {
		this.info = PDef.MS_MSBGL5180_Rcv_Ins01_INFO;
		this.aRcv_Ins01 = ((MSBGL_RcvRegService)this).new Rcv_Ins01();
	}

	public static MSBGL_RcvRegService.Rcv_Ins01 crtRcv_Ins01() {
		MSBGL_RcvRegService lgc = new MSBGL_RcvRegService();
		lgc.initRcv_Ins01();
		return lgc.aRcv_Ins01;
	}

	protected void paramRcv_Ins01(MCParam p) {
		if (this.aRcv_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcv_Ins01.up0());
		p.addDownBlock(aRcv_Ins01.down0());
	}

	protected void doRcv_Ins01() {
		aRcv_Ins01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
	}

	/**
	 * Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createIns01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
	}
	protected MSBGL_RcvRegService.Rcv_Upd01 aRcv_Upd01;

	protected void initRcv_Upd01() {
		this.info = PDef.MS_MSBGL5180_Rcv_Upd01_INFO;
		this.aRcv_Upd01 = ((MSBGL_RcvRegService)this).new Rcv_Upd01();
	}

	public static MSBGL_RcvRegService.Rcv_Upd01 crtRcv_Upd01() {
		MSBGL_RcvRegService lgc = new MSBGL_RcvRegService();
		lgc.initRcv_Upd01();
		return lgc.aRcv_Upd01;
	}

	protected void paramRcv_Upd01(MCParam p) {
		if (this.aRcv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcv_Upd01.up0());
	}

	protected void doRcv_Upd01() {
		aRcv_Upd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
	}

	/**
	 * Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createUpd01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
	}
	protected MSBGL_RcvRegService.Rcv_Del01 aRcv_Del01;

	protected void initRcv_Del01() {
		this.info = PDef.MS_MSBGL5180_Rcv_Del01_INFO;
		this.aRcv_Del01 = ((MSBGL_RcvRegService)this).new Rcv_Del01();
	}

	public static MSBGL_RcvRegService.Rcv_Del01 crtRcv_Del01() {
		MSBGL_RcvRegService lgc = new MSBGL_RcvRegService();
		lgc.initRcv_Del01();
		return lgc.aRcv_Del01;
	}

	protected void paramRcv_Del01(MCParam p) {
		if (this.aRcv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcv_Del01.up0());
	}

	protected void doRcv_Del01() {
		aRcv_Del01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
	}

	/**
	 * Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createDel01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Rcv_Chk01オペレーション.<p>
	 *
	 * 入金を登録・訂正する前のチェックをする<br>
	 */
	abstract public class Rcv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rcv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected Rcv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);

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
			invoke((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
		}

		/**
		 * Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createChk01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>fb_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>fb_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this).info;
		}


	}
	/**
	 * Rcv_Chk02オペレーション.<p>
	 *
	 * 入金を取り消す前のチェックをする<br>
	 */
	abstract public class Rcv_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rcv_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> down0;
		
		
		// コンストラクタ
		protected Rcv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);

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
			invoke((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
		}

		/**
		 * Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createChk02_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this).info;
		}


	}
	/**
	 * Rcv_Ins01オペレーション.<p>
	 *
	 * 入金を登録する<br>
	 */
	abstract public class Rcv_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rcv_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected Rcv_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);

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
			invoke((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
		}

		/**
		 * Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createIns01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>fb_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>dat_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this).info;
		}


	}
	/**
	 * Rcv_Upd01オペレーション.<p>
	 *
	 * 入金を訂正する<br>
	 */
	abstract public class Rcv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rcv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0;
		
		
		// コンストラクタ
		protected Rcv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);

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
			invoke((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
		}

		/**
		 * Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createUpd01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this).info;
		}


	}
	/**
	 * Rcv_Del01オペレーション.<p>
	 *
	 * 入金を取り消す<br>
	 */
	abstract public class Rcv_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rcv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> up0;
		
		
		// コンストラクタ
		protected Rcv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);

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
			invoke((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
		}

		/**
		 * Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createDel01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvRegService)MSBGL_RcvRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}