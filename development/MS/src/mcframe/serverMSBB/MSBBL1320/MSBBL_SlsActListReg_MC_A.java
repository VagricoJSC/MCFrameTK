package mcframe.serverMSBB.MSBBL1320;

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
 * "MSBBL_SlsActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsActListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL1320";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsActListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1320_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsActListReg)this).new Srch01();
	}

	public static MSBBL_SlsActListReg.Srch01 crtSrch01() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
	public mcframe.serverMSBB.MSBBL1320.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);
	}
	protected MSBBL_SlsActListReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBBL1320_Srch02_INFO;
		this.aSrch02 = ((MSBBL_SlsActListReg)this).new Srch02();
	}

	public static MSBBL_SlsActListReg.Srch02 crtSrch02() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
	public mcframe.serverMSBB.MSBBL1320.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Srch01_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);
	}
	protected MSBBL_SlsActListReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL1320_Chk01_INFO;
		this.aChk01 = ((MSBBL_SlsActListReg)this).new Chk01();
	}

	public static MSBBL_SlsActListReg.Chk01 crtChk01() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
	}

	/**
	 * Chk01_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR createChk01_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.create();
	}

	/**
	 * Chk01_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> createChk01_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);
	}

	/**
	 * Chk01_Calc01HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk01_Calc01HdrR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
	}

	/**
	 * Chk01_Calc01HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk01_Calc01HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
	}
	protected MSBBL_SlsActListReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBBL1320_Chk02_INFO;
		this.aChk02 = ((MSBBL_SlsActListReg)this).new Chk02();
	}

	public static MSBBL_SlsActListReg.Chk02 crtChk02() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
		p.addDownBlock(aChk02.down1());
		p.addDownBlock(aChk02.down2());
		p.addDownBlock(aChk02.down3());
		p.addDownBlock(aChk02.down4());
		p.addDownBlock(aChk02.down5());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
	}

	/**
	 * Chk02_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR createChk02_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.create();
	}

	/**
	 * Chk02_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> createChk02_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);
	}

	/**
	 * Chk02_SlsActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR createChk02_SlsActR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.create();
	}

	/**
	 * Chk02_SlsActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> createChk02_SlsActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
	}

	/**
	 * Chk02_SlsActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR createChk02_SlsActDtlR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.create();
	}

	/**
	 * Chk02_SlsActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> createChk02_SlsActDtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
	}

	/**
	 * Chk02_Calc01HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk02_Calc01HdrR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
	}

	/**
	 * Chk02_Calc01HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk02_Calc01HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
	}

	/**
	 * Chk02_PurcActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR createChk02_PurcActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR.create();
	}

	/**
	 * Chk02_PurcActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> createChk02_PurcActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR.class);
	}
	protected MSBBL_SlsActListReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBBL1320_Chk03_INFO;
		this.aChk03 = ((MSBBL_SlsActListReg)this).new Chk03();
	}

	public static MSBBL_SlsActListReg.Chk03 crtChk03() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
		p.addDownBlock(aChk03.down1());
		p.addDownBlock(aChk03.down2());
		p.addDownBlock(aChk03.down3());
		p.addDownBlock(aChk03.down4());
		p.addDownBlock(aChk03.down5());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_RsltR createChk03_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.create();
	}

	/**
	 * Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> createChk03_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
	}

	/**
	 * Chk03_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR createChk03_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.create();
	}

	/**
	 * Chk03_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> createChk03_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);
	}

	/**
	 * Chk03_SlsActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR createChk03_SlsActR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.create();
	}

	/**
	 * Chk03_SlsActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> createChk03_SlsActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
	}

	/**
	 * Chk03_SlsActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR createChk03_SlsActDtlR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.create();
	}

	/**
	 * Chk03_SlsActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> createChk03_SlsActDtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
	}

	/**
	 * Chk03_Calc01HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk03_Calc01HdrR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
	}

	/**
	 * Chk03_Calc01HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk03_Calc01HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
	}

	/**
	 * Chk03_PurcActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR createChk03_PurcActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR.create();
	}

	/**
	 * Chk03_PurcActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> createChk03_PurcActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR.class);
	}
	protected MSBBL_SlsActListReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBBL1320_Ins01_INFO;
		this.aIns01 = ((MSBBL_SlsActListReg)this).new Ins01();
	}

	public static MSBBL_SlsActListReg.Ins01 crtIns01() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
	public mcframe.serverMSBB.MSBBL1320.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
	}

	/**
	 * Ins01_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR createIns01_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.create();
	}

	/**
	 * Ins01_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> createIns01_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);
	}

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Ins01_CndR createIns01_CndR(){
		return mcframe.serverMSBB.MSBBL1320.Ins01_CndR.create();
	}
	protected MSBBL_SlsActListReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL1320_Upd01_INFO;
		this.aUpd01 = ((MSBBL_SlsActListReg)this).new Upd01();
	}

	public static MSBBL_SlsActListReg.Upd01 crtUpd01() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
	public mcframe.serverMSBB.MSBBL1320.Chk02_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
	}

	/**
	 * Upd01_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR createUpd01_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.create();
	}

	/**
	 * Upd01_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> createUpd01_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);
	}

	/**
	 * Upd01_SlsActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR createUpd01_SlsActR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.create();
	}

	/**
	 * Upd01_SlsActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> createUpd01_SlsActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
	}

	/**
	 * Upd01_SlsActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR createUpd01_SlsActDtlR(){
		return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.create();
	}

	/**
	 * Upd01_SlsActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> createUpd01_SlsActDtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
	}

	/**
	 * Upd01_PurcActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR createUpd01_PurcActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR.create();
	}

	/**
	 * Upd01_PurcActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> createUpd01_PurcActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMSBB.MSBBL1320.Upd01_CndR.create();
	}
	protected MSBBL_SlsActListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBBL1320_Del01_INFO;
		this.aDel01 = ((MSBBL_SlsActListReg)this).new Del01();
	}

	public static MSBBL_SlsActListReg.Del01 crtDel01() {
		MSBBL_SlsActListReg lgc = new MSBBL_SlsActListReg();
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
	public mcframe.serverMSBB.MSBBL1320.Chk03_RsltR createDel01_RsltR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
	}

	/**
	 * Del01_SlsActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR createDel01_SlsActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.create();
	}

	/**
	 * Del01_SlsActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> createDel01_SlsActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);
	}

	/**
	 * Del01_SlsActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR createDel01_SlsActR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.create();
	}

	/**
	 * Del01_SlsActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> createDel01_SlsActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
	}

	/**
	 * Del01_SlsActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR createDel01_SlsActDtlR(){
		return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.create();
	}

	/**
	 * Del01_SlsActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> createDel01_SlsActDtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
	}

	/**
	 * Del01_PurcActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR createDel01_PurcActIoR(){
		return mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR.create();
	}

	/**
	 * Del01_PurcActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> createDel01_PurcActIoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR.class);
	}

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1320.Del01_CndR createDel01_CndR(){
		return mcframe.serverMSBB.MSBBL1320.Del01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上予定を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1320.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);

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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);
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
		 * 	<tr><td><br></td><td>arrv_base_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>arrv_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_ship_ord_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>non_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ord_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_hm_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm_to</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1320.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
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
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
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
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
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
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
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
		 * 	<tr><td><br></td><td>bp_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>org_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>init_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>init_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 売上実績を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1320.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);

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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBB.MSBBL1320.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Srch01_RsltR.class);
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
		 * 	<tr><td><br></td><td>arrv_base_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>arrv_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_ship_ord_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>non_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ord_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_hm_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm_to</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sls_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1320.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1320.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
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
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
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
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
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
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>bp_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>org_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ddlv_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>init_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>init_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);

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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
		}

		/**
		 * Chk01_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR createChk01_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.create();
		}

		/**
		 * Chk01_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> createChk01_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);
		}

		/**
		 * Chk01_Calc01HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk01_Calc01HdrR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
		}

		/**
		 * Chk01_Calc01HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk01_Calc01HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_m</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sls_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sls_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_add_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_add_tax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_add_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>accpt_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_accpt_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_cnt</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_cnt</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_cnt</td></tr>
		 * 	<tr><td><br></td><td>org_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_cnt</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 更新前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> down5;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
			down4 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
			down5 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR.class);

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
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
		}

		/**
		 * Chk02_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR createChk02_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.create();
		}

		/**
		 * Chk02_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> createChk02_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);
		}

		/**
		 * Chk02_SlsActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR createChk02_SlsActR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.create();
		}

		/**
		 * Chk02_SlsActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> createChk02_SlsActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
		}

		/**
		 * Chk02_SlsActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR createChk02_SlsActDtlR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.create();
		}

		/**
		 * Chk02_SlsActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> createChk02_SlsActDtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
		}

		/**
		 * Chk02_Calc01HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk02_Calc01HdrR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
		}

		/**
		 * Chk02_Calc01HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk02_Calc01HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
		}

		/**
		 * Chk02_PurcActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR createChk02_PurcActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR.create();
		}

		/**
		 * Chk02_PurcActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> createChk02_PurcActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_m</td></tr>
		 * 	<tr><td><br></td><td>dlv_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sls_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sls_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_add_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_add_tax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_add_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>accpt_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_accpt_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_accpt_amt</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_cnt</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_cnt</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_cnt</td></tr>
		 * 	<tr><td><br></td><td>org_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sa.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>sa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_no</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.acst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.xrate</td></tr>
		 * 	<tr><td><br></td><td>sa.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.slo_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sa.qtn_no</td></tr>
		 * 	<tr><td><br></td><td>sa.qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sa.slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.adjst_tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_adjst_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.adjst_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sa.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sad.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>sad.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.cost_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.cost_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ar_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>sad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.slo_no</td></tr>
		 * 	<tr><td><br></td><td>sad.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_no</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.ext_purc_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> down5;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
			down4 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
			down5 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR.class);

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
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
		}
		/**
		 * Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_RsltR createChk03_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.create();
		}

		/**
		 * Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> createChk03_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
		}

		/**
		 * Chk03_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR createChk03_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.create();
		}

		/**
		 * Chk03_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> createChk03_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);
		}

		/**
		 * Chk03_SlsActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR createChk03_SlsActR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.create();
		}

		/**
		 * Chk03_SlsActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> createChk03_SlsActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
		}

		/**
		 * Chk03_SlsActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR createChk03_SlsActDtlR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.create();
		}

		/**
		 * Chk03_SlsActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> createChk03_SlsActDtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
		}

		/**
		 * Chk03_Calc01HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR createChk03_Calc01HdrR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.create();
		}

		/**
		 * Chk03_Calc01HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> createChk03_Calc01HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR.class);
		}

		/**
		 * Chk03_PurcActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR createChk03_PurcActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR.create();
		}

		/**
		 * Chk03_PurcActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> createChk03_PurcActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sa.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>sa.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sa.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_no</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.acst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.xrate</td></tr>
		 * 	<tr><td><br></td><td>sa.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.slo_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sa.qtn_no</td></tr>
		 * 	<tr><td><br></td><td>sa.qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sa.slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.adjst_tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.sls_adjst_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.adjst_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sa.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sad.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>sad.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sad.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4</td></tr>
		 * 	<tr><td><br></td><td>sad.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>sad.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.cost_upri</td></tr>
		 * 	<tr><td><br></td><td>sad.cost_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sad.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sad.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.ar_typ</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sad.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>sad.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sad.slo_no</td></tr>
		 * 	<tr><td><br></td><td>sad.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_no</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sad.qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sad.ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_Calc01HdrR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上実績情報を登録する<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1320.Ins01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> down0;
		/** [Ins01_SlsActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> aIns01_SlsActIo;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_RsltR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR&gt; （{@link #chk01_down1}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> chk01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> chk01_down1;
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1320.Ins01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
			aIns01_SlsActIo = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR>)chk01.up(0);
			chk01_down0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR>)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR>)chk01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_RsltR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR&gt;（{@link #chk01_down1}）=> aIns01_SlsActIo<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), aIns01_SlsActIo, chk01_down0, chk01_down1);
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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR.class);
		}

		/**
		 * Ins01_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR createIns01_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.create();
		}

		/**
		 * Ins01_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> createIns01_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR.class);
		}

		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Ins01_CndR createIns01_CndR(){
			return mcframe.serverMSBB.MSBBL1320.Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> up0() {
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
		 * @see mcframe.serverMSBB.MSBBL1320.Ins01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1320.Ins01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Ins01_SlsActIo]ブロックのコンテナaIns01_SlsActIoLを返します。
		 *
		 * @return Ins01_SlsActIoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> Ins01_SlsActIo() {
			return aIns01_SlsActIo;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> dest0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> src_Ins01_Rslt){
			up_CALL_OPE_chk01_0(dest0_0, src_Ins01_Rslt);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no");
				addColumnPathMap("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ptax_dt", "ptax_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("dtl_sub_char1", "dtl_sub_char1");
				addColumnPathMap("dtl_sub_char2", "dtl_sub_char2");
				addColumnPathMap("dtl_sub_char3", "dtl_sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> dest_Ins01_Rslt, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> dest_Ins01_SlsActIo, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> src0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> src0_1){
			down_CALL_OPE_chk01_0(dest_Ins01_Rslt, src0_0);
			down_CALL_OPE_chk01_1(dest_Ins01_SlsActIo, src0_1);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_tgt_typ", "sls_tgt_typ");
				addColumnPathMap("sls_schd_dt", "sls_schd_dt");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_amt_dec_place", "trd_amt_dec_place");
				addColumnPathMap("trd_upri_dec_place", "trd_upri_dec_place");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("base_amt_dec_place", "base_amt_dec_place");
				addColumnPathMap("base_upri_dec_place", "base_upri_dec_place");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("ptax_amt_dec_place", "ptax_amt_dec_place");
				addColumnPathMap("ptax_upri_dec_place", "ptax_upri_dec_place");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no");
				addColumnPathMap("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("dlv_ac_m", "dlv_ac_m");
				addColumnPathMap("dlv_ac_dt", "dlv_ac_dt");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_basis_ym", "sls_basis_ym");
				addColumnPathMap("sls_basis_dt", "sls_basis_dt");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("po_no", "po_no");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("tdlv_sundry_flg", "tdlv_sundry_flg");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sls_lot_no", "sls_lot_no");
				addColumnPathMap("sls_sublot_no", "sls_sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("multi_io_flg", "multi_io_flg");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("sls_schd_qty", "sls_schd_qty");
				addColumnPathMap("abort_qty", "abort_qty");
				addColumnPathMap("sls_qty", "sls_qty");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_add_tax_amt", "trd_cur_add_tax_amt");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_amt_add_tax_cur_amt", "base_cur_amt_add_tax_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_add_tax_amt", "ptax_cur_add_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ptax_dt", "ptax_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("dtl_sub_char1", "dtl_sub_char1");
				addColumnPathMap("dtl_sub_char2", "dtl_sub_char2");
				addColumnPathMap("dtl_sub_char3", "dtl_sub_char3");
				addColumnPathMap("accpt_sts_typ", "accpt_sts_typ");
				addColumnPathMap("trd_unit_accpt_qty", "trd_unit_accpt_qty");
				addColumnPathMap("trd_cur_accpt_amt", "trd_cur_accpt_amt");
				addColumnPathMap("base_cur_accpt_amt", "base_cur_accpt_amt");
				addColumnPathMap("ptax_cur_accpt_amt", "ptax_cur_accpt_amt");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("purc_schd_no", "purc_schd_no");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_alloc_sts_cnt", "ship_alloc_sts_cnt");
				addColumnPathMap("ship_act_d_cnt", "ship_act_d_cnt");
				addColumnPathMap("iv_ship_act_d_cnt", "iv_ship_act_d_cnt");
				addColumnPathMap("org_trd_cur_upri", "org_trd_cur_upri");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("cred_cd", "cred_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("ship_act_service_exec_flg", "ship_act_service_exec_flg");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("tax_typ", "tax_typ");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("cost_amt", "cost_amt");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("purc_ddlv_po_no", "purc_ddlv_po_no");
				addColumnPathMap("purc_ddlv_po_d_no", "purc_ddlv_po_d_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("purc_act_d_no", "purc_act_d_no");
				addColumnPathMap("purc_act_seq", "purc_act_seq");
				addColumnPathMap("purc_act_d_seq", "purc_act_d_seq");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("purc_act_io_seq", "purc_act_io_seq");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("dlv_slip_d_cnt", "dlv_slip_d_cnt");
				addColumnPathMap("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("iv_ship_act_d_no", "iv_ship_act_d_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("pack_unit_cd", "pack_unit_cd");
				addColumnPathMap("pack_unit_qty", "pack_unit_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_schd_abort_flg", "sls_schd_abort_flg");
				addColumnPathMap("sls_ret_schd_flg", "sls_ret_schd_flg");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("new_hdr_peg_no", "new_hdr_peg_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR r_dest, mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk01_SlsActIoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報を訂正する<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1320.Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> down0;
		/** [Upd01_PurcActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> aUpd01_PurcActIo;
		/** [Upd01_SlsAct]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> aUpd01_SlsAct;
		/** [Upd01_SlsActDtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> aUpd01_SlsActDtl;
		/** [Upd01_SlsActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> aUpd01_SlsActIo;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk02 （{@link #chk02}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_RsltR&gt; （{@link #chk02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_RsltR&gt; （{@link #chk02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR&gt; （{@link #chk02_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR&gt; （{@link #chk02_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR&gt; （{@link #chk02_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR&gt; （{@link #chk02_down4}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk02 chk02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> chk02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> chk02_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> chk02_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> chk02_down2;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> chk02_down3;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> chk02_down4;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1320.Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
			aUpd01_PurcActIo = MCList.create(mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR.class);
			aUpd01_SlsAct = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
			aUpd01_SlsActDtl = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
			aUpd01_SlsActIo = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR>)chk02.up(0);
			chk02_down0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR>)chk02.down(0);
			chk02_down1 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR>)chk02.down(1);
			chk02_down2 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR>)chk02.down(2);
			chk02_down3 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR>)chk02.down(3);
			chk02_down4 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR>)chk02.down(5);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_RsltR&gt; （{@link #chk02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_RsltR&gt;（{@link #chk02_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR&gt;（{@link #chk02_down1}）=> aUpd01_SlsActIo<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR&gt;（{@link #chk02_down2}）=> aUpd01_SlsAct<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR&gt;（{@link #chk02_down3}）=> aUpd01_SlsActDtl<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR&gt;（{@link #chk02_down4}）=> aUpd01_PurcActIo<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), aUpd01_SlsActIo, aUpd01_SlsAct, aUpd01_SlsActDtl, aUpd01_PurcActIo, chk02_down0, chk02_down1, chk02_down2, chk02_down3, chk02_down4);
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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR.class);
		}

		/**
		 * Upd01_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR createUpd01_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.create();
		}

		/**
		 * Upd01_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> createUpd01_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR.class);
		}

		/**
		 * Upd01_SlsActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR createUpd01_SlsActR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.create();
		}

		/**
		 * Upd01_SlsActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> createUpd01_SlsActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR.class);
		}

		/**
		 * Upd01_SlsActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR createUpd01_SlsActDtlR(){
			return mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.create();
		}

		/**
		 * Upd01_SlsActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> createUpd01_SlsActDtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR.class);
		}

		/**
		 * Upd01_PurcActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR createUpd01_PurcActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR.create();
		}

		/**
		 * Upd01_PurcActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> createUpd01_PurcActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMSBB.MSBBL1320.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> up0() {
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
		 * @see mcframe.serverMSBB.MSBBL1320.Upd01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1320.Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> down0() {
			return down0;
		}


		/**
		 * [Upd01_PurcActIo]ブロックのコンテナaUpd01_PurcActIoLを返します。
		 *
		 * @return Upd01_PurcActIoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> Upd01_PurcActIo() {
			return aUpd01_PurcActIo;
		}

		/**
		 * [Upd01_SlsAct]ブロックのコンテナaUpd01_SlsActLを返します。
		 *
		 * @return Upd01_SlsActL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> Upd01_SlsAct() {
			return aUpd01_SlsAct;
		}

		/**
		 * [Upd01_SlsActDtl]ブロックのコンテナaUpd01_SlsActDtlLを返します。
		 *
		 * @return Upd01_SlsActDtlL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> Upd01_SlsActDtl() {
			return aUpd01_SlsActDtl;
		}

		/**
		 * [Upd01_SlsActIo]ブロックのコンテナaUpd01_SlsActIoLを返します。
		 *
		 * @return Upd01_SlsActIoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> Upd01_SlsActIo() {
			return aUpd01_SlsActIo;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> dest0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> src_Upd01_Rslt){
			up_CALL_OPE_chk02_0(dest0_0, src_Upd01_Rslt);
		}
		
		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ptax_dt", "ptax_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("dtl_sub_char1", "dtl_sub_char1");
				addColumnPathMap("dtl_sub_char2", "dtl_sub_char2");
				addColumnPathMap("dtl_sub_char3", "dtl_sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk02_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk02_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> dest_Upd01_Rslt, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> dest_Upd01_SlsActIo, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> dest_Upd01_SlsAct, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> dest_Upd01_SlsActDtl, MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> dest_Upd01_PurcActIo, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> src0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> src0_1, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> src0_2, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> src0_3, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> src0_4){
			down_CALL_OPE_chk02_0(dest_Upd01_Rslt, src0_0);
			down_CALL_OPE_chk02_1(dest_Upd01_SlsActIo, src0_1);
			down_CALL_OPE_chk02_2(dest_Upd01_SlsAct, src0_2);
			down_CALL_OPE_chk02_3(dest_Upd01_SlsActDtl, src0_3);
			down_CALL_OPE_chk02_4(dest_Upd01_PurcActIo, src0_4);
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_tgt_typ", "sls_tgt_typ");
				addColumnPathMap("sls_schd_dt", "sls_schd_dt");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_amt_dec_place", "trd_amt_dec_place");
				addColumnPathMap("trd_upri_dec_place", "trd_upri_dec_place");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("base_amt_dec_place", "base_amt_dec_place");
				addColumnPathMap("base_upri_dec_place", "base_upri_dec_place");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("ptax_amt_dec_place", "ptax_amt_dec_place");
				addColumnPathMap("ptax_upri_dec_place", "ptax_upri_dec_place");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no");
				addColumnPathMap("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("dlv_ac_m", "dlv_ac_m");
				addColumnPathMap("dlv_ac_dt", "dlv_ac_dt");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_basis_ym", "sls_basis_ym");
				addColumnPathMap("sls_basis_dt", "sls_basis_dt");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("po_no", "po_no");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("tdlv_sundry_flg", "tdlv_sundry_flg");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("crt_lot_flg", "crt_lot_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sls_lot_no", "sls_lot_no");
				addColumnPathMap("sls_sublot_no", "sls_sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ship_fr_valid_dt", "ship_fr_valid_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("multi_io_flg", "multi_io_flg");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("sls_schd_qty", "sls_schd_qty");
				addColumnPathMap("abort_qty", "abort_qty");
				addColumnPathMap("sls_qty", "sls_qty");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_add_tax_amt", "trd_cur_add_tax_amt");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_amt_add_tax_cur_amt", "base_cur_amt_add_tax_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_add_tax_amt", "ptax_cur_add_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ptax_dt", "ptax_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_d_rmrks", "intr_d_rmrks");
				addColumnPathMap("dtl_sub_char1", "dtl_sub_char1");
				addColumnPathMap("dtl_sub_char2", "dtl_sub_char2");
				addColumnPathMap("dtl_sub_char3", "dtl_sub_char3");
				addColumnPathMap("accpt_sts_typ", "accpt_sts_typ");
				addColumnPathMap("trd_unit_accpt_qty", "trd_unit_accpt_qty");
				addColumnPathMap("trd_cur_accpt_amt", "trd_cur_accpt_amt");
				addColumnPathMap("base_cur_accpt_amt", "base_cur_accpt_amt");
				addColumnPathMap("ptax_cur_accpt_amt", "ptax_cur_accpt_amt");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("purc_schd_no", "purc_schd_no");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_alloc_sts_cnt", "ship_alloc_sts_cnt");
				addColumnPathMap("ship_act_d_cnt", "ship_act_d_cnt");
				addColumnPathMap("iv_ship_act_d_cnt", "iv_ship_act_d_cnt");
				addColumnPathMap("org_trd_cur_upri", "org_trd_cur_upri");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("cred_cd", "cred_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("ship_act_service_exec_flg", "ship_act_service_exec_flg");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("tax_typ", "tax_typ");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("cost_amt", "cost_amt");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("purc_ddlv_po_no", "purc_ddlv_po_no");
				addColumnPathMap("purc_ddlv_po_d_no", "purc_ddlv_po_d_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("purc_act_d_no", "purc_act_d_no");
				addColumnPathMap("purc_act_seq", "purc_act_seq");
				addColumnPathMap("purc_act_d_seq", "purc_act_d_seq");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("purc_act_io_seq", "purc_act_io_seq");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("bp_lot_no", "bp_lot_no");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_purc_act_d_no", "ext_purc_act_d_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_RsltR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("iv_ship_act_d_no", "iv_ship_act_d_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("pack_unit_cd", "pack_unit_cd");
				addColumnPathMap("pack_unit_qty", "pack_unit_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_schd_abort_flg", "sls_schd_abort_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_flg", "sls_ret_schd_flg");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("new_hdr_peg_no", "new_hdr_peg_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_1(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_1(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_1();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk02_SlsActIoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sa.sls_act_no", "sa.sls_act_no");
				addColumnPathMap("sa.sls_act_seq", "sa.sls_act_seq");
				addColumnPathMap("sa.sls_act_rev", "sa.sls_act_rev");
				addColumnPathMap("sa.slip_sts_typ", "sa.slip_sts_typ");
				addColumnPathMap("sa.trd_cd", "sa.trd_cd");
				addColumnPathMap("sa.trd_ptn_typ", "sa.trd_ptn_typ");
				addColumnPathMap("sa.ac_ym", "sa.ac_ym");
				addColumnPathMap("sa.ac_dt", "sa.ac_dt");
				addColumnPathMap("sa.sls_dpt_cd", "sa.sls_dpt_cd");
				addColumnPathMap("sa.wg_cd", "sa.wg_cd");
				addColumnPathMap("sa.sls_usr_cd", "sa.sls_usr_cd");
				addColumnPathMap("sa.sls_dt", "sa.sls_dt");
				addColumnPathMap("sa.ship_tm", "sa.ship_tm");
				addColumnPathMap("sa.dlv_tm", "sa.dlv_tm");
				addColumnPathMap("sa.cst_cd", "sa.cst_cd");
				addColumnPathMap("sa.iv_no", "sa.iv_no");
				addColumnPathMap("sa.ref_iv_no", "sa.ref_iv_no");
				addColumnPathMap("sa.rcpt_iv_mng_no", "sa.rcpt_iv_mng_no");
				addColumnPathMap("sa.rcpt_iv_no", "sa.rcpt_iv_no");
				addColumnPathMap("sa.tterm_cd1", "sa.tterm_cd1");
				addColumnPathMap("sa.tterm_rmrks1", "sa.tterm_rmrks1");
				addColumnPathMap("sa.tterm_cd2", "sa.tterm_cd2");
				addColumnPathMap("sa.tterm_rmrks2", "sa.tterm_rmrks2");
				addColumnPathMap("sa.tterm_cd3", "sa.tterm_cd3");
				addColumnPathMap("sa.tterm_rmrks3", "sa.tterm_rmrks3");
				addColumnPathMap("sa.lc_no", "sa.lc_no");
				addColumnPathMap("sa.lc_dt", "sa.lc_dt");
				addColumnPathMap("sa.lc_rmrks", "sa.lc_rmrks");
				addColumnPathMap("sa.rcv_schd_dt", "sa.rcv_schd_dt");
				addColumnPathMap("sa.bill_basis_dt", "sa.bill_basis_dt");
				addColumnPathMap("sa.cred_cd", "sa.cred_cd");
				addColumnPathMap("sa.bcst_cd", "sa.bcst_cd");
				addColumnPathMap("sa.acst_cd", "sa.acst_cd");
				addColumnPathMap("sa.ar_dpt_cd", "sa.ar_dpt_cd");
				addColumnPathMap("sa.cst_po_no", "sa.cst_po_no");
				addColumnPathMap("sa.trd_cur_cd", "sa.trd_cur_cd");
				addColumnPathMap("sa.base_cur_cd", "sa.base_cur_cd");
				addColumnPathMap("sa.xrate_cd", "sa.xrate_cd");
				addColumnPathMap("sa.xrate", "sa.xrate");
				addColumnPathMap("sa.ptax_cur_cd", "sa.ptax_cur_cd");
				addColumnPathMap("sa.ptax_xrate", "sa.ptax_xrate");
				addColumnPathMap("sa.trd_cur_amt", "sa.trd_cur_amt");
				addColumnPathMap("sa.trd_cur_tax_amt", "sa.trd_cur_tax_amt");
				addColumnPathMap("sa.base_cur_amt", "sa.base_cur_amt");
				addColumnPathMap("sa.base_cur_tax_amt", "sa.base_cur_tax_amt");
				addColumnPathMap("sa.trd_rmrks", "sa.trd_rmrks");
				addColumnPathMap("sa.intr_rmrks", "sa.intr_rmrks");
				addColumnPathMap("sa.ship_act_no", "sa.ship_act_no");
				addColumnPathMap("sa.slo_no", "sa.slo_no");
				addColumnPathMap("sa.sls_ret_schd_no", "sa.sls_ret_schd_no");
				addColumnPathMap("sa.qtn_no", "sa.qtn_no");
				addColumnPathMap("sa.qtn_rev", "sa.qtn_rev");
				addColumnPathMap("sa.dlv_slip_no", "sa.dlv_slip_no");
				addColumnPathMap("sa.slip_form_cd", "sa.slip_form_cd");
				addColumnPathMap("sa.aprv_flg", "sa.aprv_flg");
				addColumnPathMap("sa.aprv_no", "sa.aprv_no");
				addColumnPathMap("sa.aprv_sts_typ", "sa.aprv_sts_typ");
				addColumnPathMap("sa.sls_basis_typ", "sa.sls_basis_typ");
				addColumnPathMap("sa.adjst_tgt_dt", "sa.adjst_tgt_dt");
				addColumnPathMap("sa.sls_adjst_typ", "sa.sls_adjst_typ");
				addColumnPathMap("sa.adjst_mtd_typ", "sa.adjst_mtd_typ");
				addColumnPathMap("sa.sub_char1", "sa.sub_char1");
				addColumnPathMap("sa.sub_char2", "sa.sub_char2");
				addColumnPathMap("sa.sub_char3", "sa.sub_char3");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_2(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_2(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_2();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk02_SlsActR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_3() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_3();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sad.sls_act_d_no", "sad.sls_act_d_no");
				addColumnPathMap("sad.sls_act_d_seq", "sad.sls_act_d_seq");
				addColumnPathMap("sad.sls_act_no", "sad.sls_act_no");
				addColumnPathMap("sad.sls_act_seq", "sad.sls_act_seq");
				addColumnPathMap("sad.disp_seq", "sad.disp_seq");
				addColumnPathMap("sad.dlv_cd", "sad.dlv_cd");
				addColumnPathMap("sad.dlv_sundry_flg", "sad.dlv_sundry_flg");
				addColumnPathMap("sad.dlv_nm", "sad.dlv_nm");
				addColumnPathMap("sad.dlv_zip_cd", "sad.dlv_zip_cd");
				addColumnPathMap("sad.dlv_addr1", "sad.dlv_addr1");
				addColumnPathMap("sad.dlv_addr2", "sad.dlv_addr2");
				addColumnPathMap("sad.dlv_addr3", "sad.dlv_addr3");
				addColumnPathMap("sad.dlv_addr4", "sad.dlv_addr4");
				addColumnPathMap("sad.dlv_cntct_dpt", "sad.dlv_cntct_dpt");
				addColumnPathMap("sad.dlv_cntct_psn", "sad.dlv_cntct_psn");
				addColumnPathMap("sad.dlv_tel", "sad.dlv_tel");
				addColumnPathMap("sad.dlv_fax", "sad.dlv_fax");
				addColumnPathMap("sad.pri_prnt_flg", "sad.pri_prnt_flg");
				addColumnPathMap("sad.dest_cd1", "sad.dest_cd1");
				addColumnPathMap("sad.dest_cd2", "sad.dest_cd2");
				addColumnPathMap("sad.dest_cd3", "sad.dest_cd3");
				addColumnPathMap("sad.tdlv_cd", "sad.tdlv_cd");
				addColumnPathMap("sad.tdlv_sundry_flg", "sad.tdlv_sundry_flg");
				addColumnPathMap("sad.tdlv_nm", "sad.tdlv_nm");
				addColumnPathMap("sad.tdlv_zip_cd", "sad.tdlv_zip_cd");
				addColumnPathMap("sad.tdlv_addr1", "sad.tdlv_addr1");
				addColumnPathMap("sad.tdlv_addr2", "sad.tdlv_addr2");
				addColumnPathMap("sad.tdlv_addr3", "sad.tdlv_addr3");
				addColumnPathMap("sad.tdlv_addr4", "sad.tdlv_addr4");
				addColumnPathMap("sad.tdlv_tel", "sad.tdlv_tel");
				addColumnPathMap("sad.tdlv_fax", "sad.tdlv_fax");
				addColumnPathMap("sad.tdlv_cntct_dpt", "sad.tdlv_cntct_dpt");
				addColumnPathMap("sad.tdlv_cntct_psn", "sad.tdlv_cntct_psn");
				addColumnPathMap("sad.itm_cd", "sad.itm_cd");
				addColumnPathMap("sad.itm_sub1", "sad.itm_sub1");
				addColumnPathMap("sad.itm_sub2", "sad.itm_sub2");
				addColumnPathMap("sad.itm_sub3", "sad.itm_sub3");
				addColumnPathMap("sad.sno1", "sad.sno1");
				addColumnPathMap("sad.sno2", "sad.sno2");
				addColumnPathMap("sad.sno3", "sad.sno3");
				addColumnPathMap("sad.sno4", "sad.sno4");
				addColumnPathMap("sad.itm_nm", "sad.itm_nm");
				addColumnPathMap("sad.iv_itm_nm", "sad.iv_itm_nm");
				addColumnPathMap("sad.cntry_org_cd", "sad.cntry_org_cd");
				addColumnPathMap("sad.wrk_no", "sad.wrk_no");
				addColumnPathMap("sad.loc_cd", "sad.loc_cd");
				addColumnPathMap("sad.str_ln_cd", "sad.str_ln_cd");
				addColumnPathMap("sad.lot_no", "sad.lot_no");
				addColumnPathMap("sad.sublot_no", "sad.sublot_no");
				addColumnPathMap("sad.gd_cd", "sad.gd_cd");
				addColumnPathMap("sad.trd_unit_cd", "sad.trd_unit_cd");
				addColumnPathMap("sad.trd_unit_qty", "sad.trd_unit_qty");
				addColumnPathMap("sad.base_unit_cd", "sad.base_unit_cd");
				addColumnPathMap("sad.base_unit_qty", "sad.base_unit_qty");
				addColumnPathMap("sad.trd_cur_upri", "sad.trd_cur_upri");
				addColumnPathMap("sad.trd_cur_amt", "sad.trd_cur_amt");
				addColumnPathMap("sad.upri_not_tgt_flg", "sad.upri_not_tgt_flg");
				addColumnPathMap("sad.interim_flg", "sad.interim_flg");
				addColumnPathMap("sad.tax_cd", "sad.tax_cd");
				addColumnPathMap("sad.trd_cur_tax_amt", "sad.trd_cur_tax_amt");
				addColumnPathMap("sad.base_cur_upri", "sad.base_cur_upri");
				addColumnPathMap("sad.base_cur_amt", "sad.base_cur_amt");
				addColumnPathMap("sad.base_cur_tax_amt", "sad.base_cur_tax_amt");
				addColumnPathMap("sad.ptax_cur_upri", "sad.ptax_cur_upri");
				addColumnPathMap("sad.ptax_cur_amt", "sad.ptax_cur_amt");
				addColumnPathMap("sad.ptax_cur_tax_amt", "sad.ptax_cur_tax_amt");
				addColumnPathMap("sad.cost_upri", "sad.cost_upri");
				addColumnPathMap("sad.trd_cur_dscnt_amt", "sad.trd_cur_dscnt_amt");
				addColumnPathMap("sad.base_cur_dscnt_amt", "sad.base_cur_dscnt_amt");
				addColumnPathMap("sad.ptax_cur_dscnt_amt", "sad.ptax_cur_dscnt_amt");
				addColumnPathMap("sad.dscnt_rsn_cd", "sad.dscnt_rsn_cd");
				addColumnPathMap("sad.bill_crryovr_times", "sad.bill_crryovr_times");
				addColumnPathMap("sad.stk_mng_typ", "sad.stk_mng_typ");
				addColumnPathMap("sad.sundry_itm_flg", "sad.sundry_itm_flg");
				addColumnPathMap("sad.sno1_mng_typ", "sad.sno1_mng_typ");
				addColumnPathMap("sad.sno2_mng_typ", "sad.sno2_mng_typ");
				addColumnPathMap("sad.sno3_mng_typ", "sad.sno3_mng_typ");
				addColumnPathMap("sad.sno4_mng_typ", "sad.sno4_mng_typ");
				addColumnPathMap("sad.ar_typ", "sad.ar_typ");
				addColumnPathMap("sad.cst_po_d_no", "sad.cst_po_d_no");
				addColumnPathMap("sad.cst_itm_cd", "sad.cst_itm_cd");
				addColumnPathMap("sad.cst_itm_nm", "sad.cst_itm_nm");
				addColumnPathMap("sad.trd_d_rmrks", "sad.trd_d_rmrks");
				addColumnPathMap("sad.intr_rmrks", "sad.intr_rmrks");
				addColumnPathMap("sad.rsn_cd", "sad.rsn_cd");
				addColumnPathMap("sad.bd_dpt_cd", "sad.bd_dpt_cd");
				addColumnPathMap("sad.wtax_rate", "sad.wtax_rate");
				addColumnPathMap("sad.wtax_amt", "sad.wtax_amt");
				addColumnPathMap("sad.slo_no", "sad.slo_no");
				addColumnPathMap("sad.slo_d_no", "sad.slo_d_no");
				addColumnPathMap("sad.sls_ret_schd_no", "sad.sls_ret_schd_no");
				addColumnPathMap("sad.sls_ret_schd_d_no", "sad.sls_ret_schd_d_no");
				addColumnPathMap("sad.ship_schd_no", "sad.ship_schd_no");
				addColumnPathMap("sad.sls_schd_no", "sad.sls_schd_no");
				addColumnPathMap("sad.qtn_no", "sad.qtn_no");
				addColumnPathMap("sad.qtn_rev", "sad.qtn_rev");
				addColumnPathMap("sad.qtn_d_no", "sad.qtn_d_no");
				addColumnPathMap("sad.purc_ddlv_po_no", "sad.purc_ddlv_po_no");
				addColumnPathMap("sad.purc_ddlv_po_d_no", "sad.purc_ddlv_po_d_no");
				addColumnPathMap("sad.purc_act_no", "sad.purc_act_no");
				addColumnPathMap("sad.purc_act_d_no", "sad.purc_act_d_no");
				addColumnPathMap("sad.iv_d_no", "sad.iv_d_no");
				addColumnPathMap("sad.sub_char1", "sad.sub_char1");
				addColumnPathMap("sad.sub_char2", "sad.sub_char2");
				addColumnPathMap("sad.sub_char3", "sad.sub_char3");
				addColumnPathMap("sad.ref_sls_act_no", "sad.ref_sls_act_no");
				addColumnPathMap("sad.ref_sls_act_seq", "sad.ref_sls_act_seq");
				addColumnPathMap("sad.ref_sls_act_d_no", "sad.ref_sls_act_d_no");
				addColumnPathMap("sad.ref_sls_act_d_seq", "sad.ref_sls_act_d_seq");
				addColumnPathMap("sad.dlv_slip_d_no", "sad.dlv_slip_d_no");
				addColumnPathMap("sad.ship_dlv_slip_d_no", "sad.ship_dlv_slip_d_no");
				addColumnPathMap("sad.ship_dlv_slip_multi_flg", "sad.ship_dlv_slip_multi_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_3(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_3(MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_3();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk02_SlsActDtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_4() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_4();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_4(mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR r_dest, mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_4(MCList<mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_4();
			for(mcframe.serverMSBB.MSBBL1320.Chk02_PurcActIoR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Upd01_PurcActIoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上実績情報を取り消す<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1320.Del01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> down0;
		/** [Del01_PurcActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> aDel01_PurcActIo;
		/** [Del01_SlsAct]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> aDel01_SlsAct;
		/** [Del01_SlsActDtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> aDel01_SlsActDtl;
		/** [Del01_SlsActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> aDel01_SlsActIo;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk03 （{@link #chk03}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_RsltR&gt; （{@link #chk03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_RsltR&gt; （{@link #chk03_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR&gt; （{@link #chk03_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR&gt; （{@link #chk03_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR&gt; （{@link #chk03_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR&gt; （{@link #chk03_down4}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.Chk03 chk03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> chk03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> chk03_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> chk03_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> chk03_down2;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> chk03_down3;
		public final MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> chk03_down4;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1320.Del01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
			aDel01_PurcActIo = MCList.create(mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR.class);
			aDel01_SlsAct = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
			aDel01_SlsActDtl = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
			aDel01_SlsActIo = MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);

			// 連携オペレーションの初期化
			chk03 = mcframe.serverMSBB.MSBBL1320.MSBBL_SlsActListReg.crtChk03();
			
			// 連携オペレーションのコンテナ取得
			chk03_up0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR>)chk03.up(0);
			chk03_down0 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR>)chk03.down(0);
			chk03_down1 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR>)chk03.down(1);
			chk03_down2 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR>)chk03.down(2);
			chk03_down3 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR>)chk03.down(3);
			chk03_down4 = (MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR>)chk03.down(5);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_RsltR&gt; （{@link #chk03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_RsltR&gt;（{@link #chk03_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR&gt;（{@link #chk03_down1}）=> aDel01_SlsActIo<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR&gt;（{@link #chk03_down2}）=> aDel01_SlsAct<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR&gt;（{@link #chk03_down3}）=> aDel01_SlsActDtl<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR&gt;（{@link #chk03_down4}）=> aDel01_PurcActIo<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), aDel01_SlsActIo, aDel01_SlsAct, aDel01_SlsActDtl, aDel01_PurcActIo, chk03_down0, chk03_down1, chk03_down2, chk03_down3, chk03_down4);
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
			invoke((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_RsltR createDel01_RsltR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR.class);
		}

		/**
		 * Del01_SlsActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR createDel01_SlsActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.create();
		}

		/**
		 * Del01_SlsActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> createDel01_SlsActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR.class);
		}

		/**
		 * Del01_SlsActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR createDel01_SlsActR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.create();
		}

		/**
		 * Del01_SlsActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> createDel01_SlsActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR.class);
		}

		/**
		 * Del01_SlsActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR createDel01_SlsActDtlR(){
			return mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.create();
		}

		/**
		 * Del01_SlsActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> createDel01_SlsActDtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR.class);
		}

		/**
		 * Del01_PurcActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR createDel01_PurcActIoR(){
			return mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR.create();
		}

		/**
		 * Del01_PurcActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> createDel01_PurcActIoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR.class);
		}

		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1320.Del01_CndR createDel01_CndR(){
			return mcframe.serverMSBB.MSBBL1320.Del01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> up0() {
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
		 * @see mcframe.serverMSBB.MSBBL1320.Del01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1320.Del01_CndR up1() {
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
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> down0() {
			return down0;
		}


		/**
		 * [Del01_PurcActIo]ブロックのコンテナaDel01_PurcActIoLを返します。
		 *
		 * @return Del01_PurcActIoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> Del01_PurcActIo() {
			return aDel01_PurcActIo;
		}

		/**
		 * [Del01_SlsAct]ブロックのコンテナaDel01_SlsActLを返します。
		 *
		 * @return Del01_SlsActL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> Del01_SlsAct() {
			return aDel01_SlsAct;
		}

		/**
		 * [Del01_SlsActDtl]ブロックのコンテナaDel01_SlsActDtlLを返します。
		 *
		 * @return Del01_SlsActDtlL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> Del01_SlsActDtl() {
			return aDel01_SlsActDtl;
		}

		/**
		 * [Del01_SlsActIo]ブロックのコンテナaDel01_SlsActIoLを返します。
		 *
		 * @return Del01_SlsActIoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> Del01_SlsActIo() {
			return aDel01_SlsActIo;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActListReg)MSBBL_SlsActListReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> dest0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> src_Del01_Rslt){
			up_CALL_OPE_chk03_0(dest0_0, src_Del01_Rslt);
		}
		
		/**
		 * 連携処理CALL_OPE_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk03_0(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk03_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk03_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> dest_Del01_Rslt, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> dest_Del01_SlsActIo, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> dest_Del01_SlsAct, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> dest_Del01_SlsActDtl, MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> dest_Del01_PurcActIo, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> src0_0, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> src0_1, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> src0_2, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> src0_3, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> src0_4){
			down_CALL_OPE_chk03_0(dest_Del01_Rslt, src0_0);
			down_CALL_OPE_chk03_1(dest_Del01_SlsActIo, src0_1);
			down_CALL_OPE_chk03_2(dest_Del01_SlsAct, src0_2);
			down_CALL_OPE_chk03_3(dest_Del01_SlsActDtl, src0_3);
			down_CALL_OPE_chk03_4(dest_Del01_PurcActIo, src0_4);
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk03_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk03_0(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk03_0(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_RsltR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk03_0();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk03_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk03_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk03_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("iv_ship_act_d_no", "iv_ship_act_d_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("pack_unit_cd", "pack_unit_cd");
				addColumnPathMap("pack_unit_qty", "pack_unit_qty");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("sls_schd_abort_flg", "sls_schd_abort_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_flg", "sls_ret_schd_flg");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
				addColumnPathMap("new_hdr_peg_no", "new_hdr_peg_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk03_1(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk03_1(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk03_1();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk03_SlsActIoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk03_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk03_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk03_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sa.sls_act_no", "sa.sls_act_no");
				addColumnPathMap("sa.sls_act_seq", "sa.sls_act_seq");
				addColumnPathMap("sa.sls_act_rev", "sa.sls_act_rev");
				addColumnPathMap("sa.slip_sts_typ", "sa.slip_sts_typ");
				addColumnPathMap("sa.trd_cd", "sa.trd_cd");
				addColumnPathMap("sa.trd_ptn_typ", "sa.trd_ptn_typ");
				addColumnPathMap("sa.ac_ym", "sa.ac_ym");
				addColumnPathMap("sa.ac_dt", "sa.ac_dt");
				addColumnPathMap("sa.sls_dpt_cd", "sa.sls_dpt_cd");
				addColumnPathMap("sa.wg_cd", "sa.wg_cd");
				addColumnPathMap("sa.sls_usr_cd", "sa.sls_usr_cd");
				addColumnPathMap("sa.sls_dt", "sa.sls_dt");
				addColumnPathMap("sa.ship_tm", "sa.ship_tm");
				addColumnPathMap("sa.dlv_tm", "sa.dlv_tm");
				addColumnPathMap("sa.cst_cd", "sa.cst_cd");
				addColumnPathMap("sa.iv_no", "sa.iv_no");
				addColumnPathMap("sa.ref_iv_no", "sa.ref_iv_no");
				addColumnPathMap("sa.rcpt_iv_mng_no", "sa.rcpt_iv_mng_no");
				addColumnPathMap("sa.rcpt_iv_no", "sa.rcpt_iv_no");
				addColumnPathMap("sa.tterm_cd1", "sa.tterm_cd1");
				addColumnPathMap("sa.tterm_rmrks1", "sa.tterm_rmrks1");
				addColumnPathMap("sa.tterm_cd2", "sa.tterm_cd2");
				addColumnPathMap("sa.tterm_rmrks2", "sa.tterm_rmrks2");
				addColumnPathMap("sa.tterm_cd3", "sa.tterm_cd3");
				addColumnPathMap("sa.tterm_rmrks3", "sa.tterm_rmrks3");
				addColumnPathMap("sa.lc_no", "sa.lc_no");
				addColumnPathMap("sa.lc_dt", "sa.lc_dt");
				addColumnPathMap("sa.lc_rmrks", "sa.lc_rmrks");
				addColumnPathMap("sa.rcv_schd_dt", "sa.rcv_schd_dt");
				addColumnPathMap("sa.bill_basis_dt", "sa.bill_basis_dt");
				addColumnPathMap("sa.cred_cd", "sa.cred_cd");
				addColumnPathMap("sa.bcst_cd", "sa.bcst_cd");
				addColumnPathMap("sa.acst_cd", "sa.acst_cd");
				addColumnPathMap("sa.ar_dpt_cd", "sa.ar_dpt_cd");
				addColumnPathMap("sa.cst_po_no", "sa.cst_po_no");
				addColumnPathMap("sa.trd_cur_cd", "sa.trd_cur_cd");
				addColumnPathMap("sa.base_cur_cd", "sa.base_cur_cd");
				addColumnPathMap("sa.xrate_cd", "sa.xrate_cd");
				addColumnPathMap("sa.xrate", "sa.xrate");
				addColumnPathMap("sa.ptax_cur_cd", "sa.ptax_cur_cd");
				addColumnPathMap("sa.ptax_xrate", "sa.ptax_xrate");
				addColumnPathMap("sa.trd_cur_amt", "sa.trd_cur_amt");
				addColumnPathMap("sa.trd_cur_tax_amt", "sa.trd_cur_tax_amt");
				addColumnPathMap("sa.base_cur_amt", "sa.base_cur_amt");
				addColumnPathMap("sa.base_cur_tax_amt", "sa.base_cur_tax_amt");
				addColumnPathMap("sa.trd_rmrks", "sa.trd_rmrks");
				addColumnPathMap("sa.intr_rmrks", "sa.intr_rmrks");
				addColumnPathMap("sa.ship_act_no", "sa.ship_act_no");
				addColumnPathMap("sa.slo_no", "sa.slo_no");
				addColumnPathMap("sa.sls_ret_schd_no", "sa.sls_ret_schd_no");
				addColumnPathMap("sa.qtn_no", "sa.qtn_no");
				addColumnPathMap("sa.qtn_rev", "sa.qtn_rev");
				addColumnPathMap("sa.dlv_slip_no", "sa.dlv_slip_no");
				addColumnPathMap("sa.slip_form_cd", "sa.slip_form_cd");
				addColumnPathMap("sa.aprv_flg", "sa.aprv_flg");
				addColumnPathMap("sa.aprv_no", "sa.aprv_no");
				addColumnPathMap("sa.aprv_sts_typ", "sa.aprv_sts_typ");
				addColumnPathMap("sa.sls_basis_typ", "sa.sls_basis_typ");
				addColumnPathMap("sa.adjst_tgt_dt", "sa.adjst_tgt_dt");
				addColumnPathMap("sa.sls_adjst_typ", "sa.sls_adjst_typ");
				addColumnPathMap("sa.adjst_mtd_typ", "sa.adjst_mtd_typ");
				addColumnPathMap("sa.sub_char1", "sa.sub_char1");
				addColumnPathMap("sa.sub_char2", "sa.sub_char2");
				addColumnPathMap("sa.sub_char3", "sa.sub_char3");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("sls_tgt_typ", "sls_tgt_typ");
				addColumnPathMap("eta_dt", "eta_dt");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk03_2(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk03_2(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk03_2();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk03_SlsActR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk03_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk03_3() {
			MCRowMapper map = new Map_down_CALL_OPE_chk03_3();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk03_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sad.sls_act_d_no", "sad.sls_act_d_no");
				addColumnPathMap("sad.sls_act_d_seq", "sad.sls_act_d_seq");
				addColumnPathMap("sad.sls_act_no", "sad.sls_act_no");
				addColumnPathMap("sad.sls_act_seq", "sad.sls_act_seq");
				addColumnPathMap("sad.disp_seq", "sad.disp_seq");
				addColumnPathMap("sad.dlv_cd", "sad.dlv_cd");
				addColumnPathMap("sad.dlv_sundry_flg", "sad.dlv_sundry_flg");
				addColumnPathMap("sad.dlv_nm", "sad.dlv_nm");
				addColumnPathMap("sad.dlv_zip_cd", "sad.dlv_zip_cd");
				addColumnPathMap("sad.dlv_addr1", "sad.dlv_addr1");
				addColumnPathMap("sad.dlv_addr2", "sad.dlv_addr2");
				addColumnPathMap("sad.dlv_addr3", "sad.dlv_addr3");
				addColumnPathMap("sad.dlv_addr4", "sad.dlv_addr4");
				addColumnPathMap("sad.dlv_cntct_dpt", "sad.dlv_cntct_dpt");
				addColumnPathMap("sad.dlv_cntct_psn", "sad.dlv_cntct_psn");
				addColumnPathMap("sad.dlv_tel", "sad.dlv_tel");
				addColumnPathMap("sad.dlv_fax", "sad.dlv_fax");
				addColumnPathMap("sad.pri_prnt_flg", "sad.pri_prnt_flg");
				addColumnPathMap("sad.dest_cd1", "sad.dest_cd1");
				addColumnPathMap("sad.dest_cd2", "sad.dest_cd2");
				addColumnPathMap("sad.dest_cd3", "sad.dest_cd3");
				addColumnPathMap("sad.tdlv_cd", "sad.tdlv_cd");
				addColumnPathMap("sad.tdlv_sundry_flg", "sad.tdlv_sundry_flg");
				addColumnPathMap("sad.tdlv_nm", "sad.tdlv_nm");
				addColumnPathMap("sad.tdlv_zip_cd", "sad.tdlv_zip_cd");
				addColumnPathMap("sad.tdlv_addr1", "sad.tdlv_addr1");
				addColumnPathMap("sad.tdlv_addr2", "sad.tdlv_addr2");
				addColumnPathMap("sad.tdlv_addr3", "sad.tdlv_addr3");
				addColumnPathMap("sad.tdlv_addr4", "sad.tdlv_addr4");
				addColumnPathMap("sad.tdlv_tel", "sad.tdlv_tel");
				addColumnPathMap("sad.tdlv_fax", "sad.tdlv_fax");
				addColumnPathMap("sad.tdlv_cntct_dpt", "sad.tdlv_cntct_dpt");
				addColumnPathMap("sad.tdlv_cntct_psn", "sad.tdlv_cntct_psn");
				addColumnPathMap("sad.itm_cd", "sad.itm_cd");
				addColumnPathMap("sad.itm_sub1", "sad.itm_sub1");
				addColumnPathMap("sad.itm_sub2", "sad.itm_sub2");
				addColumnPathMap("sad.itm_sub3", "sad.itm_sub3");
				addColumnPathMap("sad.sno1", "sad.sno1");
				addColumnPathMap("sad.sno2", "sad.sno2");
				addColumnPathMap("sad.sno3", "sad.sno3");
				addColumnPathMap("sad.sno4", "sad.sno4");
				addColumnPathMap("sad.itm_nm", "sad.itm_nm");
				addColumnPathMap("sad.iv_itm_nm", "sad.iv_itm_nm");
				addColumnPathMap("sad.cntry_org_cd", "sad.cntry_org_cd");
				addColumnPathMap("sad.wrk_no", "sad.wrk_no");
				addColumnPathMap("sad.loc_cd", "sad.loc_cd");
				addColumnPathMap("sad.str_ln_cd", "sad.str_ln_cd");
				addColumnPathMap("sad.lot_no", "sad.lot_no");
				addColumnPathMap("sad.sublot_no", "sad.sublot_no");
				addColumnPathMap("sad.gd_cd", "sad.gd_cd");
				addColumnPathMap("sad.trd_unit_cd", "sad.trd_unit_cd");
				addColumnPathMap("sad.trd_unit_qty", "sad.trd_unit_qty");
				addColumnPathMap("sad.base_unit_cd", "sad.base_unit_cd");
				addColumnPathMap("sad.base_unit_qty", "sad.base_unit_qty");
				addColumnPathMap("sad.trd_cur_upri", "sad.trd_cur_upri");
				addColumnPathMap("sad.trd_cur_amt", "sad.trd_cur_amt");
				addColumnPathMap("sad.upri_not_tgt_flg", "sad.upri_not_tgt_flg");
				addColumnPathMap("sad.interim_flg", "sad.interim_flg");
				addColumnPathMap("sad.tax_cd", "sad.tax_cd");
				addColumnPathMap("sad.trd_cur_tax_amt", "sad.trd_cur_tax_amt");
				addColumnPathMap("sad.base_cur_upri", "sad.base_cur_upri");
				addColumnPathMap("sad.base_cur_amt", "sad.base_cur_amt");
				addColumnPathMap("sad.base_cur_tax_amt", "sad.base_cur_tax_amt");
				addColumnPathMap("sad.ptax_cur_upri", "sad.ptax_cur_upri");
				addColumnPathMap("sad.ptax_cur_amt", "sad.ptax_cur_amt");
				addColumnPathMap("sad.ptax_cur_tax_amt", "sad.ptax_cur_tax_amt");
				addColumnPathMap("sad.cost_upri", "sad.cost_upri");
				addColumnPathMap("sad.trd_cur_dscnt_amt", "sad.trd_cur_dscnt_amt");
				addColumnPathMap("sad.base_cur_dscnt_amt", "sad.base_cur_dscnt_amt");
				addColumnPathMap("sad.ptax_cur_dscnt_amt", "sad.ptax_cur_dscnt_amt");
				addColumnPathMap("sad.dscnt_rsn_cd", "sad.dscnt_rsn_cd");
				addColumnPathMap("sad.bill_crryovr_times", "sad.bill_crryovr_times");
				addColumnPathMap("sad.stk_mng_typ", "sad.stk_mng_typ");
				addColumnPathMap("sad.sundry_itm_flg", "sad.sundry_itm_flg");
				addColumnPathMap("sad.sno1_mng_typ", "sad.sno1_mng_typ");
				addColumnPathMap("sad.sno2_mng_typ", "sad.sno2_mng_typ");
				addColumnPathMap("sad.sno3_mng_typ", "sad.sno3_mng_typ");
				addColumnPathMap("sad.sno4_mng_typ", "sad.sno4_mng_typ");
				addColumnPathMap("sad.ar_typ", "sad.ar_typ");
				addColumnPathMap("sad.cst_po_d_no", "sad.cst_po_d_no");
				addColumnPathMap("sad.cst_itm_cd", "sad.cst_itm_cd");
				addColumnPathMap("sad.cst_itm_nm", "sad.cst_itm_nm");
				addColumnPathMap("sad.trd_d_rmrks", "sad.trd_d_rmrks");
				addColumnPathMap("sad.intr_rmrks", "sad.intr_rmrks");
				addColumnPathMap("sad.rsn_cd", "sad.rsn_cd");
				addColumnPathMap("sad.bd_dpt_cd", "sad.bd_dpt_cd");
				addColumnPathMap("sad.wtax_rate", "sad.wtax_rate");
				addColumnPathMap("sad.wtax_amt", "sad.wtax_amt");
				addColumnPathMap("sad.slo_no", "sad.slo_no");
				addColumnPathMap("sad.slo_d_no", "sad.slo_d_no");
				addColumnPathMap("sad.sls_ret_schd_no", "sad.sls_ret_schd_no");
				addColumnPathMap("sad.sls_ret_schd_d_no", "sad.sls_ret_schd_d_no");
				addColumnPathMap("sad.ship_schd_no", "sad.ship_schd_no");
				addColumnPathMap("sad.sls_schd_no", "sad.sls_schd_no");
				addColumnPathMap("sad.qtn_no", "sad.qtn_no");
				addColumnPathMap("sad.qtn_rev", "sad.qtn_rev");
				addColumnPathMap("sad.qtn_d_no", "sad.qtn_d_no");
				addColumnPathMap("sad.purc_ddlv_po_no", "sad.purc_ddlv_po_no");
				addColumnPathMap("sad.purc_ddlv_po_d_no", "sad.purc_ddlv_po_d_no");
				addColumnPathMap("sad.purc_act_no", "sad.purc_act_no");
				addColumnPathMap("sad.purc_act_d_no", "sad.purc_act_d_no");
				addColumnPathMap("sad.iv_d_no", "sad.iv_d_no");
				addColumnPathMap("sad.sub_char1", "sad.sub_char1");
				addColumnPathMap("sad.sub_char2", "sad.sub_char2");
				addColumnPathMap("sad.sub_char3", "sad.sub_char3");
				addColumnPathMap("sad.ref_sls_act_no", "sad.ref_sls_act_no");
				addColumnPathMap("sad.ref_sls_act_seq", "sad.ref_sls_act_seq");
				addColumnPathMap("sad.ref_sls_act_d_no", "sad.ref_sls_act_d_no");
				addColumnPathMap("sad.ref_sls_act_d_seq", "sad.ref_sls_act_d_seq");
				addColumnPathMap("sad.dlv_slip_d_no", "sad.dlv_slip_d_no");
				addColumnPathMap("sad.ship_dlv_slip_d_no", "sad.ship_dlv_slip_d_no");
				addColumnPathMap("sad.ship_dlv_slip_multi_flg", "sad.ship_dlv_slip_multi_flg");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("tax_typ", "tax_typ");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk03_3(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk03_3(MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk03_3();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Chk03_SlsActDtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk03_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk03_4() {
			MCRowMapper map = new Map_down_CALL_OPE_chk03_4();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk03_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk03_4(mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR r_dest, mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk03の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk03_4(MCList<mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR> dest, MCList<mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk03_4();
			for(mcframe.serverMSBB.MSBBL1320.Chk03_PurcActIoR r_src : src){
				mcframe.serverMSBB.MSBBL1320.Del01_PurcActIoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk03_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}