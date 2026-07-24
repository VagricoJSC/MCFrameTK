package mcframe.serverMGBG.MGBGL0110;

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
 * "MGBGL_PreRateTermReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_PreRateTermReg_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGL0110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_PreRateTermReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBGL0110_Srch01_INFO;
		this.aSrch01 = ((MGBGL_PreRateTermReg)this).new Srch01();
	}

	public static MGBGL_PreRateTermReg.Srch01 crtSrch01() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
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
	public mcframe.serverMGBG.MGBGL0110.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBG.MGBGL0110.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Srch01_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBGL0110_Chk01_INFO;
		this.aChk01 = ((MGBGL_PreRateTermReg)this).new Chk01();
	}

	public static MGBGL_PreRateTermReg.Chk01 crtChk01() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBGL0110_Chk02_INFO;
		this.aChk02 = ((MGBGL_PreRateTermReg)this).new Chk02();
	}

	public static MGBGL_PreRateTermReg.Chk02 crtChk02() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBGL0110_Chk03_INFO;
		this.aChk03 = ((MGBGL_PreRateTermReg)this).new Chk03();
	}

	public static MGBGL_PreRateTermReg.Chk03 crtChk03() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addDownBlock(aChk03.down0());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Chk03_RsltR createChk03_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.create();
	}

	/**
	 * Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> createChk03_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBGL0110_Ins01_INFO;
		this.aIns01 = ((MGBGL_PreRateTermReg)this).new Ins01();
	}

	public static MGBGL_PreRateTermReg.Ins01 crtIns01() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBGL0110_Upd01_INFO;
		this.aUpd01 = ((MGBGL_PreRateTermReg)this).new Upd01();
	}

	public static MGBGL_PreRateTermReg.Upd01 crtUpd01() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0110.Chk02_RsltR createUpd01_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
	}
	protected MGBGL_PreRateTermReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBGL0110_Del01_INFO;
		this.aDel01 = ((MGBGL_PreRateTermReg)this).new Del01();
	}

	public static MGBGL_PreRateTermReg.Del01 crtDel01() {
		MGBGL_PreRateTermReg lgc = new MGBGL_PreRateTermReg();
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
	public mcframe.serverMGBG.MGBGL0110.Chk03_RsltR createDel01_RsltR(){
		return mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBG.MGBGL0110.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0110.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Srch01_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBG.MGBGL0110.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0110.Srch01_CndR
		 */
		public mcframe.serverMGBG.MGBGL0110.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>adj_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録する前のチェックを行う<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 訂正する前のチェックを行う<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
	 */
	abstract public class Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk03_RsltR createChk03_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.create();
		}

		/**
		 * Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> createChk03_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 登録処理をする<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 訂正処理をする<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk02_RsltR createUpd01_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate</td></tr>
		 * 	<tr><td><br></td><td>dbc.adj_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> up0() {
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
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);

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
			invoke((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0110.Chk03_RsltR createDel01_RsltR(){
			return mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0110.Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno3</td></tr>
		 * 	<tr><td><br></td><td>dbc.sno4</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.po_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> up0() {
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
		public MCList<mcframe.serverMGBG.MGBGL0110.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateTermReg)MGBGL_PreRateTermReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}