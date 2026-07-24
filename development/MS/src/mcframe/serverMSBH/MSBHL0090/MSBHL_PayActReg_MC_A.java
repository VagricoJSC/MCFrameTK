package mcframe.serverMSBH.MSBHL0090;

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
 * "MSBHL_PayActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PayActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL0090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PayActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0090_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PayActReg)this).new Srch01();
	}

	public static MSBHL_PayActReg.Srch01 crtSrch01() {
		MSBHL_PayActReg lgc = new MSBHL_PayActReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0090.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBH.MSBHL0090.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);
	}
	protected MSBHL_PayActReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBHL0090_Srch02_INFO;
		this.aSrch02 = ((MSBHL_PayActReg)this).new Srch02();
	}

	public static MSBHL_PayActReg.Srch02 crtSrch02() {
		MSBHL_PayActReg lgc = new MSBHL_PayActReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addUpBlock(aSrch02.up1());
		p.addDownBlock(aSrch02.down0());
		p.addDownBlock(aSrch02.down1());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBH.MSBHL0090.Srch02_CndR.create();
	}

	/**
	 * Srch02_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R createSrch02_Cnd2R(){
		return mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R.create();
	}

	/**
	 * Srch02_Cnd2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R> createSrch02_Cnd2L(){
		return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R.class);
	}

	/**
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch02_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBH.MSBHL0090.Srch02_HdrR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0090.Srch01_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);
	}
	protected MSBHL_PayActReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHL0090_Ins01_INFO;
		this.aIns01 = ((MSBHL_PayActReg)this).new Ins01();
	}

	public static MSBHL_PayActReg.Ins01 crtIns01() {
		MSBHL_PayActReg lgc = new MSBHL_PayActReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
	}
	protected MSBHL_PayActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBHL0090_Upd01_INFO;
		this.aUpd01 = ((MSBHL_PayActReg)this).new Upd01();
	}

	public static MSBHL_PayActReg.Upd01 crtUpd01() {
		MSBHL_PayActReg lgc = new MSBHL_PayActReg();
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
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
	}
	protected MSBHL_PayActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBHL0090_Del01_INFO;
		this.aDel01 = ((MSBHL_PayActReg)this).new Del01();
	}

	public static MSBHL_PayActReg.Del01 crtDel01() {
		MSBHL_PayActReg lgc = new MSBHL_PayActReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createDel01_DtlR(){
		return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払実績を検索する。<br>
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
		private final mcframe.serverMSBH.MSBHL0090.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0090.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0090.Srch01_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL0090.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0090.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBH.MSBHL0090.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0090.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0090.Srch01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>check</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>appl_ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払予定を検索する。<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0090.Srch02_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0090.Srch02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> down1;
		
		/**
		 * 連携情報 MSBHL5030<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 （{@link #Srch03}）<br>
		 */
		public final String MSBHL5030 = "MSBHL5030";

		/**
		 * 連携オペレーション Srch03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03}<br>
		 */
		public final mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 Srch03;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0090.Srch02_CndR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R.class);
			down0 = mcframe.serverMSBH.MSBHL0090.Srch02_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			Srch03 = mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.crtPaySchd_Srch03();
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5030, Srch03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5030<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5030)) {
				up_MSBHL5030();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5030<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5030)) {
				down_MSBHL5030();
			}
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
			invoke((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBH.MSBHL0090.Srch02_CndR.create();
		}

		/**
		 * Srch02_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R createSrch02_Cnd2R(){
			return mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R.create();
		}

		/**
		 * Srch02_Cnd2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R> createSrch02_Cnd2L(){
			return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R.class);
		}

		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch02_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBH.MSBHL0090.Srch02_HdrR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch01_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0090.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_narrow_down_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_narrow_down_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0090.Srch02_CndR
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch02_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch02_Cnd2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0090.Srch02_HdrR
		 */
		public mcframe.serverMSBH.MSBHL0090.Srch02_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>check</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>appl_ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0090.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this).info;
		}

		//-----------------------MSBHL5030専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5030の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5030(){
		}

		//-----------------------MSBHL5030専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5030の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5030(){
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績を登録する。<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
			down0 = mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);

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
			invoke((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pa.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支払実績を更新する。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
			down0 = mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);

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
			invoke((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.xrate</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pa.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pad.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pad.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pad.ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払実績を取り消す。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);

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
			invoke((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR.create();
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR createDel01_DtlR(){
			return mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pa.pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pad.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActReg)MSBHL_PayActReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}