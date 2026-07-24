package mcframe.serverMSBE.MSBEL2520;

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
 * "MSBEL_StkXfrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StkXfrActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL2520";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StkXfrActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL2520_Srch01_INFO;
		this.aSrch01 = ((MSBEL_StkXfrActReg)this).new Srch01();
	}

	public static MSBEL_StkXfrActReg.Srch01 crtSrch01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL2520.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR createSrch01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.create();
	}

	/**
	 * Srch01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> createSrch01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);
	}

	/**
	 * Srch01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR createSrch01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.create();
	}

	/**
	 * Srch01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> createSrch01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL2520_Chk01_INFO;
		this.aChk01 = ((MSBEL_StkXfrActReg)this).new Chk01();
	}

	public static MSBEL_StkXfrActReg.Chk01 crtChk01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Chk01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}

	/**
	 * Chk01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Chk01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL2520_Chk02_INFO;
		this.aChk02 = ((MSBEL_StkXfrActReg)this).new Chk02();
	}

	public static MSBEL_StkXfrActReg.Chk02 crtChk02() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
		p.addUpBlock(aChk02.up2());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
		p.addDownBlock(aChk02.down2());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createChk02_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
	}

	/**
	 * Chk02_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk02_DtlGiR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Chk02_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk02_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}

	/**
	 * Chk02_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk02_DtlGrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Chk02_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk02_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBEL2520_Chk03_INFO;
		this.aChk03 = ((MSBEL_StkXfrActReg)this).new Chk03();
	}

	public static MSBEL_StkXfrActReg.Chk03 crtChk03() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
	 * Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR createChk03_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
	}
	protected MSBEL_StkXfrActReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBEL2520_Ins01_INFO;
		this.aIns01 = ((MSBEL_StkXfrActReg)this).new Ins01();
	}

	public static MSBEL_StkXfrActReg.Ins01 crtIns01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
		p.addUpBlock(aIns01.up2());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
		p.addDownBlock(aIns01.down2());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createIns01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Ins01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createIns01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}

	/**
	 * Ins01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createIns01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Ins01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createIns01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL2520_Upd01_INFO;
		this.aUpd01 = ((MSBEL_StkXfrActReg)this).new Upd01();
	}

	public static MSBEL_StkXfrActReg.Upd01 crtUpd01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
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
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
		p.addDownBlock(aUpd01.down2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createUpd01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Upd01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createUpd01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}

	/**
	 * Upd01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createUpd01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
	}

	/**
	 * Upd01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createUpd01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL2520_Del01_INFO;
		this.aDel01 = ((MSBEL_StkXfrActReg)this).new Del01();
	}

	public static MSBEL_StkXfrActReg.Del01 crtDel01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR createDel01_HdrR(){
		return mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
	}
	protected MSBEL_StkXfrActReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBEL2520_Prnt01_INFO;
		this.aPrnt01 = ((MSBEL_StkXfrActReg)this).new Prnt01();
	}

	public static MSBEL_StkXfrActReg.Prnt01 crtPrnt01() {
		MSBEL_StkXfrActReg lgc = new MSBEL_StkXfrActReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫振替実績を検索する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL2520.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL2520.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR createSrch01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.create();
		}

		/**
		 * Srch01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> createSrch01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);
		}

		/**
		 * Srch01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR createSrch01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.create();
		}

		/**
		 * Srch01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> createSrch01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
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
		 * @see mcframe.serverMSBE.MSBEL2520.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Srch01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 在庫振替実績を登録する前に、チェックを実行する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Chk01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		/**
		 * Chk01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Chk01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 在庫振替実績を訂正する前に、チェックを実行する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createChk02_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
		}

		/**
		 * Chk02_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk02_DtlGiR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Chk02_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk02_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		/**
		 * Chk02_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createChk02_DtlGrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Chk02_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createChk02_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 在庫振替実績を取り消しする前に、チェックを実行する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
			down0 = mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();

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
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR createChk03_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 在庫振替実績を登録する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_down2}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk01_up1;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk01_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk01_down1;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk01_down2;
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBE.MSBEL2520.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk01.up(2);
			chk01_down0 = (mcframe.serverMSBE.MSBEL2520.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk01.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk01_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, chk01_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * mcframe.serverMSBE.MSBEL2520.Chk01_HdrR（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt;（{@link #chk01_down2}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01(down0(), down1(), down2(), chk01_down0, chk01_down1, chk01_down2);
			}
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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createIns01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Ins01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createIns01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		/**
		 * Ins01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createIns01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Ins01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createIns01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest0_1, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest0_2, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src_Ins01_Hdr, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src_Ins01_DtlGi, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src_Ins01_DtlGr){
			up_CALL_OPE01_chk01_0(dest0_0, src_Ins01_Hdr);
			up_CALL_OPE01_chk01_1(dest0_1, src_Ins01_DtlGi);
			up_CALL_OPE01_chk01_2(dest0_2, src_Ins01_DtlGr);
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
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr.trd_cd", "stk_xfr.trd_cd");
				addColumnPathMap("stk_xfr.trd_ptn_typ", "stk_xfr.trd_ptn_typ");
				addColumnPathMap("stk_xfr.loc_cd", "stk_xfr.loc_cd");
				addColumnPathMap("stk_xfr.wg_cd", "stk_xfr.wg_cd");
				addColumnPathMap("stk_xfr.act_usr_cd", "stk_xfr.act_usr_cd");
				addColumnPathMap("stk_xfr.act_dpt_cd", "stk_xfr.act_dpt_cd");
				addColumnPathMap("stk_xfr.stk_xfr_act_tm", "stk_xfr.stk_xfr_act_tm");
				addColumnPathMap("stk_xfr.ac_dt", "stk_xfr.ac_dt");
				addColumnPathMap("stk_xfr.intr_rmrks", "stk_xfr.intr_rmrks");
				addColumnPathMap("stk_xfr.trd_rmrks", "stk_xfr.trd_rmrks");
				addColumnPathMap("stk_xfr.sub_char1", "stk_xfr.sub_char1");
				addColumnPathMap("stk_xfr.sub_char2", "stk_xfr.sub_char2");
				addColumnPathMap("stk_xfr.sub_char3", "stk_xfr.sub_char3");
				addColumnPathMap("stk_xfr.stk_xfr_rsn_cd", "stk_xfr.stk_xfr_rsn_cd");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_1(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_1();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_2() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_2(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_2(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_2();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest_Ins01_Hdr, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest_Ins01_DtlGi, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest_Ins01_DtlGr, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src0_0, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src0_1, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src0_2){
			down_CALL_OPE01_chk01_0(dest_Ins01_Hdr, src0_0);
			down_CALL_OPE01_chk01_1(dest_Ins01_DtlGi, src0_1);
			down_CALL_OPE01_chk01_2(dest_Ins01_DtlGr, src0_2);
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr.trd_cd", "stk_xfr.trd_cd");
				addColumnPathMap("stk_xfr.trd_ptn_typ", "stk_xfr.trd_ptn_typ");
				addColumnPathMap("stk_xfr.loc_cd", "stk_xfr.loc_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("stk_xfr.wg_cd", "stk_xfr.wg_cd");
				addColumnPathMap("stk_xfr.act_usr_cd", "stk_xfr.act_usr_cd");
				addColumnPathMap("stk_xfr.act_dpt_cd", "stk_xfr.act_dpt_cd");
				addColumnPathMap("stk_xfr.stk_xfr_act_tm", "stk_xfr.stk_xfr_act_tm");
				addColumnPathMap("stk_xfr.ac_dt", "stk_xfr.ac_dt");
				addColumnPathMap("stk_xfr.intr_rmrks", "stk_xfr.intr_rmrks");
				addColumnPathMap("stk_xfr.trd_rmrks", "stk_xfr.trd_rmrks");
				addColumnPathMap("stk_xfr.sub_char1", "stk_xfr.sub_char1");
				addColumnPathMap("stk_xfr.sub_char2", "stk_xfr.sub_char2");
				addColumnPathMap("stk_xfr.sub_char3", "stk_xfr.sub_char3");
				addColumnPathMap("stk_xfr.stk_xfr_rsn_cd", "stk_xfr.stk_xfr_rsn_cd");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE01_chk01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("stk_xfr_d.sno1_mng_typ", "stk_xfr_d.sno1_mng_typ");
				addColumnPathMap("stk_xfr_d.sno2_mng_typ", "stk_xfr_d.sno2_mng_typ");
				addColumnPathMap("stk_xfr_d.sno3_mng_typ", "stk_xfr_d.sno3_mng_typ");
				addColumnPathMap("stk_xfr_d.sno4_mng_typ", "stk_xfr_d.sno4_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.base_unit_qty", "stk_xfr_d.base_unit_qty");
				addColumnPathMap("stk_xfr_d.base_unit_cd", "stk_xfr_d.base_unit_cd");
				addColumnPathMap("stk_xfr_d.pack_unit_qty", "stk_xfr_d.pack_unit_qty");
				addColumnPathMap("stk_xfr_d.pack_unit_cd", "stk_xfr_d.pack_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("io_upd_flg", "io_upd_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_1(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE01_chk01_1(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE01_chk01_1();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE01_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_2() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("stk_xfr_d.sno1_mng_typ", "stk_xfr_d.sno1_mng_typ");
				addColumnPathMap("stk_xfr_d.sno2_mng_typ", "stk_xfr_d.sno2_mng_typ");
				addColumnPathMap("stk_xfr_d.sno3_mng_typ", "stk_xfr_d.sno3_mng_typ");
				addColumnPathMap("stk_xfr_d.sno4_mng_typ", "stk_xfr_d.sno4_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.base_unit_qty", "stk_xfr_d.base_unit_qty");
				addColumnPathMap("stk_xfr_d.base_unit_cd", "stk_xfr_d.base_unit_cd");
				addColumnPathMap("stk_xfr_d.pack_unit_qty", "stk_xfr_d.pack_unit_qty");
				addColumnPathMap("stk_xfr_d.pack_unit_cd", "stk_xfr_d.pack_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("io_upd_flg", "io_upd_flg");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_2(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE01_chk01_2(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE01_chk01_2();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE01_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 在庫振替実績を訂正する<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2;
		
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk02 （{@link #chk02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_down2}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk02 chk02;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR chk02_up0;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk02_up1;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk02_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL2520.Chk01_HdrR chk02_down0;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk02_down1;
		public final MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> chk02_down2;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down0 = mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (mcframe.serverMSBE.MSBEL2520.Chk01_HdrR)chk02.up(0);
			chk02_up1 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk02.up(1);
			chk02_up2 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk02.up(2);
			chk02_down0 = (mcframe.serverMSBE.MSBEL2520.Chk01_HdrR)chk02.down(0);
			chk02_down1 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk02.down(1);
			chk02_down2 = (MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR>)chk02.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE02, chk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE02<br>
		 * up0() => mcframe.serverMSBE.MSBEL2520.Chk01_HdrR （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt; （{@link #chk02_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, chk02_up1, chk02_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE02<br>
		 * mcframe.serverMSBE.MSBEL2520.Chk01_HdrR（{@link #chk02_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt;（{@link #chk02_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR&gt;（{@link #chk02_down2}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02(down0(), down1(), down2(), chk02_down0, chk02_down1, chk02_down2);
			}
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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createUpd01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Upd01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createUpd01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		/**
		 * Upd01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR createUpd01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.create();
		}

		/**
		 * Upd01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> createUpd01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest0_1, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest0_2, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src_Upd01_Hdr, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src_Upd01_DtlGi, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src_Upd01_DtlGr){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Hdr);
			up_CALL_OPE02_chk02_1(dest0_1, src_Upd01_DtlGi);
			up_CALL_OPE02_chk02_2(dest0_2, src_Upd01_DtlGr);
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
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr.stk_xfr_act_no", "stk_xfr.stk_xfr_act_no");
				addColumnPathMap("stk_xfr.trd_cd", "stk_xfr.trd_cd");
				addColumnPathMap("stk_xfr.trd_ptn_typ", "stk_xfr.trd_ptn_typ");
				addColumnPathMap("stk_xfr.loc_cd", "stk_xfr.loc_cd");
				addColumnPathMap("stk_xfr.wg_cd", "stk_xfr.wg_cd");
				addColumnPathMap("stk_xfr.act_usr_cd", "stk_xfr.act_usr_cd");
				addColumnPathMap("stk_xfr.act_dpt_cd", "stk_xfr.act_dpt_cd");
				addColumnPathMap("stk_xfr.stk_xfr_act_tm", "stk_xfr.stk_xfr_act_tm");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("stk_xfr.ac_dt", "stk_xfr.ac_dt");
				addColumnPathMap("stk_xfr.intr_rmrks", "stk_xfr.intr_rmrks");
				addColumnPathMap("stk_xfr.trd_rmrks", "stk_xfr.trd_rmrks");
				addColumnPathMap("stk_xfr.sub_char1", "stk_xfr.sub_char1");
				addColumnPathMap("stk_xfr.sub_char2", "stk_xfr.sub_char2");
				addColumnPathMap("stk_xfr.sub_char3", "stk_xfr.sub_char3");
				addColumnPathMap("stk_xfr.stk_xfr_rsn_cd", "stk_xfr.stk_xfr_rsn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src) {
			createMap_up_CALL_OPE02_chk02_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_1() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_no", "stk_xfr_d.stk_xfr_act_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_d_no", "stk_xfr_d.stk_xfr_act_d_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_1(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_1(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_1();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_2() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_no", "stk_xfr_d.stk_xfr_act_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_d_no", "stk_xfr_d.stk_xfr_act_d_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_2(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_2(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_2();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR dest_Upd01_Hdr, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest_Upd01_DtlGi, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest_Upd01_DtlGr, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR src0_0, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src0_1, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src0_2){
			down_CALL_OPE02_chk02_0(dest_Upd01_Hdr, src0_0);
			down_CALL_OPE02_chk02_1(dest_Upd01_DtlGi, src0_1);
			down_CALL_OPE02_chk02_2(dest_Upd01_DtlGr, src0_2);
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_down_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr.stk_xfr_act_no", "stk_xfr.stk_xfr_act_no");
				addColumnPathMap("stk_xfr.trd_cd", "stk_xfr.trd_cd");
				addColumnPathMap("stk_xfr.trd_ptn_typ", "stk_xfr.trd_ptn_typ");
				addColumnPathMap("stk_xfr.loc_cd", "stk_xfr.loc_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("stk_xfr.wg_cd", "stk_xfr.wg_cd");
				addColumnPathMap("stk_xfr.act_usr_cd", "stk_xfr.act_usr_cd");
				addColumnPathMap("stk_xfr.act_dpt_cd", "stk_xfr.act_dpt_cd");
				addColumnPathMap("stk_xfr.stk_xfr_act_tm", "stk_xfr.stk_xfr_act_tm");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("stk_xfr.ac_dt", "stk_xfr.ac_dt");
				addColumnPathMap("stk_xfr.intr_rmrks", "stk_xfr.intr_rmrks");
				addColumnPathMap("stk_xfr.trd_rmrks", "stk_xfr.trd_rmrks");
				addColumnPathMap("stk_xfr.sub_char1", "stk_xfr.sub_char1");
				addColumnPathMap("stk_xfr.sub_char2", "stk_xfr.sub_char2");
				addColumnPathMap("stk_xfr.sub_char3", "stk_xfr.sub_char3");
				addColumnPathMap("stk_xfr.stk_xfr_rsn_cd", "stk_xfr.stk_xfr_rsn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE02_chk02_0(mcframe.serverMSBE.MSBEL2520.Chk01_HdrR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE02_chk02_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE02_chk02_1() {
			MCRowMapper map = new Map_down_CALL_OPE02_chk02_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE02_chk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_no", "stk_xfr_d.stk_xfr_act_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_d_no", "stk_xfr_d.stk_xfr_act_d_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("stk_xfr_d.sno1_mng_typ", "stk_xfr_d.sno1_mng_typ");
				addColumnPathMap("stk_xfr_d.sno2_mng_typ", "stk_xfr_d.sno2_mng_typ");
				addColumnPathMap("stk_xfr_d.sno3_mng_typ", "stk_xfr_d.sno3_mng_typ");
				addColumnPathMap("stk_xfr_d.sno4_mng_typ", "stk_xfr_d.sno4_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.base_unit_qty", "stk_xfr_d.base_unit_qty");
				addColumnPathMap("stk_xfr_d.base_unit_cd", "stk_xfr_d.base_unit_cd");
				addColumnPathMap("stk_xfr_d.pack_unit_qty", "stk_xfr_d.pack_unit_qty");
				addColumnPathMap("stk_xfr_d.pack_unit_cd", "stk_xfr_d.pack_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("io_upd_flg", "io_upd_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE02_chk02_1(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE02_chk02_1(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE02_chk02_1();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE02_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE02_chk02_2() {
			MCRowMapper map = new Map_down_CALL_OPE02_chk02_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE02_chk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_dtl_peg_no", "hdr_dtl_peg_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_no", "stk_xfr_d.stk_xfr_act_no");
				addColumnPathMap("stk_xfr_d.stk_xfr_act_d_no", "stk_xfr_d.stk_xfr_act_d_no");
				addColumnPathMap("stk_xfr_d.itm_cd", "stk_xfr_d.itm_cd");
				addColumnPathMap("stk_xfr_d.itm_sub1", "stk_xfr_d.itm_sub1");
				addColumnPathMap("stk_xfr_d.itm_sub2", "stk_xfr_d.itm_sub2");
				addColumnPathMap("stk_xfr_d.itm_sub3", "stk_xfr_d.itm_sub3");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("stk_xfr_d.sno1_mng_typ", "stk_xfr_d.sno1_mng_typ");
				addColumnPathMap("stk_xfr_d.sno2_mng_typ", "stk_xfr_d.sno2_mng_typ");
				addColumnPathMap("stk_xfr_d.sno3_mng_typ", "stk_xfr_d.sno3_mng_typ");
				addColumnPathMap("stk_xfr_d.sno4_mng_typ", "stk_xfr_d.sno4_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("stk_xfr_d.str_ln_cd", "stk_xfr_d.str_ln_cd");
				addColumnPathMap("stk_xfr_d.fix_no_typ", "stk_xfr_d.fix_no_typ");
				addColumnPathMap("stk_xfr_d.fix_no", "stk_xfr_d.fix_no");
				addColumnPathMap("stk_xfr_d.stk_arrv_bp_cd", "stk_xfr_d.stk_arrv_bp_cd");
				addColumnPathMap("stk_xfr_d.lot_no", "stk_xfr_d.lot_no");
				addColumnPathMap("stk_xfr_d.sublot_no", "stk_xfr_d.sublot_no");
				addColumnPathMap("stk_xfr_d.sno1", "stk_xfr_d.sno1");
				addColumnPathMap("stk_xfr_d.sno2", "stk_xfr_d.sno2");
				addColumnPathMap("stk_xfr_d.sno3", "stk_xfr_d.sno3");
				addColumnPathMap("stk_xfr_d.sno4", "stk_xfr_d.sno4");
				addColumnPathMap("stk_xfr_d.gd_cd", "stk_xfr_d.gd_cd");
				addColumnPathMap("stk_xfr_d.quality_typ", "stk_xfr_d.quality_typ");
				addColumnPathMap("stk_xfr_d.stk_id_typ", "stk_xfr_d.stk_id_typ");
				addColumnPathMap("stk_xfr_d.stk_bp_cd", "stk_xfr_d.stk_bp_cd");
				addColumnPathMap("stk_xfr_d.trd_unit_qty", "stk_xfr_d.trd_unit_qty");
				addColumnPathMap("stk_xfr_d.trd_unit_cd", "stk_xfr_d.trd_unit_cd");
				addColumnPathMap("stk_xfr_d.base_unit_qty", "stk_xfr_d.base_unit_qty");
				addColumnPathMap("stk_xfr_d.base_unit_cd", "stk_xfr_d.base_unit_cd");
				addColumnPathMap("stk_xfr_d.pack_unit_qty", "stk_xfr_d.pack_unit_qty");
				addColumnPathMap("stk_xfr_d.pack_unit_cd", "stk_xfr_d.pack_unit_cd");
				addColumnPathMap("stk_xfr_d.intr_d_rmrks", "stk_xfr_d.intr_d_rmrks");
				addColumnPathMap("stk_xfr_d.trd_d_rmrks", "stk_xfr_d.trd_d_rmrks");
				addColumnPathMap("stk_xfr_d.sub_char1", "stk_xfr_d.sub_char1");
				addColumnPathMap("stk_xfr_d.sub_char2", "stk_xfr_d.sub_char2");
				addColumnPathMap("stk_xfr_d.sub_char3", "stk_xfr_d.sub_char3");
				addColumnPathMap("io_upd_flg", "io_upd_flg");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE02_chk02_2(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest, mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE02_chk02_2(MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> dest, MCList<mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE02_chk02_2();
			for(mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_src : src){
				mcframe.serverMSBE.MSBEL2520.Chk01_DtlGiR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE02_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 在庫振替実績を取り消す<br>
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
		private final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR up0;
		/** [Del01_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR aDel01_Hdr;
		
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk03 （{@link #chk03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk03_HdrR （{@link #chk03_up0}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL2520.Chk03_HdrR （{@link #chk03_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.Chk03 chk03;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR chk03_up0;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL2520.Chk03_HdrR chk03_down0;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
			aDel01_Hdr = mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();

			// 連携オペレーションの初期化
			chk03 = mcframe.serverMSBE.MSBEL2520.MSBEL_StkXfrActReg.crtChk03();
			
			// 連携オペレーションのコンテナ取得
			chk03_up0 = (mcframe.serverMSBE.MSBEL2520.Chk03_HdrR)chk03.up(0);
			chk03_down0 = (mcframe.serverMSBE.MSBEL2520.Chk03_HdrR)chk03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE03, chk03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE03<br>
		 * up0() => mcframe.serverMSBE.MSBEL2520.Chk03_HdrR （{@link #chk03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE03<br>
		 * mcframe.serverMSBE.MSBEL2520.Chk03_HdrR（{@link #chk03_down0}）=> aDel01_Hdr<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03(aDel01_Hdr, chk03_down0);
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
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR createDel01_HdrR(){
			return mcframe.serverMSBE.MSBEL2520.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2520.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR up0() {
			return up0;
		}



		/**
		 * [Del01_Hdr]ブロックのコンテナaDel01_HdrRを返します。
		 *
		 * @return Del01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2520.Chk03_HdrR Del01_Hdr() {
			return aDel01_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(mcframe.serverMSBE.MSBEL2520.Chk03_HdrR dest0_0, mcframe.serverMSBE.MSBEL2520.Chk03_HdrR src_Del01_Hdr){
			up_CALL_OPE03_chk03_0(dest0_0, src_Del01_Hdr);
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
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("stk_xfr.stk_xfr_act_no", "stk_xfr.stk_xfr_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMSBE.MSBEL2520.Chk03_HdrR dest, mcframe.serverMSBE.MSBEL2520.Chk03_HdrR src) {
			createMap_up_CALL_OPE03_chk03_0().copy(dest, src);
		}

		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(mcframe.serverMSBE.MSBEL2520.Chk03_HdrR dest_Del01_Hdr, mcframe.serverMSBE.MSBEL2520.Chk03_HdrR src0_0){
			down_CALL_OPE03_chk03_0(dest_Del01_Hdr, src0_0);
		}

		/**
		 * 連携処理CALL_OPE03_chk03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_down_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("stk_xfr.stk_xfr_act_no", "stk_xfr.stk_xfr_act_no");
				addColumnPathMap("stk_xfr.loc_cd", "stk_xfr.loc_cd");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("prnt_flg", "prnt_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE03_chk03_0(mcframe.serverMSBE.MSBEL2520.Chk03_HdrR r_dest, mcframe.serverMSBE.MSBEL2520.Chk03_HdrR r_src) {
			createMap_down_CALL_OPE03_chk03_0().copy(r_dest, r_src);
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を印刷する<br>
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
		private final mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.create();

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
			invoke((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActReg)MSBEL_StkXfrActReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}