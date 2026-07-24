package mcframe.serverMAUC.MAUCL0030;

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
 * "MAUCL_Dac"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_Dac_MC_A extends mcframe.serverFXBA.FXBAL0010.FXBAL_MCLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_Dac.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MAUCL0030_Srch01_INFO;
		this.aSrch01 = ((MAUCL_Dac)this).new Srch01();
	}

	public static MAUCL_Dac.Srch01 crtSrch01() {
		MAUCL_Dac lgc = new MAUCL_Dac();
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
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
	}

	/**
	 * LoginInfoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
		return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
	}

	/**
	 * Srch01_Rslt_RdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_RdR(){
		return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
	}

	/**
	 * Srch01_Rslt_RdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_RdL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
	}

	/**
	 * Srch01_Rslt_WrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_WrR(){
		return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
	}

	/**
	 * Srch01_Rslt_WrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_WrL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
	}
	protected MAUCL_Dac.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MAUCL0030_Srch02_INFO;
		this.aSrch02 = ((MAUCL_Dac)this).new Srch02();
	}

	public static MAUCL_Dac.Srch02 crtSrch02() {
		MAUCL_Dac lgc = new MAUCL_Dac();
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
		p.addDownBlock(aSrch02.down1());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
	}

	/**
	 * Srch02_Rslt_RdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_RdR(){
		return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
	}

	/**
	 * Srch02_Rslt_RdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_RdL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
	}

	/**
	 * Srch02_Rslt_WrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_WrR(){
		return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
	}

	/**
	 * Srch02_Rslt_WrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_WrL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
	}
	protected MAUCL_Dac.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MA_MAUCL0030_Srch03_INFO;
		this.aSrch03 = ((MAUCL_Dac)this).new Srch03();
	}

	public static MAUCL_Dac.Srch03 crtSrch03() {
		MAUCL_Dac lgc = new MAUCL_Dac();
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
		p.addDownBlock(aSrch03.down1());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_RsltR(){
		return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
	}

	/**
	 * Srch03_Rslt_RdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_RdR(){
		return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
	}

	/**
	 * Srch03_Rslt_RdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_RdL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
	}

	/**
	 * Srch03_Rslt_WrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_WrR(){
		return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
	}

	/**
	 * Srch03_Rslt_WrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_WrL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
	}
	protected MAUCL_Dac.Srch04 aSrch04;

	protected void initSrch04() {
		this.info = PDef.MA_MAUCL0030_Srch04_INFO;
		this.aSrch04 = ((MAUCL_Dac)this).new Srch04();
	}

	public static MAUCL_Dac.Srch04 crtSrch04() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initSrch04();
		return lgc.aSrch04;
	}

	protected void paramSrch04(MCParam p) {
		if (this.aSrch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch04.up0());
		p.addDownBlock(aSrch04.down0());
		p.addDownBlock(aSrch04.down1());
	}

	protected void doSrch04() {
		aSrch04.call();
	};

	/**
	 * Srch04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_RsltR(){
		return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
	}

	/**
	 * Srch04_Rslt_RdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_RdR(){
		return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
	}

	/**
	 * Srch04_Rslt_RdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_RdL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
	}

	/**
	 * Srch04_Rslt_WrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_WrR(){
		return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
	}

	/**
	 * Srch04_Rslt_WrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_WrL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
	}
	protected MAUCL_Dac.Srch05 aSrch05;

	protected void initSrch05() {
		this.info = PDef.MA_MAUCL0030_Srch05_INFO;
		this.aSrch05 = ((MAUCL_Dac)this).new Srch05();
	}

	public static MAUCL_Dac.Srch05 crtSrch05() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initSrch05();
		return lgc.aSrch05;
	}

	protected void paramSrch05(MCParam p) {
		if (this.aSrch05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch05.up0());
		p.addDownBlock(aSrch05.down0());
		p.addDownBlock(aSrch05.down1());
	}

	protected void doSrch05() {
		aSrch05.call();
	};

	/**
	 * Srch05_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_RsltR(){
		return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
	}

	/**
	 * Srch05_Rslt_RdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_RdR(){
		return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
	}

	/**
	 * Srch05_Rslt_RdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_RdL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
	}

	/**
	 * Srch05_Rslt_WrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_WrR(){
		return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
	}

	/**
	 * Srch05_Rslt_WrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_WrL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
	}
	protected MAUCL_Dac.Srch09 aSrch09;

	protected void initSrch09() {
		this.info = PDef.MA_MAUCL0030_Srch09_INFO;
		this.aSrch09 = ((MAUCL_Dac)this).new Srch09();
	}

	public static MAUCL_Dac.Srch09 crtSrch09() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initSrch09();
		return lgc.aSrch09;
	}

	protected void paramSrch09(MCParam p) {
		if (this.aSrch09 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch09.up0());
		p.addDownBlock(aSrch09.down0());
		p.addDownBlock(aSrch09.down1());
		p.addDownBlock(aSrch09.down2());
		p.addDownBlock(aSrch09.down3());
		p.addDownBlock(aSrch09.down4());
		p.addDownBlock(aSrch09.down5());
		p.addDownBlock(aSrch09.down6());
		p.addDownBlock(aSrch09.down7());
		p.addDownBlock(aSrch09.down8());
		p.addDownBlock(aSrch09.down9());
	}

	protected void doSrch09() {
		aSrch09.call();
	};
	protected MAUCL_Dac.Srch10 aSrch10;

	protected void initSrch10() {
		this.info = PDef.MA_MAUCL0030_Srch10_INFO;
		this.aSrch10 = ((MAUCL_Dac)this).new Srch10();
	}

	public static MAUCL_Dac.Srch10 crtSrch10() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initSrch10();
		return lgc.aSrch10;
	}

	protected void paramSrch10(MCParam p) {
		if (this.aSrch10 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch10.down0());
		p.addDownBlock(aSrch10.down1());
		p.addDownBlock(aSrch10.down2());
		p.addDownBlock(aSrch10.down3());
		p.addDownBlock(aSrch10.down4());
		p.addDownBlock(aSrch10.down5());
		p.addDownBlock(aSrch10.down6());
		p.addDownBlock(aSrch10.down7());
		p.addDownBlock(aSrch10.down8());
		p.addDownBlock(aSrch10.down9());
	}

	protected void doSrch10() {
		aSrch10.call();
	};
	protected MAUCL_Dac.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MAUCL0030_Del01_INFO;
		this.aDel01 = ((MAUCL_Dac)this).new Del01();
	}

	public static MAUCL_Dac.Del01 crtDel01() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel01() {
		aDel01.call();
	};
	protected MAUCL_Dac.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MA_MAUCL0030_Del02_INFO;
		this.aDel02 = ((MAUCL_Dac)this).new Del02();
	}

	public static MAUCL_Dac.Del02 crtDel02() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel02() {
		aDel02.call();
	};
	protected MAUCL_Dac.Del03 aDel03;

	protected void initDel03() {
		this.info = PDef.MA_MAUCL0030_Del03_INFO;
		this.aDel03 = ((MAUCL_Dac)this).new Del03();
	}

	public static MAUCL_Dac.Del03 crtDel03() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel03();
		return lgc.aDel03;
	}

	protected void paramDel03(MCParam p) {
		if (this.aDel03 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel03() {
		aDel03.call();
	};
	protected MAUCL_Dac.Del04 aDel04;

	protected void initDel04() {
		this.info = PDef.MA_MAUCL0030_Del04_INFO;
		this.aDel04 = ((MAUCL_Dac)this).new Del04();
	}

	public static MAUCL_Dac.Del04 crtDel04() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel04();
		return lgc.aDel04;
	}

	protected void paramDel04(MCParam p) {
		if (this.aDel04 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel04() {
		aDel04.call();
	};
	protected MAUCL_Dac.Del05 aDel05;

	protected void initDel05() {
		this.info = PDef.MA_MAUCL0030_Del05_INFO;
		this.aDel05 = ((MAUCL_Dac)this).new Del05();
	}

	public static MAUCL_Dac.Del05 crtDel05() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel05();
		return lgc.aDel05;
	}

	protected void paramDel05(MCParam p) {
		if (this.aDel05 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel05() {
		aDel05.call();
	};
	protected MAUCL_Dac.Del09 aDel09;

	protected void initDel09() {
		this.info = PDef.MA_MAUCL0030_Del09_INFO;
		this.aDel09 = ((MAUCL_Dac)this).new Del09();
	}

	public static MAUCL_Dac.Del09 crtDel09() {
		MAUCL_Dac lgc = new MAUCL_Dac();
		lgc.initDel09();
		return lgc.aDel09;
	}

	protected void paramDel09(MCParam p) {
		if (this.aDel09 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doDel09() {
		aDel09.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	abstract public class Srch01 extends MCOperation {
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
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1;
		/** [Srch01_Rslt]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.Srch01_RsltR aSrch01_Rslt;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			aSrch01_Rslt = mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();

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
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch01_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		/**
		 * Srch01_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1() {
			return down1;
		}


		/**
		 * [Srch01_Rslt]ブロックのコンテナaSrch01_RsltRを返します。
		 *
		 * @return Srch01_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR Srch01_Rslt() {
			return aSrch01_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 物流グループＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	abstract public class Srch02 extends MCOperation {
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
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down1;
		/** [Srch02_Rslt]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.Srch02_RsltR aSrch02_Rslt;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			aSrch02_Rslt = mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();

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
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch02_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch02_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down1() {
			return down1;
		}


		/**
		 * [Srch02_Rslt]ブロックのコンテナaSrch02_RsltRを返します。
		 *
		 * @return Srch02_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR Srch02_Rslt() {
			return aSrch02_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 場所ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	abstract public class Srch03 extends MCOperation {
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
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down1;
		/** [Srch03_Rslt]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.Srch03_RsltR aSrch03_Rslt;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			aSrch03_Rslt = mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();

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
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_RsltR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch03_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		/**
		 * Srch03_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down1() {
			return down1;
		}


		/**
		 * [Srch03_Rslt]ブロックのコンテナaSrch03_RsltRを返します。
		 *
		 * @return Srch03_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR Srch03_Rslt() {
			return aSrch03_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * ＷＧ ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	abstract public class Srch04 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down1;
		/** [Srch04_Rslt]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.Srch04_RsltR aSrch04_Rslt;
		
		
		// コンストラクタ
		protected Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			aSrch04_Rslt = mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();

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
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_RsltR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch04_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		/**
		 * Srch04_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down1() {
			return down1;
		}


		/**
		 * [Srch04_Rslt]ブロックのコンテナaSrch04_RsltRを返します。
		 *
		 * @return Srch04_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR Srch04_Rslt() {
			return aSrch04_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * 総量引当場所グループＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	abstract public class Srch05 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down1;
		/** [Srch05_Rslt]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.Srch05_RsltR aSrch05_Rslt;
		
		
		// コンストラクタ
		protected Srch05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
			aSrch05_Rslt = mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();

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
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch05_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_RsltR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch05_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		/**
		 * Srch05_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down1() {
			return down1;
		}


		/**
		 * [Srch05_Rslt]ブロックのコンテナaSrch05_RsltRを返します。
		 *
		 * @return Srch05_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR Srch05_Rslt() {
			return aSrch05_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Srch09オペレーション.<p>
	 *
	 * ＤＡＣ取得（全体）<br>
	 */
	abstract public class Srch09 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch09";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0030.LoginInfoR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down8;
		/** このオペレーションからの下り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down9;
		
		/**
		 * 連携情報 DPT<p>
		 *
		 * 連携先 mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch01 （{@link #srch01}）<br>
		 */
		public final String DPT = "DPT";

		/**
		 * 連携オペレーション srch01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch01_RsltR&gt; （{@link #srch01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch01_RsltR&gt; （{@link #srch01_down1}）<br>
		 */
		public final mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch01 srch01;
		// 連携ロジック上り
		public final mcframe.serverMAUC.MAUCL0030.LoginInfoR srch01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> srch01_down0;
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> srch01_down1;
		/**
		 * 連携情報 LG_GRP<p>
		 *
		 * 連携先 mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch02 （{@link #srch02}）<br>
		 */
		public final String LG_GRP = "LG_GRP";

		/**
		 * 連携オペレーション srch02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch02}<br>
		 * 第1 上りブロッククラス mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch02_RsltR&gt; （{@link #srch02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch02_RsltR&gt; （{@link #srch02_down1}）<br>
		 */
		public final mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch02 srch02;
		// 連携ロジック上り
		public final mcframe.serverMAUC.MAUCL0030.LoginInfoR srch02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> srch02_down0;
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> srch02_down1;
		/**
		 * 連携情報 LOC<p>
		 *
		 * 連携先 mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch03 （{@link #srch03}）<br>
		 */
		public final String LOC = "LOC";

		/**
		 * 連携オペレーション srch03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch03}<br>
		 * 第1 上りブロッククラス mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch03_RsltR&gt; （{@link #srch03_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch03_RsltR&gt; （{@link #srch03_down1}）<br>
		 */
		public final mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch03 srch03;
		// 連携ロジック上り
		public final mcframe.serverMAUC.MAUCL0030.LoginInfoR srch03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> srch03_down0;
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> srch03_down1;
		/**
		 * 連携情報 WG<p>
		 *
		 * 連携先 mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch04 （{@link #srch04}）<br>
		 */
		public final String WG = "WG";

		/**
		 * 連携オペレーション srch04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch04}<br>
		 * 第1 上りブロッククラス mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch04_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch04_RsltR&gt; （{@link #srch04_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch04_RsltR&gt; （{@link #srch04_down1}）<br>
		 */
		public final mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch04 srch04;
		// 連携ロジック上り
		public final mcframe.serverMAUC.MAUCL0030.LoginInfoR srch04_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> srch04_down0;
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> srch04_down1;
		/**
		 * 連携情報 ALLOC_GRP<p>
		 *
		 * 連携先 mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch05 （{@link #srch05}）<br>
		 */
		public final String ALLOC_GRP = "ALLOC_GRP";

		/**
		 * 連携オペレーション srch05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch05}<br>
		 * 第1 上りブロッククラス mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch05_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch05_RsltR&gt; （{@link #srch05_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch05_RsltR&gt; （{@link #srch05_down1}）<br>
		 */
		public final mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.Srch05 srch05;
		// 連携ロジック上り
		public final mcframe.serverMAUC.MAUCL0030.LoginInfoR srch05_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> srch05_down0;
		public final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> srch05_down1;
		
		// コンストラクタ
		protected Srch09() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			down3 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			down4 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			down5 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			down6 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			down7 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			down8 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
			down9 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);

			// 連携オペレーションの初期化
			srch01 = mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.crtSrch01();
			srch02 = mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.crtSrch02();
			srch03 = mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.crtSrch03();
			srch04 = mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.crtSrch04();
			srch05 = mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.crtSrch05();
			
			// 連携オペレーションのコンテナ取得
			srch01_up0 = (mcframe.serverMAUC.MAUCL0030.LoginInfoR)srch01.up(0);
			srch01_down0 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR>)srch01.down(0);
			srch01_down1 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR>)srch01.down(1);
			srch02_up0 = (mcframe.serverMAUC.MAUCL0030.LoginInfoR)srch02.up(0);
			srch02_down0 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR>)srch02.down(0);
			srch02_down1 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR>)srch02.down(1);
			srch03_up0 = (mcframe.serverMAUC.MAUCL0030.LoginInfoR)srch03.up(0);
			srch03_down0 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR>)srch03.down(0);
			srch03_down1 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR>)srch03.down(1);
			srch04_up0 = (mcframe.serverMAUC.MAUCL0030.LoginInfoR)srch04.up(0);
			srch04_down0 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR>)srch04.down(0);
			srch04_down1 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR>)srch04.down(1);
			srch05_up0 = (mcframe.serverMAUC.MAUCL0030.LoginInfoR)srch05.up(0);
			srch05_down0 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR>)srch05.down(0);
			srch05_down1 = (MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR>)srch05.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(DPT, srch01);
			appendOpe(LG_GRP, srch02);
			appendOpe(LOC, srch03);
			appendOpe(WG, srch04);
			appendOpe(ALLOC_GRP, srch05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * DPT<br>
		 * up0() => mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch01_up0}）<br>
		 * LG_GRP<br>
		 * up0() => mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch02_up0}）<br>
		 * LOC<br>
		 * up0() => mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch03_up0}）<br>
		 * WG<br>
		 * up0() => mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch04_up0}）<br>
		 * ALLOC_GRP<br>
		 * up0() => mcframe.serverMAUC.MAUCL0030.LoginInfoR （{@link #srch05_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(DPT)) {
				up_DPT(srch01_up0, up0());
			}
			if (key.equals(LG_GRP)) {
				up_LG_GRP(srch02_up0, up0());
			}
			if (key.equals(LOC)) {
				up_LOC(srch03_up0, up0());
			}
			if (key.equals(WG)) {
				up_WG(srch04_up0, up0());
			}
			if (key.equals(ALLOC_GRP)) {
				up_ALLOC_GRP(srch05_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * DPT<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch01_RsltR&gt;（{@link #srch01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch01_RsltR&gt;（{@link #srch01_down1}）=> down1()<br>
		 * LG_GRP<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch02_RsltR&gt;（{@link #srch02_down0}）=> down2()<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch02_RsltR&gt;（{@link #srch02_down1}）=> down3()<br>
		 * LOC<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch03_RsltR&gt;（{@link #srch03_down0}）=> down4()<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch03_RsltR&gt;（{@link #srch03_down1}）=> down5()<br>
		 * WG<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch04_RsltR&gt;（{@link #srch04_down0}）=> down6()<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch04_RsltR&gt;（{@link #srch04_down1}）=> down7()<br>
		 * ALLOC_GRP<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch05_RsltR&gt;（{@link #srch05_down0}）=> down8()<br>
		 * MCList&lt;mcframe.serverMAUC.MAUCL0030.Srch05_RsltR&gt;（{@link #srch05_down1}）=> down9()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(DPT)) {
				down_DPT(down0(), down1(), srch01_down0, srch01_down1);
			}
			if (key.equals(LG_GRP)) {
				down_LG_GRP(down2(), down3(), srch02_down0, srch02_down1);
			}
			if (key.equals(LOC)) {
				down_LOC(down4(), down5(), srch03_down0, srch03_down1);
			}
			if (key.equals(WG)) {
				down_WG(down6(), down7(), srch04_down0, srch04_down1);
			}
			if (key.equals(ALLOC_GRP)) {
				down_ALLOC_GRP(down8(), down9(), srch05_down0, srch05_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			if (i == 8) return down8();
			if (i == 9) return down9();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
			down8().clear();
			down9().clear();
		}
		/**
		 * LoginInfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR createLoginInfoR(){
			return mcframe.serverMAUC.MAUCL0030.LoginInfoR.create();
		}

		/**
		 * Srch01_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		/**
		 * Srch01_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch02_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch03_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		/**
		 * Srch03_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		/**
		 * Srch04_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		/**
		 * Srch04_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		/**
		 * Srch05_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		/**
		 * Srch05_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>usr_cd</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0030.LoginInfoR
		 */
		public mcframe.serverMAUC.MAUCL0030.LoginInfoR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down8() {
			return down8;
		}

		/**
		 * 下り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down9() {
			return down9;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}

		//-----------------------DPT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループDPTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_DPT(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest0_0, mcframe.serverMAUC.MAUCL0030.LoginInfoR src_LoginInfo){
			up_DPT_srch01_0(dest0_0, src_LoginInfo);
		}
		
		/**
		 * 連携処理DPT_srch01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_DPT_srch01_0() {
			MCRowMapper map = new Map_up_DPT_srch01_0();
			return map;
		}

		/**
		 * 連携処理DPT_srch01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_DPT_srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("srch_only_flg", "srch_only_flg");
			}
		}

		/**
		 * 連携処理DPT_srch01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_DPT_srch01_0(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest, mcframe.serverMAUC.MAUCL0030.LoginInfoR src) {
			createMap_up_DPT_srch01_0().copy(dest, src);
		}
		//-----------------------LG_GRP専用up関連メソッド--------------------------
		/**
		 * オペレーショングループLG_GRPの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_LG_GRP(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest0_0, mcframe.serverMAUC.MAUCL0030.LoginInfoR src_LoginInfo){
			up_LG_GRP_srch02_0(dest0_0, src_LoginInfo);
		}
		
		/**
		 * 連携処理LG_GRP_srch02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_LG_GRP_srch02_0() {
			MCRowMapper map = new Map_up_LG_GRP_srch02_0();
			return map;
		}

		/**
		 * 連携処理LG_GRP_srch02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_LG_GRP_srch02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("srch_only_flg", "srch_only_flg");
			}
		}

		/**
		 * 連携処理LG_GRP_srch02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_LG_GRP_srch02_0(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest, mcframe.serverMAUC.MAUCL0030.LoginInfoR src) {
			createMap_up_LG_GRP_srch02_0().copy(dest, src);
		}
		//-----------------------LOC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループLOCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_LOC(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest0_0, mcframe.serverMAUC.MAUCL0030.LoginInfoR src_LoginInfo){
			up_LOC_srch03_0(dest0_0, src_LoginInfo);
		}
		
		/**
		 * 連携処理LOC_srch03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_LOC_srch03_0() {
			MCRowMapper map = new Map_up_LOC_srch03_0();
			return map;
		}

		/**
		 * 連携処理LOC_srch03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_LOC_srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("srch_only_flg", "srch_only_flg");
			}
		}

		/**
		 * 連携処理LOC_srch03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_LOC_srch03_0(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest, mcframe.serverMAUC.MAUCL0030.LoginInfoR src) {
			createMap_up_LOC_srch03_0().copy(dest, src);
		}
		//-----------------------WG専用up関連メソッド--------------------------
		/**
		 * オペレーショングループWGの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_WG(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest0_0, mcframe.serverMAUC.MAUCL0030.LoginInfoR src_LoginInfo){
			up_WG_srch04_0(dest0_0, src_LoginInfo);
		}
		
		/**
		 * 連携処理WG_srch04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_WG_srch04_0() {
			MCRowMapper map = new Map_up_WG_srch04_0();
			return map;
		}

		/**
		 * 連携処理WG_srch04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_WG_srch04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("srch_only_flg", "srch_only_flg");
			}
		}

		/**
		 * 連携処理WG_srch04の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_WG_srch04_0(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest, mcframe.serverMAUC.MAUCL0030.LoginInfoR src) {
			createMap_up_WG_srch04_0().copy(dest, src);
		}
		//-----------------------ALLOC_GRP専用up関連メソッド--------------------------
		/**
		 * オペレーショングループALLOC_GRPの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_ALLOC_GRP(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest0_0, mcframe.serverMAUC.MAUCL0030.LoginInfoR src_LoginInfo){
			up_ALLOC_GRP_srch05_0(dest0_0, src_LoginInfo);
		}
		
		/**
		 * 連携処理ALLOC_GRP_srch05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_ALLOC_GRP_srch05_0() {
			MCRowMapper map = new Map_up_ALLOC_GRP_srch05_0();
			return map;
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_ALLOC_GRP_srch05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("srch_only_flg", "srch_only_flg");
			}
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_ALLOC_GRP_srch05_0(mcframe.serverMAUC.MAUCL0030.LoginInfoR dest, mcframe.serverMAUC.MAUCL0030.LoginInfoR src) {
			createMap_up_ALLOC_GRP_srch05_0().copy(dest, src);
		}

		//-----------------------DPT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループDPTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_DPT(MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> dest_Srch01_Rslt_Rd, MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> dest_Srch01_Rslt_Wr, MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> src0_0, MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> src0_1){
			down_DPT_srch01_0(dest_Srch01_Rslt_Rd, src0_0);
			down_DPT_srch01_1(dest_Srch01_Rslt_Wr, src0_1);
		}

		/**
		 * 連携処理DPT_srch01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_DPT_srch01_0() {
			MCRowMapper map = new Map_down_DPT_srch01_0();
			return map;
		}

		/**
		 * 連携処理DPT_srch01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_DPT_srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
			}
		}

		/**
		 * 連携処理DPT_srch01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_DPT_srch01_0(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理DPT_srch01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_DPT_srch01_0(MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_DPT_srch01_0();
			for(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_DPT_srch01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理DPT_srch01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_DPT_srch01_1() {
			MCRowMapper map = new Map_down_DPT_srch01_1();
			return map;
		}

		/**
		 * 連携処理DPT_srch01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_DPT_srch01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
			}
		}

		/**
		 * 連携処理DPT_srch01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_DPT_srch01_1(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理DPT_srch01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_DPT_srch01_1(MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_DPT_srch01_1();
			for(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_DPT_srch01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------LG_GRP専用down関連メソッド--------------------------

		/**
		 * オペレーショングループLG_GRPの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_LG_GRP(MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> dest_Srch02_Rslt_Rd, MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> dest_Srch02_Rslt_Wr, MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> src0_0, MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> src0_1){
			down_LG_GRP_srch02_0(dest_Srch02_Rslt_Rd, src0_0);
			down_LG_GRP_srch02_1(dest_Srch02_Rslt_Wr, src0_1);
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_LG_GRP_srch02_0() {
			MCRowMapper map = new Map_down_LG_GRP_srch02_0();
			return map;
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_LG_GRP_srch02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
			}
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_LG_GRP_srch02_0(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_src) {
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_LG_GRP_srch02_0(MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> src) {
			MCRowMapper _rm = createMap_down_LG_GRP_srch02_0();
			for(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_LG_GRP_srch02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_LG_GRP_srch02_1() {
			MCRowMapper map = new Map_down_LG_GRP_srch02_1();
			return map;
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_LG_GRP_srch02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
			}
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_LG_GRP_srch02_1(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_src) {
		}

		/**
		 * 連携処理LG_GRP_srch02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_LG_GRP_srch02_1(MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> src) {
			MCRowMapper _rm = createMap_down_LG_GRP_srch02_1();
			for(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_LG_GRP_srch02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------LOC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループLOCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_LOC(MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> dest_Srch03_Rslt_Rd, MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> dest_Srch03_Rslt_Wr, MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> src0_0, MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> src0_1){
			down_LOC_srch03_0(dest_Srch03_Rslt_Rd, src0_0);
			down_LOC_srch03_1(dest_Srch03_Rslt_Wr, src0_1);
		}

		/**
		 * 連携処理LOC_srch03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_LOC_srch03_0() {
			MCRowMapper map = new Map_down_LOC_srch03_0();
			return map;
		}

		/**
		 * 連携処理LOC_srch03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_LOC_srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
			}
		}

		/**
		 * 連携処理LOC_srch03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_LOC_srch03_0(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_src) {
		}

		/**
		 * 連携処理LOC_srch03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_LOC_srch03_0(MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> src) {
			MCRowMapper _rm = createMap_down_LOC_srch03_0();
			for(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_LOC_srch03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理LOC_srch03の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_LOC_srch03_1() {
			MCRowMapper map = new Map_down_LOC_srch03_1();
			return map;
		}

		/**
		 * 連携処理LOC_srch03の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_LOC_srch03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
			}
		}

		/**
		 * 連携処理LOC_srch03の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_LOC_srch03_1(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_src) {
		}

		/**
		 * 連携処理LOC_srch03の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_LOC_srch03_1(MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> src) {
			MCRowMapper _rm = createMap_down_LOC_srch03_1();
			for(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch03_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_LOC_srch03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------WG専用down関連メソッド--------------------------

		/**
		 * オペレーショングループWGの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_WG(MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> dest_Srch04_Rslt_Rd, MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> dest_Srch04_Rslt_Wr, MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> src0_0, MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> src0_1){
			down_WG_srch04_0(dest_Srch04_Rslt_Rd, src0_0);
			down_WG_srch04_1(dest_Srch04_Rslt_Wr, src0_1);
		}

		/**
		 * 連携処理WG_srch04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_WG_srch04_0() {
			MCRowMapper map = new Map_down_WG_srch04_0();
			return map;
		}

		/**
		 * 連携処理WG_srch04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_WG_srch04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
			}
		}

		/**
		 * 連携処理WG_srch04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_WG_srch04_0(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_src) {
		}

		/**
		 * 連携処理WG_srch04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_WG_srch04_0(MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> src) {
			MCRowMapper _rm = createMap_down_WG_srch04_0();
			for(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_WG_srch04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理WG_srch04の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_WG_srch04_1() {
			MCRowMapper map = new Map_down_WG_srch04_1();
			return map;
		}

		/**
		 * 連携処理WG_srch04の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_WG_srch04_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
			}
		}

		/**
		 * 連携処理WG_srch04の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_WG_srch04_1(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_src) {
		}

		/**
		 * 連携処理WG_srch04の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_WG_srch04_1(MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> src) {
			MCRowMapper _rm = createMap_down_WG_srch04_1();
			for(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_WG_srch04_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------ALLOC_GRP専用down関連メソッド--------------------------

		/**
		 * オペレーショングループALLOC_GRPの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_ALLOC_GRP(MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> dest_Srch05_Rslt_Rd, MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> dest_Srch05_Rslt_Wr, MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> src0_0, MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> src0_1){
			down_ALLOC_GRP_srch05_0(dest_Srch05_Rslt_Rd, src0_0);
			down_ALLOC_GRP_srch05_1(dest_Srch05_Rslt_Wr, src0_1);
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_ALLOC_GRP_srch05_0() {
			MCRowMapper map = new Map_down_ALLOC_GRP_srch05_0();
			return map;
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_ALLOC_GRP_srch05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
			}
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_ALLOC_GRP_srch05_0(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_src) {
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_ALLOC_GRP_srch05_0(MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> src) {
			MCRowMapper _rm = createMap_down_ALLOC_GRP_srch05_0();
			for(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_ALLOC_GRP_srch05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_ALLOC_GRP_srch05_1() {
			MCRowMapper map = new Map_down_ALLOC_GRP_srch05_1();
			return map;
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_ALLOC_GRP_srch05_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
			}
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_ALLOC_GRP_srch05_1(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_dest, mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_src) {
		}

		/**
		 * 連携処理ALLOC_GRP_srch05の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_ALLOC_GRP_srch05_1(MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> dest, MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> src) {
			MCRowMapper _rm = createMap_down_ALLOC_GRP_srch05_1();
			for(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_src : src){
				mcframe.serverMAUC.MAUCL0030.Srch05_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_ALLOC_GRP_srch05_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch10オペレーション.<p>
	 *
	 * ＤＡＣ取得（単層実行用）<br>
	 */
	abstract public class Srch10 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch10";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down8;
		/** このオペレーションからの下り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down9;
		
		
		// コンストラクタ
		protected Srch10() {
			
			// このオペレーションのコンテナ初期化
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			down3 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
			down4 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			down5 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
			down6 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			down7 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
			down8 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
			down9 = MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			if (i == 8) return down8();
			if (i == 9) return down9();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
			down8().clear();
			down9().clear();
		}
		/**
		 * Srch01_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		/**
		 * Srch01_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch01_RsltR createSrch01_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> createSrch01_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch01_RsltR.class);
		}

		/**
		 * Srch02_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch02_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch02_RsltR createSrch02_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> createSrch02_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch03_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		/**
		 * Srch03_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch03_RsltR createSrch03_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.create();
		}

		/**
		 * Srch03_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> createSrch03_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch03_RsltR.class);
		}

		/**
		 * Srch04_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		/**
		 * Srch04_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch04_RsltR createSrch04_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.create();
		}

		/**
		 * Srch04_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> createSrch04_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch04_RsltR.class);
		}

		/**
		 * Srch05_Rslt_RdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_RdR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_RdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_RdL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		/**
		 * Srch05_Rslt_WrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0030.Srch05_RsltR createSrch05_Rslt_WrR(){
			return mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.create();
		}

		/**
		 * Srch05_Rslt_WrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> createSrch05_Rslt_WrL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0030.Srch05_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch02_RsltR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch03_RsltR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch04_RsltR> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down8() {
			return down8;
		}

		/**
		 * 下り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0030.Srch05_RsltR> down9() {
			return down9;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 部門ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	abstract public class Del01 extends MCOperation {
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
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 物流グループＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	abstract public class Del02 extends MCOperation {
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
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del03オペレーション.<p>
	 *
	 * 場所ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	abstract public class Del03 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected Del03() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del04オペレーション.<p>
	 *
	 * ＷＧ ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	abstract public class Del04 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected Del04() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del05オペレーション.<p>
	 *
	 * 総量引当場所グループＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	abstract public class Del05 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected Del05() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}
	/**
	 * Del09オペレーション.<p>
	 *
	 * ＤＡＣ削除（全体）<br>
	 */
	abstract public class Del09 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del09";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected Del09() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_Dac)MAUCL_Dac_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Dac)MAUCL_Dac_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}