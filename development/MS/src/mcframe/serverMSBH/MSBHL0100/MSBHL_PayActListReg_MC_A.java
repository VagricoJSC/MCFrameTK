package mcframe.serverMSBH.MSBHL0100;

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
 * "MSBHL_PayActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PayActListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PayActListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0100_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PayActListReg)this).new Srch01();
	}

	public static MSBHL_PayActListReg.Srch01 crtSrch01() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
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
	public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch01_RsltR.class);
	}
	protected MSBHL_PayActListReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBHL0100_Srch02_INFO;
		this.aSrch02 = ((MSBHL_PayActListReg)this).new Srch02();
	}

	public static MSBHL_PayActListReg.Srch02 crtSrch02() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);
	}
	protected MSBHL_PayActListReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBHL0100_Srch03_INFO;
		this.aSrch03 = ((MSBHL_PayActListReg)this).new Srch03();
	}

	public static MSBHL_PayActListReg.Srch03 crtSrch03() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch03_CndR(){
		return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
	}

	/**
	 * Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Srch02_RsltR createSrch03_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.create();
	}

	/**
	 * Srch03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> createSrch03_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);
	}
	protected MSBHL_PayActListReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHL0100_Ins01_INFO;
		this.aIns01 = ((MSBHL_PayActListReg)this).new Ins01();
	}

	public static MSBHL_PayActListReg.Ins01 crtIns01() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addDownBlock(aIns01.down0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Ins01_RsltR createIns01_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.class);
	}
	protected MSBHL_PayActListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBHL0100_Del01_INFO;
		this.aDel01 = ((MSBHL_PayActListReg)this).new Del01();
	}

	public static MSBHL_PayActListReg.Del01 crtDel01() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Del01_RsltR createDel01_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Del01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Del01_RsltR.class);
	}
	protected MSBHL_PayActListReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBHL0100_Prnt01_INFO;
		this.aPrnt01 = ((MSBHL_PayActListReg)this).new Prnt01();
	}

	public static MSBHL_PayActListReg.Prnt01 crtPrnt01() {
		MSBHL_PayActListReg lgc = new MSBHL_PayActListReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払予定を検索する<br>
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
		private final mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Srch01_RsltR.class);

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0100.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払実績を検索する<br>
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
		private final mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inc_can_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_schd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_sw_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0100.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_flg</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>sw_to_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>multi_act_d_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 支払実績を検索する<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR createSrch03_CndR(){
			return mcframe.serverMSBH.MSBHL0100.Srch01_CndR.create();
		}

		/**
		 * Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch02_RsltR createSrch03_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.create();
		}

		/**
		 * Srch03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> createSrch03_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0100.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_to_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>sw_to_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>multi_act_d_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL0100.Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績を登録する<br>
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
		private final MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> down0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.class);

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Ins01_RsltR createIns01_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Ins01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Ins01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払実績を取り消す<br>
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
		private final MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Del01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Del01_RsltR.class);

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Del01_RsltR createDel01_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Del01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Del01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Del01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR up1;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR.class);
			up1 = mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR.create();

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
			invoke((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0100.Prnt01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL0100.Prnt01_HdrR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayActListReg)MSBHL_PayActListReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}