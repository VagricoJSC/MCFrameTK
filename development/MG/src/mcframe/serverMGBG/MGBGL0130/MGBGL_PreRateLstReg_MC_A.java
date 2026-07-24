package mcframe.serverMGBG.MGBGL0130;

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
 * "MGBGL_PreRateLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_PreRateLstReg_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBGL0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_PreRateLstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBGL0130_Srch01_INFO;
		this.aSrch01 = ((MGBGL_PreRateLstReg)this).new Srch01();
	}

	public static MGBGL_PreRateLstReg.Srch01 crtSrch01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Srch01_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBGL0130_Chk01_INFO;
		this.aChk01 = ((MGBGL_PreRateLstReg)this).new Chk01();
	}

	public static MGBGL_PreRateLstReg.Chk01 crtChk01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CrtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR createChk01_CrtlR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR.create();
	}
	protected MGBGL_PreRateLstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBGL0130_Chk02_INFO;
		this.aChk02 = ((MGBGL_PreRateLstReg)this).new Chk02();
	}

	public static MGBGL_PreRateLstReg.Chk02 crtChk02() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
	}

	/**
	 * Chk02_CrtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR createChk02_CrtlR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR.create();
	}

	/**
	 * Chk02_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createChk02_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBGL0130_Chk03_INFO;
		this.aChk03 = ((MGBGL_PreRateLstReg)this).new Chk03();
	}

	public static MGBGL_PreRateLstReg.Chk03 crtChk03() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk03_RsltR createChk03_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.create();
	}

	/**
	 * Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> createChk03_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MG_MGBGL0130_Chk04_INFO;
		this.aChk04 = ((MGBGL_PreRateLstReg)this).new Chk04();
	}

	public static MGBGL_PreRateLstReg.Chk04 crtChk04() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk04_RsltR createChk04_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.create();
	}

	/**
	 * Chk04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> createChk04_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
	}

	/**
	 * Chk04_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createChk04_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Chk05 aChk05;

	protected void initChk05() {
		this.info = PDef.MG_MGBGL0130_Chk05_INFO;
		this.aChk05 = ((MGBGL_PreRateLstReg)this).new Chk05();
	}

	public static MGBGL_PreRateLstReg.Chk05 crtChk05() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initChk05();
		return lgc.aChk05;
	}

	protected void paramChk05(MCParam p) {
		if (this.aChk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk05.up0());
		p.addDownBlock(aChk05.down0());
	}

	protected void doChk05() {
		aChk05.call();
	};

	/**
	 * Chk05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createChk05_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
	}
	protected MGBGL_PreRateLstReg.Chk06 aChk06;

	protected void initChk06() {
		this.info = PDef.MG_MGBGL0130_Chk06_INFO;
		this.aChk06 = ((MGBGL_PreRateLstReg)this).new Chk06();
	}

	public static MGBGL_PreRateLstReg.Chk06 crtChk06() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initChk06();
		return lgc.aChk06;
	}

	protected void paramChk06(MCParam p) {
		if (this.aChk06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk06.up0());
		p.addDownBlock(aChk06.down0());
	}

	protected void doChk06() {
		aChk06.call();
	};

	/**
	 * Chk06_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createChk06_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
	}
	protected MGBGL_PreRateLstReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MG_MGBGL0130_Imp01_INFO;
		this.aImp01 = ((MGBGL_PreRateLstReg)this).new Imp01();
	}

	public static MGBGL_PreRateLstReg.Imp01 crtImp01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createImp01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
	}

	/**
	 * Imp01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createImp01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Imp02 aImp02;

	protected void initImp02() {
		this.info = PDef.MG_MGBGL0130_Imp02_INFO;
		this.aImp02 = ((MGBGL_PreRateLstReg)this).new Imp02();
	}

	public static MGBGL_PreRateLstReg.Imp02 crtImp02() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initImp02();
		return lgc.aImp02;
	}

	protected void paramImp02(MCParam p) {
		if (this.aImp02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp02.up0());
		p.addUpBlock(aImp02.up1());
		p.addDownBlock(aImp02.down0());
	}

	protected void doImp02() {
		aImp02.call();
	};

	/**
	 * Imp02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createImp02_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
	}

	/**
	 * Imp02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createImp02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
	}

	/**
	 * Imp02_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createImp02_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBGL0130_Upd01_INFO;
		this.aUpd01 = ((MGBGL_PreRateLstReg)this).new Upd01();
	}

	public static MGBGL_PreRateLstReg.Upd01 crtUpd01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MG_MGBGL0130_Upd02_INFO;
		this.aUpd02 = ((MGBGL_PreRateLstReg)this).new Upd02();
	}

	public static MGBGL_PreRateLstReg.Upd02 crtUpd02() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
		p.addDownBlock(aUpd02.down0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createUpd02_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
	}

	/**
	 * Upd02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createUpd02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
	}

	/**
	 * Upd02_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createUpd02_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBGL0130_Del01_INFO;
		this.aDel01 = ((MGBGL_PreRateLstReg)this).new Del01();
	}

	public static MGBGL_PreRateLstReg.Del01 crtDel01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk03_RsltR createDel01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MG_MGBGL0130_Del02_INFO;
		this.aDel02 = ((MGBGL_PreRateLstReg)this).new Del02();
	}

	public static MGBGL_PreRateLstReg.Del02 crtDel02() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk04_RsltR createDel02_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.create();
	}

	/**
	 * Del02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> createDel02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
	}

	/**
	 * Del02_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createDel02_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Del03 aDel03;

	protected void initDel03() {
		this.info = PDef.MG_MGBGL0130_Del03_INFO;
		this.aDel03 = ((MGBGL_PreRateLstReg)this).new Del03();
	}

	public static MGBGL_PreRateLstReg.Del03 crtDel03() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initDel03();
		return lgc.aDel03;
	}

	protected void paramDel03(MCParam p) {
		if (this.aDel03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel03.up0());
	}

	protected void doDel03() {
		aDel03.call();
	};

	/**
	 * Del03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createDel03_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
	}
	protected MGBGL_PreRateLstReg.Del04 aDel04;

	protected void initDel04() {
		this.info = PDef.MG_MGBGL0130_Del04_INFO;
		this.aDel04 = ((MGBGL_PreRateLstReg)this).new Del04();
	}

	public static MGBGL_PreRateLstReg.Del04 crtDel04() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initDel04();
		return lgc.aDel04;
	}

	protected void paramDel04(MCParam p) {
		if (this.aDel04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel04.up0());
		p.addUpBlock(aDel04.up1());
	}

	protected void doDel04() {
		aDel04.call();
	};

	/**
	 * Del04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createDel04_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
	}

	/**
	 * Del04_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createDel04_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBGL0130_Ins01_INFO;
		this.aIns01 = ((MGBGL_PreRateLstReg)this).new Ins01();
	}

	public static MGBGL_PreRateLstReg.Ins01 crtIns01() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MG_MGBGL0130_Ins02_INFO;
		this.aIns02 = ((MGBGL_PreRateLstReg)this).new Ins02();
	}

	public static MGBGL_PreRateLstReg.Ins02 crtIns02() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
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
	 * Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createIns02_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
	}

	/**
	 * Ins02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createIns02_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
	}

	/**
	 * Ins02_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createIns02_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
	}
	protected MGBGL_PreRateLstReg.Ins03 aIns03;

	protected void initIns03() {
		this.info = PDef.MG_MGBGL0130_Ins03_INFO;
		this.aIns03 = ((MGBGL_PreRateLstReg)this).new Ins03();
	}

	public static MGBGL_PreRateLstReg.Ins03 crtIns03() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initIns03();
		return lgc.aIns03;
	}

	protected void paramIns03(MCParam p) {
		if (this.aIns03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns03.up0());
		p.addUpBlock(aIns03.up1());
	}

	protected void doIns03() {
		aIns03.call();
	};

	/**
	 * Ins03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createIns03_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
	}

	/**
	 * Ins03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createIns03_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
	}

	/**
	 * Ins03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createIns03_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
	}
	protected MGBGL_PreRateLstReg.Ins04 aIns04;

	protected void initIns04() {
		this.info = PDef.MG_MGBGL0130_Ins04_INFO;
		this.aIns04 = ((MGBGL_PreRateLstReg)this).new Ins04();
	}

	public static MGBGL_PreRateLstReg.Ins04 crtIns04() {
		MGBGL_PreRateLstReg lgc = new MGBGL_PreRateLstReg();
		lgc.initIns04();
		return lgc.aIns04;
	}

	protected void paramIns04(MCParam p) {
		if (this.aIns04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns04.up0());
		p.addUpBlock(aIns04.up1());
		p.addUpBlock(aIns04.up2());
	}

	protected void doIns04() {
		aIns04.call();
	};

	/**
	 * Ins04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createIns04_CndR(){
		return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
	}

	/**
	 * Ins04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createIns04_RsltR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
	}

	/**
	 * Ins04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createIns04_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
	}

	/**
	 * Ins04_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createIns04_TgtR(){
		return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
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
		private final mcframe.serverMGBG.MGBGL0130.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Srch01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
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
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>alc_ac_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Srch01_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_nm</td></tr>
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
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>term_rmrks</td></tr>
		 * 	<tr><td><br></td><td>term_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>term_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>term_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mly_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mly_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mly_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mly_sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>dpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>ctg_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>po_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_alc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CrtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR createChk01_CrtlR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0() {
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
		 * @see mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_CrtlR up1() {
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>typ.dpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.loc_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.oper_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.bp_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.ctg_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.itm_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.lot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sublot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno1_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno2_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno3_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno4_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.inst_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.iv_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.po_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.slo_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.alc_ac_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.wg_alc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う（月次）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR.create();
			up2 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
		}

		/**
		 * Chk02_CrtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR createChk02_CrtlR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR.create();
		}

		/**
		 * Chk02_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createChk02_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0() {
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
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_CrtlR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up2() {
			return up2;
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
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sa_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>typ.dpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.loc_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.oper_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.bp_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.ctg_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.itm_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.lot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sublot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno1_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno2_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno3_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno4_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.inst_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.iv_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.po_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.slo_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.alc_ac_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.wg_alc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 削除する前のチェックを行う（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk03_RsltR createChk03_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.create();
		}

		/**
		 * Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> createChk03_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 削除する前のチェックを行う（月次）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk04_RsltR createChk04_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.create();
		}

		/**
		 * Chk04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> createChk04_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
		}

		/**
		 * Chk04_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createChk04_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
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
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.sa_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 一括削除する前のチェックを行う（期間）<br>
	 */
	abstract public class Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk05_CndR down0;
		
		
		// コンストラクタ
		protected Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
			down0 = mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createChk05_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
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
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk05_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0() {
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
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk05_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk06オペレーション.<p>
	 *
	 * 一括削除する前のチェックを行う（月次）<br>
	 */
	abstract public class Chk06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk06_CndR down0;
		
		
		// コンストラクタ
		protected Chk06() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
			down0 = mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk06_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createChk06_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
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
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk06_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0() {
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
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk06_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力処理をする（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createImp01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
		}

		/**
		 * Imp01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createImp01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>typ.dpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.loc_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.oper_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.bp_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.ctg_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.itm_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.lot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sublot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno1_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno2_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno3_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno4_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.inst_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.iv_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.po_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.slo_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.alc_ac_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.wg_alc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Imp02オペレーション.<p>
	 *
	 * ファイル入力処理をする（月次）<br>
	 */
	abstract public class Imp02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Imp02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createImp02_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
		}

		/**
		 * Imp02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createImp02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
		}

		/**
		 * Imp02_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createImp02_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>typ.dpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.loc_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.oper_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.bp_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.ctg_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.itm_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.lot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sublot_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno1_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno2_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno3_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.sno4_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.inst_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.iv_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.po_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.slo_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.alc_ac_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>typ.wg_alc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録・訂正処理をする（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0() {
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 登録・訂正処理をする（月次）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createUpd02_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
		}

		/**
		 * Upd02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createUpd02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
		}

		/**
		 * Upd02_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createUpd02_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk03_RsltR createDel01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> up0() {
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 削除処理をする（月次）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk04_RsltR createDel02_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.create();
		}

		/**
		 * Del02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> createDel02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk04_RsltR.class);
		}

		/**
		 * Del02_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createDel02_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Del03オペレーション.<p>
	 *
	 * 一括削除処理をする（期間）<br>
	 */
	abstract public class Del03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0;
		
		
		// コンストラクタ
		protected Del03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createDel03_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
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
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk05_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Del04オペレーション.<p>
	 *
	 * 一括削除処理をする（月次）<br>
	 */
	abstract public class Del04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		
		
		// コンストラクタ
		protected Del04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createDel04_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
		}

		/**
		 * Del04_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createDel04_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
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
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk06_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイル取込処理をする（期間）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * ファイル取込処理をする（月次）<br>
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
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
			up1 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createIns02_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
		}

		/**
		 * Ins02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createIns02_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
		}

		/**
		 * Ins02_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createIns02_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins03オペレーション.<p>
	 *
	 * 一括削除後ファイル取込処理をする（期間）<br>
	 */
	abstract public class Ins03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up1;
		
		
		// コンストラクタ
		protected Ins03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
			up1 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);

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
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR createIns03_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk05_CndR.create();
		}

		/**
		 * Ins03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk01_RsltR createIns03_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.create();
		}

		/**
		 * Ins03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> createIns03_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk01_RsltR.class);
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
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk05_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk05_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins04オペレーション.<p>
	 *
	 * 一括削除後ファイル取込処理をする（月次）<br>
	 */
	abstract public class Ins04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up2;
		
		
		// コンストラクタ
		protected Ins04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
			up1 = MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
			up2 = mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR createIns04_CndR(){
			return mcframe.serverMGBG.MGBGL0130.Chk06_CndR.create();
		}

		/**
		 * Ins04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_RsltR createIns04_RsltR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.create();
		}

		/**
		 * Ins04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> createIns04_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0130.Chk02_RsltR.class);
		}

		/**
		 * Ins04_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR createIns04_TgtR(){
			return mcframe.serverMGBG.MGBGL0130.Chk02_TgtR.create();
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
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk06_CndR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk06_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.ym</td></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0130.Chk02_RsltR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0130.Chk02_TgtR
		 */
		public mcframe.serverMGBG.MGBGL0130.Chk02_TgtR up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreRateLstReg)MGBGL_PreRateLstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}