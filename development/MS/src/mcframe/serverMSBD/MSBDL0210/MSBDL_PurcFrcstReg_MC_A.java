package mcframe.serverMSBD.MSBDL0210;

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
 * "MSBDL_PurcFrcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcFrcstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL0210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcFrcstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBDL0210_Srch01_INFO;
		this.aSrch01 = ((MSBDL_PurcFrcstReg)this).new Srch01();
	}

	public static MSBDL_PurcFrcstReg.Srch01 crtSrch01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Srch01_RsltR.class);
	}
	protected MSBDL_PurcFrcstReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBDL0210_Srch02_INFO;
		this.aSrch02 = ((MSBDL_PurcFrcstReg)this).new Srch02();
	}

	public static MSBDL_PurcFrcstReg.Srch02 crtSrch02() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Srch02_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBD.MSBDL0210.Srch02_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Srch02_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Srch02_DtlR.class);
	}
	protected MSBDL_PurcFrcstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBDL0210_Chk01_INFO;
		this.aChk01 = ((MSBDL_PurcFrcstReg)this).new Chk01();
	}

	public static MSBDL_PurcFrcstReg.Chk01 crtChk01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
	}
	protected MSBDL_PurcFrcstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBDL0210_Chk02_INFO;
		this.aChk02 = ((MSBDL_PurcFrcstReg)this).new Chk02();
	}

	public static MSBDL_PurcFrcstReg.Chk02 crtChk02() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
	}

	/**
	 * Chk02_CrtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR createChk02_CrtlR(){
		return mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR.create();
	}
	protected MSBDL_PurcFrcstReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBDL0210_Chk03_INFO;
		this.aChk03 = ((MSBDL_PurcFrcstReg)this).new Chk03();
	}

	public static MSBDL_PurcFrcstReg.Chk03 crtChk03() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Chk03_RsltR createChk03_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.create();
	}

	/**
	 * Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> createChk03_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
	}
	protected MSBDL_PurcFrcstReg.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MS_MSBDL0210_Chk04_INFO;
		this.aChk04 = ((MSBDL_PurcFrcstReg)this).new Chk04();
	}

	public static MSBDL_PurcFrcstReg.Chk04 crtChk04() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
		lgc.initChk04();
		return lgc.aChk04;
	}

	protected void paramChk04(MCParam p) {
		if (this.aChk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk04.up0());
		p.addDownBlock(aChk04.down0());
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk04_RsltR createChk04_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.create();
	}

	/**
	 * Chk04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> createChk04_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
	}
	protected MSBDL_PurcFrcstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBDL0210_Upd01_INFO;
		this.aUpd01 = ((MSBDL_PurcFrcstReg)this).new Upd01();
	}

	public static MSBDL_PurcFrcstReg.Upd01 crtUpd01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
	}
	protected MSBDL_PurcFrcstReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBDL0210_Imp01_INFO;
		this.aImp01 = ((MSBDL_PurcFrcstReg)this).new Imp01();
	}

	public static MSBDL_PurcFrcstReg.Imp01 crtImp01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	 * Imp01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createImp01_DtlR(){
		return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
	}

	/**
	 * Imp01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createImp01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
	}
	protected MSBDL_PurcFrcstReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBDL0210_Upd02_INFO;
		this.aUpd02 = ((MSBDL_PurcFrcstReg)this).new Upd02();
	}

	public static MSBDL_PurcFrcstReg.Upd02 crtUpd02() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addDownBlock(aUpd02.down0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createUpd02_DtlR(){
		return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
	}

	/**
	 * Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createUpd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
	}
	protected MSBDL_PurcFrcstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBDL0210_Del01_INFO;
		this.aDel01 = ((MSBDL_PurcFrcstReg)this).new Del01();
	}

	public static MSBDL_PurcFrcstReg.Del01 crtDel01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
	public mcframe.serverMSBD.MSBDL0210.Chk03_RsltR createDel01_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
	}

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Upd01_CndR createDel01_CndR(){
		return mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
	}
	protected MSBDL_PurcFrcstReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MS_MSBDL0210_Del02_INFO;
		this.aDel02 = ((MSBDL_PurcFrcstReg)this).new Del02();
	}

	public static MSBDL_PurcFrcstReg.Del02 crtDel02() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel02.up0());
		p.addDownBlock(aDel02.down0());
	}

	protected void doDel02() {
		aDel02.call();
	};

	/**
	 * Del02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Chk04_RsltR createDel02_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.create();
	}

	/**
	 * Del02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> createDel02_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
	}
	protected MSBDL_PurcFrcstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBDL0210_Prnt01_INFO;
		this.aPrnt01 = ((MSBDL_PurcFrcstReg)this).new Prnt01();
	}

	public static MSBDL_PurcFrcstReg.Prnt01 crtPrnt01() {
		MSBDL_PurcFrcstReg lgc = new MSBDL_PurcFrcstReg();
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
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0210.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBD.MSBDL0210.Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買内示のヘッダ情報を検索する。<br>
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
		private final mcframe.serverMSBD.MSBDL0210.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Srch01_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>disp_ope</td></tr>
		 * 	<tr><td><br></td><td>fix_f_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_t_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_f_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_t_flg</td></tr>
		 * 	<tr><td><br></td><td>del_f_flg</td></tr>
		 * 	<tr><td><br></td><td>del_t_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_t_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_f_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_t_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_f_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pf_dt_to</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0210.Srch01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>pre_pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 購買内示の明細情報を検索する。<br>
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
		private final mcframe.serverMSBD.MSBDL0210.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Srch02_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Srch02_DtlR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBD.MSBDL0210.Srch01_CndR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch02_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBD.MSBDL0210.Srch02_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Srch02_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Srch02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>disp_ope</td></tr>
		 * 	<tr><td><br></td><td>fix_f_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_t_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_f_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_t_flg</td></tr>
		 * 	<tr><td><br></td><td>del_f_flg</td></tr>
		 * 	<tr><td><br></td><td>del_t_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_t_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_f_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_t_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_f_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pf_dt_to</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
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
		 * @see mcframe.serverMSBD.MSBDL0210.Srch01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0210.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>pre_pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Srch02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * ヘッダ更新前チェック<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 明細更新前チェック<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
			up1 = mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
		}

		/**
		 * Chk02_CrtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR createChk02_CrtlR(){
			return mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk02_CrtlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>pre_pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェック<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk03_RsltR createChk03_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.create();
		}

		/**
		 * Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> createChk03_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 取消キャンセル前チェック<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk04_RsltR createChk04_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.create();
		}

		/**
		 * Chk04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> createChk04_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 購買内示のヘッダ情報を更新する<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0210.Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
			up1 = mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk01_RsltR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0210.Upd01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0210.Upd01_CndR up1() {
			return up1;
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力<br>
	 */
	abstract public class Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createImp01_DtlR(){
			return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
		}

		/**
		 * Imp01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createImp01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>pre_pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>del_pf_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pre_trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>pre_base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 購買内示の明細情報を更新する<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk02_DtlR createUpd02_DtlR(){
			return mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.create();
		}

		/**
		 * Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> createUpd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> up0() {
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 購買内示情報を取消する。<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0210.Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
			up1 = mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk03_RsltR createDel01_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk03_RsltR.class);
		}

		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Upd01_CndR createDel01_CndR(){
			return mcframe.serverMSBD.MSBDL0210.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0210.Upd01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0210.Upd01_CndR up1() {
			return up1;
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 購買内示情報の取消をキャンセルする。<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Chk04_RsltR createDel02_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.create();
		}

		/**
		 * Del02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> createDel02_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Chk04_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> up0() {
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
		public MCList<mcframe.serverMSBD.MSBDL0210.Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 内示書を印字する。<br>
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
		private final MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0210.Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.class);
			up1 = mcframe.serverMSBD.MSBDL0210.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.class);

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
			invoke((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0210.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBD.MSBDL0210.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> up0() {
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
		 * @see mcframe.serverMSBD.MSBDL0210.Prnt01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0210.Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0210.Prnt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstReg)MSBDL_PurcFrcstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}