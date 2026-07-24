package mcframe.serverMSBE.MSBEL2000;

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
 * "MSBEL_ArrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ArrActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL2000";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ArrActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL2000_Srch01_INFO;
		this.aSrch01 = ((MSBEL_ArrActReg)this).new Srch01();
	}

	public static MSBEL_ArrActReg.Srch01 crtSrch01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
	}
	protected MSBEL_ArrActReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBEL2000_Srch02_INFO;
		this.aSrch02 = ((MSBEL_ArrActReg)this).new Srch02();
	}

	public static MSBEL_ArrActReg.Srch02 crtSrch02() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch02_CndR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
	}
	protected MSBEL_ArrActReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBEL2000_Srch03_INFO;
		this.aSrch03 = ((MSBEL_ArrActReg)this).new Srch03();
	}

	public static MSBEL_ArrActReg.Srch03 crtSrch03() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch03_CndR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
	}

	/**
	 * Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch03_RsltR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
	}

	/**
	 * Srch03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch03_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
	}
	protected MSBEL_ArrActReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL2000_Chk01_INFO;
		this.aChk01 = ((MSBEL_ArrActReg)this).new Chk01();
	}

	public static MSBEL_ArrActReg.Chk01 crtChk01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createChk01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}
	protected MSBEL_ArrActReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL2000_Chk02_INFO;
		this.aChk02 = ((MSBEL_ArrActReg)this).new Chk02();
	}

	public static MSBEL_ArrActReg.Chk02 crtChk02() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
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
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createChk02_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Chk02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createChk02_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}
	protected MSBEL_ArrActReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBEL2000_Ins01_INFO;
		this.aIns01 = ((MSBEL_ArrActReg)this).new Ins01();
	}

	public static MSBEL_ArrActReg.Ins01 crtIns01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Ins01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createIns01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}
	protected MSBEL_ArrActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL2000_Upd01_INFO;
		this.aUpd01 = ((MSBEL_ArrActReg)this).new Upd01();
	}

	public static MSBEL_ArrActReg.Upd01 crtUpd01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createUpd01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}
	protected MSBEL_ArrActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL2000_Del01_INFO;
		this.aDel01 = ((MSBEL_ArrActReg)this).new Del01();
	}

	public static MSBEL_ArrActReg.Del01 crtDel01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
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
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createDel01_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createDel01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}
	protected MSBEL_ArrActReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBEL2000_Imp01_INFO;
		this.aImp01 = ((MSBEL_ArrActReg)this).new Imp01();
	}

	public static MSBEL_ArrActReg.Imp01 crtImp01() {
		MSBEL_ArrActReg lgc = new MSBEL_ArrActReg();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addUpBlock(aImp01.up1());
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
	public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createImp01_RsltR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
	}

	/**
	 * Imp01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createImp01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
	}

	/**
	 * Imp01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createImp01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入荷予定を検索する。<br>
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
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入荷実績を検索する。<br>
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
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch02_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_done_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_temp_ent_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 入荷予定および入荷実績を検索する。<br>
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
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createSrch03_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createSrch03_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * Srch03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createSrch03_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_done_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_temp_ent_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
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
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入荷実績を登録・訂正するために、チェックを行う<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		/**
		 * 連携情報 AA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01 （{@link #v0}）<br>
		 */
		public final String AA = "AA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_down0;
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.crtArrAct_Chk01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.up(0);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AA)) {
				up_AA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AA)) {
				down_AA(down0(), v0_down0);
			}
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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createChk01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
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
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}

		//-----------------------AA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AA(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src_Chk01_Rslt){
			up_AA_v0_0(dest0_0, src_Chk01_Rslt);
		}
		
		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AA_v0_0() {
			MCRowMapper map = new Map_up_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("rcpt_iv_itm_nm", "rcpt_iv_itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("ret_loc_cd", "ret_loc_cd");
				addColumnPathMap("ret_str_ln_cd", "ret_str_ln_cd");
				addColumnPathMap("arr_loc_cd", "arr_loc_cd");
				addColumnPathMap("str_ln_cd", "arr_str_ln_cd");
				addColumnPathMap("arr_tm", "arr_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("purc_cont_qty", "purc_cont_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("arr_ptn_typ", "arr_ptn_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("temp_rcpt_iv_no", "temp_rcpt_iv_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("edi_flg", "edi_flg");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
			}
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AA_v0_0(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest, mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AA(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest_Chk01_Rslt, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src0_0){
			down_AA_v0_0(dest_Chk01_Rslt, src0_0);
		}

		/**
		 * 連携処理AA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AA_v0_0() {
			MCRowMapper map = new Map_down_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AA_v0_0(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest, mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src) {
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 入荷実績を削除するために、チェックを行う<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		/**
		 * 連携情報 AA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01 （{@link #v0}）<br>
		 */
		public final String AA = "AA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Chk01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_down0;
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.crtArrAct_Chk01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.up(0);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AA)) {
				up_AA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AA)) {
				down_AA(down0(), v0_down0);
			}
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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createChk02_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Chk02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createChk02_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
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
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}

		//-----------------------AA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AA(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src_Chk02_Rslt){
			up_AA_v0_0(dest0_0, src_Chk02_Rslt);
		}
		
		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AA_v0_0() {
			MCRowMapper map = new Map_up_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("arr_act_no", "arr_act_no");
			}
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AA_v0_0(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest, mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AA(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest_Chk02_Rslt, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src0_0){
			down_AA_v0_0(dest_Chk02_Rslt, src0_0);
		}

		/**
		 * 連携処理AA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AA_v0_0() {
			MCRowMapper map = new Map_down_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AA_v0_0(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest, mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src) {
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 入荷予定に対して、または計画外の入荷実績を計上する。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		/**
		 * 連携情報 AA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 （{@link #v0}）<br>
		 */
		public final String AA = "AA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_down0;
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.crtArrAct_Upd01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.up(1);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AA)) {
				up_AA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AA)) {
				down_AA(down0(), v0_down0);
			}
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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Ins01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createIns01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}

		//-----------------------AA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AA(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src_Ins01_Rslt){
			up_AA_v0_0(dest0_0, src_Ins01_Rslt);
		}
		
		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AA_v0_0() {
			MCRowMapper map = new Map_up_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("rcpt_iv_itm_nm", "rcpt_iv_itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("rqst_dpt_cd", "rqst_dpt_cd");
				addColumnPathMap("rqst_usr_cd", "rqst_usr_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sret_fr_cd", "sret_fr_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("ret_loc_cd", "ret_loc_cd");
				addColumnPathMap("ret_str_ln_cd", "ret_str_ln_cd");
				addColumnPathMap("ret_gd_cd", "ret_gd_cd");
				addColumnPathMap("arr_loc_cd", "arr_loc_cd");
				addColumnPathMap("str_ln_cd", "arr_str_ln_cd");
				addColumnPathMap("arr_tm", "arr_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("purc_cont_qty", "purc_cont_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("arr_ptn_typ", "arr_ptn_typ");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("arr_dpt_cd", "arr_dpt_cd");
				addColumnPathMap("arr_usr_cd", "arr_usr_cd");
				addColumnPathMap("rsn_cd", "rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_wg_cd", "bd_wg_cd");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("temp_rcpt_iv_no", "temp_rcpt_iv_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("edi_flg", "edi_flg");
				addColumnPathMap("edi_bp_dlv_slip_no", "edi_bp_dlv_slip_no");
				addColumnPathMap("edi_bp_dlv_slip_d_no", "edi_bp_dlv_slip_d_no");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
			}
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AA_v0_0(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest, mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AA(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest_Ins01_Rslt, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src0_0){
			down_AA_v0_0(dest_Ins01_Rslt, src0_0);
		}

		/**
		 * 連携処理AA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AA_v0_0() {
			MCRowMapper map = new Map_down_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("pr_sts_typ", "pr_sts_typ");
				addColumnPathMap("pr_sts_typ_nm", "pr_sts_typ_nm");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
			}
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AA_v0_0(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest, mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src) {
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入荷実績を訂正する。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		/**
		 * 連携情報 AA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 （{@link #v0}）<br>
		 */
		public final String AA = "AA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_down0;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.crtArrAct_Upd01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.up(1);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AA)) {
				up_AA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AA)) {
				down_AA(down0(), v0_down0);
			}
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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createUpd01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}

		//-----------------------AA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AA(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src_Upd01_Rslt){
			up_AA_v0_0(dest0_0, src_Upd01_Rslt);
		}
		
		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AA_v0_0() {
			MCRowMapper map = new Map_up_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("rcpt_iv_itm_nm", "rcpt_iv_itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("rqst_dpt_cd", "rqst_dpt_cd");
				addColumnPathMap("rqst_usr_cd", "rqst_usr_cd");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sret_fr_cd", "sret_fr_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("ret_loc_cd", "ret_loc_cd");
				addColumnPathMap("ret_str_ln_cd", "ret_str_ln_cd");
				addColumnPathMap("ret_gd_cd", "ret_gd_cd");
				addColumnPathMap("arr_loc_cd", "arr_loc_cd");
				addColumnPathMap("str_ln_cd", "arr_str_ln_cd");
				addColumnPathMap("arr_tm", "arr_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("purc_cont_qty", "purc_cont_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("arr_ptn_typ", "arr_ptn_typ");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("arr_dpt_cd", "arr_dpt_cd");
				addColumnPathMap("arr_usr_cd", "arr_usr_cd");
				addColumnPathMap("rsn_cd", "rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_wg_cd", "bd_wg_cd");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("temp_rcpt_iv_no", "temp_rcpt_iv_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("edi_flg", "edi_flg");
				addColumnPathMap("edi_bp_dlv_slip_no", "edi_bp_dlv_slip_no");
				addColumnPathMap("edi_bp_dlv_slip_d_no", "edi_bp_dlv_slip_d_no");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
			}
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AA_v0_0(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest, mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AA(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest_Upd01_Rslt, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src0_0){
			down_AA_v0_0(dest_Upd01_Rslt, src0_0);
		}

		/**
		 * 連携処理AA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AA_v0_0() {
			MCRowMapper map = new Map_down_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("pr_sts_typ", "pr_sts_typ");
				addColumnPathMap("pr_sts_typ_nm", "pr_sts_typ_nm");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
			}
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AA_v0_0(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest, mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src) {
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 入荷実績を削除する。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		/**
		 * 連携情報 AA<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 （{@link #v0}）<br>
		 */
		public final String AA = "AA";

		/**
		 * 連携オペレーション v0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.ArrAct_Upd01 v0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> v0_down0;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

			// 連携オペレーションの初期化
			v0 = mcframe.serverMSBE.MSBEL5930.MSBEL_ArrActService.crtArrAct_Upd01();
			
			// 連携オペレーションのコンテナ取得
			v0_up0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.up(1);
			v0_down0 = (MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR>)v0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(AA, v0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AA<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt; （{@link #v0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AA)) {
				up_AA(v0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AA<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR&gt;（{@link #v0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AA)) {
				down_AA(down0(), v0_down0);
			}
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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createDel01_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createDel01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}

		//-----------------------AA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AA(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src_Del01_Rslt){
			up_AA_v0_0(dest0_0, src_Del01_Rslt);
		}
		
		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AA_v0_0() {
			MCRowMapper map = new Map_up_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("arr_act_no", "arr_act_no");
			}
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_AA_v0_0(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest, mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理AA_v0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------AA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AA(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest_Del01_Rslt, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src0_0){
			down_AA_v0_0(dest_Del01_Rslt, src0_0);
		}

		/**
		 * 連携処理AA_v0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AA_v0_0() {
			MCRowMapper map = new Map_down_AA_v0_0();
			return map;
		}

		/**
		 * 連携処理AA_v0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AA_v0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("pr_sts_typ", "pr_sts_typ");
				addColumnPathMap("pr_sts_typ_nm", "pr_sts_typ_nm");
			}
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AA_v0_0(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest, mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src) {
		}

		/**
		 * 連携処理AA_v0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AA_v0_0(MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> src) {
			MCRowMapper _rm = createMap_down_AA_v0_0();
			for(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2000.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AA_v0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ入荷実績のチェック処理を行う<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
			up1 = mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);

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
			invoke((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_RsltR createImp01_RsltR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.create();
		}

		/**
		 * Imp01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> createImp01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2000.Chk01_RsltR.class);
		}

		/**
		 * Imp01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR createImp01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2000.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2000.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActReg)MSBEL_ArrActReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}