package mcframe.serverMSBF.MSBFL0050;

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
 * "MSBFL_StdInspActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_StdInspActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_StdInspActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBFL0050_Srch01_INFO;
		this.aSrch01 = ((MSBFL_StdInspActReg)this).new Srch01();
	}

	public static MSBFL_StdInspActReg.Srch01 crtSrch01() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
	public mcframe.serverMSBF.MSBFL0050.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBF.MSBFL0050.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Srch01_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBFL0050_Chk01_INFO;
		this.aChk01 = ((MSBFL_StdInspActReg)this).new Chk01();
	}

	public static MSBFL_StdInspActReg.Chk01 crtChk01() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBFL0050_Chk02_INFO;
		this.aChk02 = ((MSBFL_StdInspActReg)this).new Chk02();
	}

	public static MSBFL_StdInspActReg.Chk02 crtChk02() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
		p.addDownBlock(aChk02.down1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBFL0050_Chk03_INFO;
		this.aChk03 = ((MSBFL_StdInspActReg)this).new Chk03();
	}

	public static MSBFL_StdInspActReg.Chk03 crtChk03() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
	public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR createChk03_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();
	}
	protected MSBFL_StdInspActReg.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MS_MSBFL0050_Chk04_INFO;
		this.aChk04 = ((MSBFL_StdInspActReg)this).new Chk04();
	}

	public static MSBFL_StdInspActReg.Chk04 crtChk04() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
		lgc.initChk04();
		return lgc.aChk04;
	}

	protected void paramChk04(MCParam p) {
		if (this.aChk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk04.up0());
		p.addUpBlock(aChk04.up1());
		p.addDownBlock(aChk04.down0());
		p.addDownBlock(aChk04.down1());
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR createChk04_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
	}

	/**
	 * Chk04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk04_DtlR createChk04_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.create();
	}

	/**
	 * Chk04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> createChk04_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBFL0050_Upd01_INFO;
		this.aUpd01 = ((MSBFL_StdInspActReg)this).new Upd01();
	}

	public static MSBFL_StdInspActReg.Upd01 crtUpd01() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
	public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBFL0050_Upd02_INFO;
		this.aUpd02 = ((MSBFL_StdInspActReg)this).new Upd02();
	}

	public static MSBFL_StdInspActReg.Upd02 crtUpd02() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addUpBlock(aUpd02.up1());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR createUpd02_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
	}

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk02_DtlR createUpd02_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.create();
	}

	/**
	 * Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> createUpd02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBFL0050_Del01_INFO;
		this.aDel01 = ((MSBFL_StdInspActReg)this).new Del01();
	}

	public static MSBFL_StdInspActReg.Del01 crtDel01() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
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
	public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR createDel01_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();
	}
	protected MSBFL_StdInspActReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MS_MSBFL0050_Del02_INFO;
		this.aDel02 = ((MSBFL_StdInspActReg)this).new Del02();
	}

	public static MSBFL_StdInspActReg.Del02 crtDel02() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel02.up0());
		p.addUpBlock(aDel02.up1());
	}

	protected void doDel02() {
		aDel02.call();
	};

	/**
	 * Del02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR createDel02_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
	}

	/**
	 * Del02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Chk04_DtlR createDel02_DtlR(){
		return mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.create();
	}

	/**
	 * Del02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> createDel02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);
	}
	protected MSBFL_StdInspActReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBFL0050_Prnt01_INFO;
		this.aPrnt01 = ((MSBFL_StdInspActReg)this).new Prnt01();
	}

	public static MSBFL_StdInspActReg.Prnt01 crtPrnt01() {
		MSBFL_StdInspActReg lgc = new MSBFL_StdInspActReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査指図、検査実績、規格検査指図を検索する<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Srch01_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0050.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Srch01_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
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
		public mcframe.serverMSBF.MSBFL0050.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBF.MSBFL0050.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Srch01_CndR
		 */
		public mcframe.serverMSBF.MSBFL0050.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>judg_dt</td></tr>
		 * 	<tr><td><br></td><td>judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Srch01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_dt</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
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
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>auto_judg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 規格検査実績を登録・更新する前に、チェックを実行する<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
			down0 = mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> up1() {
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
		 * @see mcframe.serverMSBF.MSBFL0050.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 規格検査実績を確認する前に、チェックを実行する<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);
			down0 = mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_dt</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> up1() {
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
		 * @see mcframe.serverMSBF.MSBFL0050.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 規格検査実績を取り消す前に、チェックを実行する<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR createChk03_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR up0() {
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
		 * @see mcframe.serverMSBF.MSBFL0050.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 確認の規格検査実績を取り消す前に、チェックを実行する<br>
	 */
	abstract public class Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk04_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);
			down0 = mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR createChk04_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
		}

		/**
		 * Chk04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_DtlR createChk04_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.create();
		}

		/**
		 * Chk04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> createChk04_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> up1() {
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
		 * @see mcframe.serverMSBF.MSBFL0050.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 規格検査実績の登録・更新を行う<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
			down0 = mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
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
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 規格検査実績の確認を行う<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> up1;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR createUpd02_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk02_HdrR.create();
		}

		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_DtlR createUpd02_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.create();
		}

		/**
		 * Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> createUpd02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_dt</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk02_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 規格検査実績の取消を行う<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk03_HdrR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR createDel01_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk03_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 確認の規格検査実績の取消を行う<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> up1;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR createDel02_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Chk04_HdrR.create();
		}

		/**
		 * Del02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_DtlR createDel02_DtlR(){
			return mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.create();
		}

		/**
		 * Del02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> createDel02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0050.Chk04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0050.Chk04_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する<br>
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
		private final mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR.create();

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
			invoke((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0050.Prnt01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActReg)MSBFL_StdInspActReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}