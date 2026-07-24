package mcframe.serverMGBB.MGBBL0370;

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
 * "MGBBL_ActSlsIfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBL_ActSlsIfReg_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBBL0370";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBL_ActSlsIfReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBBL0370_Srch01_INFO;
		this.aSrch01 = ((MGBBL_ActSlsIfReg)this).new Srch01();
	}

	public static MGBBL_ActSlsIfReg.Srch01 crtSrch01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	public mcframe.serverMGBB.MGBBL0370.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBB.MGBBL0370.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Srch01_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBBL0370_Chk01_INFO;
		this.aChk01 = ((MGBBL_ActSlsIfReg)this).new Chk01();
	}

	public static MGBBL_ActSlsIfReg.Chk01 crtChk01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
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
	public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR createChk01_CtrlR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR.create();
	}
	protected MGBBL_ActSlsIfReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBBL0370_Chk02_INFO;
		this.aChk02 = ((MGBBL_ActSlsIfReg)this).new Chk02();
	}

	public static MGBBL_ActSlsIfReg.Chk02 crtChk02() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	public mcframe.serverMGBB.MGBBL0370.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBBL0370_Chk03_INFO;
		this.aChk03 = ((MGBBL_ActSlsIfReg)this).new Chk03();
	}

	public static MGBBL_ActSlsIfReg.Chk03 crtChk03() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	 * Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createChk03_CndR(){
		return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
	}
	protected MGBBL_ActSlsIfReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MG_MGBBL0370_Imp01_INFO;
		this.aImp01 = ((MGBBL_ActSlsIfReg)this).new Imp01();
	}

	public static MGBBL_ActSlsIfReg.Imp01 crtImp01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addDownBlock(aImp01.down0());
	}

	protected void doImp01() {
		aImp01.call();
	};

	/**
	 * Imp01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createImp01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
	}

	/**
	 * Imp01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createImp01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBBL0370_Upd01_INFO;
		this.aUpd01 = ((MGBBL_ActSlsIfReg)this).new Upd01();
	}

	public static MGBBL_ActSlsIfReg.Upd01 crtUpd01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBBL0370_Del01_INFO;
		this.aDel01 = ((MGBBL_ActSlsIfReg)this).new Del01();
	}

	public static MGBBL_ActSlsIfReg.Del01 crtDel01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	public mcframe.serverMGBB.MGBBL0370.Chk02_RsltR createDel01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MG_MGBBL0370_Del02_INFO;
		this.aDel02 = ((MGBBL_ActSlsIfReg)this).new Del02();
	}

	public static MGBBL_ActSlsIfReg.Del02 crtDel02() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel02.up0());
	}

	protected void doDel02() {
		aDel02.call();
	};

	/**
	 * Del02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createDel02_CndR(){
		return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
	}
	protected MGBBL_ActSlsIfReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBBL0370_Ins01_INFO;
		this.aIns01 = ((MGBBL_ActSlsIfReg)this).new Ins01();
	}

	public static MGBBL_ActSlsIfReg.Ins01 crtIns01() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
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
	public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
	}
	protected MGBBL_ActSlsIfReg.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MG_MGBBL0370_Ins02_INFO;
		this.aIns02 = ((MGBBL_ActSlsIfReg)this).new Ins02();
	}

	public static MGBBL_ActSlsIfReg.Ins02 crtIns02() {
		MGBBL_ActSlsIfReg lgc = new MGBBL_ActSlsIfReg();
		lgc.initIns02();
		return lgc.aIns02;
	}

	protected void paramIns02(MCParam p) {
		if (this.aIns02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns02.up0());
		p.addUpBlock(aIns02.up1());
	}

	protected void doIns02() {
		aIns02.call();
	};

	/**
	 * Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createIns02_CndR(){
		return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
	}

	/**
	 * Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createIns02_RsltR(){
		return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
	}

	/**
	 * Ins02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createIns02_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
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
		private final mcframe.serverMGBB.MGBBL0370.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0370.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Srch01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBB.MGBBL0370.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
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
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>no_ac_rsn_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_area_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_area_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_area_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_area_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>no_slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>no_iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>no_stk_bp_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm5</td></tr>
		 * 	<tr><td><br></td><td>rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Srch01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0370.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm5</td></tr>
		 * 	<tr><td><br></td><td>alc_val1</td></tr>
		 * 	<tr><td><br></td><td>alc_val2</td></tr>
		 * 	<tr><td><br></td><td>alc_val3</td></tr>
		 * 	<tr><td><br></td><td>alc_val4</td></tr>
		 * 	<tr><td><br></td><td>alc_val5</td></tr>
		 * 	<tr><td><br></td><td>rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>rec_eval_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>slip_seq_no</td></tr>
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
		public MCList<mcframe.serverMGBB.MGBBL0370.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う<br>
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
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
			up1 = mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR createChk01_CtrlR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>file_ins_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_CtrlR up1() {
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
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
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
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 一括削除する前のチェックを行う<br>
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
		private final mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0370.Chk03_CndR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createChk03_CndR(){
			return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Chk03_CndR
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Chk03_CndR
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力処理をする<br>
	 */
	abstract public class Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createImp01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
		}

		/**
		 * Imp01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createImp01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm1</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm2</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm3</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm4</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm5</td></tr>
		 * 	<tr><td><br></td><td>rec_eval_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録・訂正処理をする<br>
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
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0() {
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
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
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
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk02_RsltR createDel01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> up0() {
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
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 一括削除処理をする<br>
	 */
	abstract public class Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createDel02_CndR(){
			return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Chk03_CndR
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイル取込処理をする<br>
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
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 一括削除後ファイル取込処理をする<br>
	 */
	abstract public class Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up1;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);

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
			invoke((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR createIns02_CndR(){
			return mcframe.serverMGBB.MGBBL0370.Chk03_CndR.create();
		}

		/**
		 * Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk01_RsltR createIns02_RsltR(){
			return mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.create();
		}

		/**
		 * Ins02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> createIns02_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0370.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0370.Chk03_CndR
		 */
		public mcframe.serverMGBB.MGBBL0370.Chk03_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dbc.mng_dpt_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.asst_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>dbc.xrate</td></tr>
		 * 	<tr><td><br></td><td>dbc.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.slo_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.iv_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd1</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd2</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd3</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd4</td></tr>
		 * 	<tr><td><br></td><td>dbc.cost_sls_cd5</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val1</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val2</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val4</td></tr>
		 * 	<tr><td><br></td><td>dbc.alc_val5</td></tr>
		 * 	<tr><td><br></td><td>dbc.rec_eval_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_itm_info_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.no_eval_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.zero_effect_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.slip_seq_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0370.Chk01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_ActSlsIfReg)MGBBL_ActSlsIfReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}