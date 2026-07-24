package mcframe.serverMSBC.MSBCL1010;

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
 * "MSBCL_MfgInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgInstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL1010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgInstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL1010_Srch01_INFO;
		this.aSrch01 = ((MSBCL_MfgInstReg)this).new Srch01();
	}

	public static MSBCL_MfgInstReg.Srch01 crtSrch01() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
		p.addDownBlock(aSrch01.down5());
		p.addDownBlock(aSrch01.down6());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR createSrch01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.create();
	}

	/**
	 * Srch01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> createSrch01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
	}

	/**
	 * Srch01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR createSrch01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.create();
	}

	/**
	 * Srch01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> createSrch01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
	}

	/**
	 * Srch01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR createSrch01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.create();
	}

	/**
	 * Srch01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> createSrch01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
	}

	/**
	 * Srch01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR createSrch01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.create();
	}

	/**
	 * Srch01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
	}

	/**
	 * Srch01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR createSrch01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.create();
	}

	/**
	 * Srch01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);
	}

	/**
	 * Srch01_DtlReExtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR createSrch01_DtlReExtR(){
		return mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR.create();
	}

	/**
	 * Srch01_DtlReExtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR> createSrch01_DtlReExtL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR.class);
	}
	protected MSBCL_MfgInstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBCL1010_Upd01_INFO;
		this.aUpd01 = ((MSBCL_MfgInstReg)this).new Upd01();
	}

	public static MSBCL_MfgInstReg.Upd01 crtUpd01() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
		p.addUpBlock(aUpd01.up5());
		p.addUpBlock(aUpd01.up6());
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
		p.addDownBlock(aUpd01.down2());
		p.addDownBlock(aUpd01.down3());
		p.addDownBlock(aUpd01.down4());
		p.addDownBlock(aUpd01.down5());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createUpd01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
	}

	/**
	 * Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createUpd01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
	}

	/**
	 * Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createUpd01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
	}

	/**
	 * Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createUpd01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
	}

	/**
	 * Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createUpd01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
	}

	/**
	 * Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createUpd01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
	}

	/**
	 * Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createUpd01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
	}

	/**
	 * Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createUpd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
	}

	/**
	 * Upd01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createUpd01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
	}

	/**
	 * Upd01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createUpd01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
	}

	/**
	 * Upd01_DtlReExtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR createUpd01_DtlReExtR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.create();
	}

	/**
	 * Upd01_DtlReExtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> createUpd01_DtlReExtL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
	}
	protected MSBCL_MfgInstReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBCL1010_Upd02_INFO;
		this.aUpd02 = ((MSBCL_MfgInstReg)this).new Upd02();
	}

	public static MSBCL_MfgInstReg.Upd02 crtUpd02() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
	 * Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR createUpd02_CtrlR(){
		return mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();
	}

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR createUpd02_DtlR(){
		return mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
	}
	protected MSBCL_MfgInstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBCL1010_Del01_INFO;
		this.aDel01 = ((MSBCL_MfgInstReg)this).new Del01();
	}

	public static MSBCL_MfgInstReg.Del01 crtDel01() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Del01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBC.MSBCL1010.Del01_HdrR.create();
	}

	/**
	 * Del01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR createDel01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR.create();
	}

	/**
	 * Del01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR> createDel01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR.class);
	}
	protected MSBCL_MfgInstReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MS_MSBCL1010_Del02_INFO;
		this.aDel02 = ((MSBCL_MfgInstReg)this).new Del02();
	}

	public static MSBCL_MfgInstReg.Del02 crtDel02() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
	 * Del02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR createDel02_CtrlR(){
		return mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();
	}

	/**
	 * Del02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR createDel02_DtlR(){
		return mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
	}
	protected MSBCL_MfgInstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBCL1010_Prnt01_INFO;
		this.aPrnt01 = ((MSBCL_MfgInstReg)this).new Prnt01();
	}

	public static MSBCL_MfgInstReg.Prnt01 crtPrnt01() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
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
	 * Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR createPrnt01_DtlR(){
		return mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR.create();
	}
	protected MSBCL_MfgInstReg.Prnt02 aPrnt02;

	protected void initPrnt02() {
		this.info = PDef.MS_MSBCL1010_Prnt02_INFO;
		this.aPrnt02 = ((MSBCL_MfgInstReg)this).new Prnt02();
	}

	public static MSBCL_MfgInstReg.Prnt02 crtPrnt02() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initPrnt02();
		return lgc.aPrnt02;
	}

	protected void paramPrnt02(MCParam p) {
		if (this.aPrnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt02.up0());
	}

	protected void doPrnt02() {
		aPrnt02.call();
	};

	/**
	 * Prnt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR createPrnt02_DtlR(){
		return mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR.create();
	}
	protected MSBCL_MfgInstReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBCL1010_Sprt01_INFO;
		this.aSprt01 = ((MSBCL_MfgInstReg)this).new Sprt01();
	}

	public static MSBCL_MfgInstReg.Sprt01 crtSprt01() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};
	protected MSBCL_MfgInstReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBCL1010_Sprt02_INFO;
		this.aSprt02 = ((MSBCL_MfgInstReg)this).new Sprt02();
	}

	public static MSBCL_MfgInstReg.Sprt02 crtSprt02() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addDownBlock(aSprt02.down0());
		p.addDownBlock(aSprt02.down1());
		p.addDownBlock(aSprt02.down2());
		p.addDownBlock(aSprt02.down3());
		p.addDownBlock(aSprt02.down4());
	}

	protected void doSprt02() {
		aSprt02.call();
	};

	/**
	 * Sprt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR createSprt02_HdrR(){
		return mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR.create();
	}
	protected MSBCL_MfgInstReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBCL1010_Sprt03_INFO;
		this.aSprt03 = ((MSBCL_MfgInstReg)this).new Sprt03();
	}

	public static MSBCL_MfgInstReg.Sprt03 crtSprt03() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt03();
		return lgc.aSprt03;
	}

	protected void paramSprt03(MCParam p) {
		if (this.aSprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt03.up0());
		p.addUpBlock(aSprt03.up1());
		p.addUpBlock(aSprt03.up2());
		p.addDownBlock(aSprt03.down0());
		p.addDownBlock(aSprt03.down1());
		p.addDownBlock(aSprt03.down2());
		p.addDownBlock(aSprt03.down3());
	}

	protected void doSprt03() {
		aSprt03.call();
	};

	/**
	 * Sprt03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR createSprt03_HdrR(){
		return mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR.create();
	}

	/**
	 * Sprt03_HdrFlgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR createSprt03_HdrFlgR(){
		return mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR.create();
	}
	protected MSBCL_MfgInstReg.Sprt07 aSprt07;

	protected void initSprt07() {
		this.info = PDef.MS_MSBCL1010_Sprt07_INFO;
		this.aSprt07 = ((MSBCL_MfgInstReg)this).new Sprt07();
	}

	public static MSBCL_MfgInstReg.Sprt07 crtSprt07() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt07();
		return lgc.aSprt07;
	}

	protected void paramSprt07(MCParam p) {
		if (this.aSprt07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt07.up0());
		p.addUpBlock(aSprt07.up1());
		p.addUpBlock(aSprt07.up2());
		p.addDownBlock(aSprt07.down0());
	}

	protected void doSprt07() {
		aSprt07.call();
	};

	/**
	 * Sprt07_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt07_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt07_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR createSprt07_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR.create();
	}

	/**
	 * Sprt07_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR> createSprt07_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR.class);
	}

	/**
	 * Sprt07_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt07_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
	}

	/**
	 * Sprt07_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt07_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
	}
	protected MSBCL_MfgInstReg.Sprt08 aSprt08;

	protected void initSprt08() {
		this.info = PDef.MS_MSBCL1010_Sprt08_INFO;
		this.aSprt08 = ((MSBCL_MfgInstReg)this).new Sprt08();
	}

	public static MSBCL_MfgInstReg.Sprt08 crtSprt08() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt08();
		return lgc.aSprt08;
	}

	protected void paramSprt08(MCParam p) {
		if (this.aSprt08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt08.up0());
		p.addUpBlock(aSprt08.up1());
		p.addUpBlock(aSprt08.up2());
		p.addDownBlock(aSprt08.down0());
	}

	protected void doSprt08() {
		aSprt08.call();
	};

	/**
	 * Sprt08_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt08_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt08_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt08_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt08_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt08_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
	}

	/**
	 * Sprt08_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt08_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
	}

	/**
	 * Sprt08_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt08_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
	}
	protected MSBCL_MfgInstReg.Sprt09 aSprt09;

	protected void initSprt09() {
		this.info = PDef.MS_MSBCL1010_Sprt09_INFO;
		this.aSprt09 = ((MSBCL_MfgInstReg)this).new Sprt09();
	}

	public static MSBCL_MfgInstReg.Sprt09 crtSprt09() {
		MSBCL_MfgInstReg lgc = new MSBCL_MfgInstReg();
		lgc.initSprt09();
		return lgc.aSprt09;
	}

	protected void paramSprt09(MCParam p) {
		if (this.aSprt09 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt09.up0());
		p.addDownBlock(aSprt09.down0());
	}

	protected void doSprt09() {
		aSprt09.call();
	};

	/**
	 * Sprt09_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR createSprt09_HdrR(){
		return mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索対象区分に応じてオーダ、製造指図情報を検索する。<br>
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
		private final mcframe.serverMSBC.MSBCL1010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR> down6;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt04 （{@link #reExpSprt04}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション reExpSprt04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt04}<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt; （{@link #reExpSprt04_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt; （{@link #reExpSprt04_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #reExpSprt04_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt; （{@link #reExpSprt04_down3}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt04 reExpSprt04;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> reExpSprt04_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> reExpSprt04_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> reExpSprt04_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> reExpSprt04_down3;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Srch01_CndR.create();
			down0 = mcframe.serverMSBC.MSBCL1010.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR.class);

			// 連携オペレーションの初期化
			reExpSprt04 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt04();
			
			// 連携オペレーションのコンテナ取得
			reExpSprt04_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR>)reExpSprt04.down(1);
			reExpSprt04_down1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR>)reExpSprt04.down(3);
			reExpSprt04_down2 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)reExpSprt04.down(0);
			reExpSprt04_down3 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR>)reExpSprt04.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, reExpSprt04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt;（{@link #reExpSprt04_down0}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt;（{@link #reExpSprt04_down1}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #reExpSprt04_down2}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt;（{@link #reExpSprt04_down3}）=> down5()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down2(), down3(), down4(), down5(), reExpSprt04_down0, reExpSprt04_down1, reExpSprt04_down2, reExpSprt04_down3);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR createSrch01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.create();
		}

		/**
		 * Srch01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> createSrch01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
		}

		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
		}

		/**
		 * Srch01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR createSrch01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.create();
		}

		/**
		 * Srch01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> createSrch01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
		}

		/**
		 * Srch01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR createSrch01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.create();
		}

		/**
		 * Srch01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
		}

		/**
		 * Srch01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR createSrch01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.create();
		}

		/**
		 * Srch01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);
		}

		/**
		 * Srch01_DtlReExtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR createSrch01_DtlReExtR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR.create();
		}

		/**
		 * Srch01_DtlReExtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR> createSrch01_DtlReExtL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>mst_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>ln_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>po_locked_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>org_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>disp_pd</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_ord_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord_mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_nm</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>po_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>frst_mfg_inst_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Srch01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>last_mes_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sum_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_id_no</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>split_row_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_rsn_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>unneces_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_chng_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>plm_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlReExtR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(){
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> dest_Srch01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> dest_Srch01_DtlWk, MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest_Srch01_DtlYield, MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> dest_Srch01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_2, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src0_3){
			down_RE1_reExpSprt04_0(dest_Srch01_DtlInpt, src0_0);
			down_RE1_reExpSprt04_1(dest_Srch01_DtlWk, src0_1);
			down_RE1_reExpSprt04_2(dest_Srch01_DtlYield, src0_2);
			down_RE1_reExpSprt04_3(dest_Srch01_DtlByProd, src0_3);
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt04_0() {
			MCRowMapper map = new Map_down_RE1_reExpSprt04_0();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("base_unit_alt_qty", "alt_qty");
				addColumnPathMap("base_unit_inpt_qty", "inpt_qty");
				addColumnPathMap("base_unit_rqmt_qty", "rqmt_qty");
				addColumnPathMap("base_unit_fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("base_unit_sum_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("schd_dt", "inpt_schd_dt");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_loc_nm", "inpt_loc_nm");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_str_ln_nm", "inpt_str_ln_nm");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("bom_id_no", "bom_id");
				addColumnPathMap("chd_itm_seq", "itm_seq");
				addColumnPathMap("bom_memo1", "bom_memo1");
				addColumnPathMap("bom_memo2", "bom_memo2");
				addColumnPathMap("bom_memo3", "bom_memo3");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt04_0(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt04_0(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt04_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt04_1() {
			MCRowMapper map = new Map_down_RE1_reExpSprt04_1();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt04_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("sum_wk_cost", "sum_wk_cost");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_dec_place", "dec_place");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt04_1(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt04_1(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt04_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt04_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt04_2() {
			MCRowMapper map = new Map_down_RE1_reExpSprt04_2();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt04_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_dec_place", "trd_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_yield_qty", "base_unit_qty");
				addColumnPathMap("base_unit_dec_place", "base_dec_place");
				addColumnPathMap("schd_dt", "yield_schd_dt");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt04_2(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt04_2(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt04_2();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt04_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt04_3() {
			MCRowMapper map = new Map_down_RE1_reExpSprt04_3();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt04_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_dec_place", "trd_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_yield_qty", "base_unit_qty");
				addColumnPathMap("base_unit_dec_place", "base_dec_place");
				addColumnPathMap("schd_dt", "yield_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt04_3(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt04の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt04_3(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt04_3();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt04_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造指図を登録・訂正する。<br>
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
		private final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> down5;
		
		/**
		 * 連携情報 MI<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01 （{@link #miUpd01}）<br>
		 */
		public final String MI = "MI";

		/**
		 * 連携オペレーション miUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #miUpd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #miUpd01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #miUpd01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #miUpd01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #miUpd01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR&gt; （{@link #miUpd01_up5}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #miUpd01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #miUpd01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #miUpd01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #miUpd01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #miUpd01_down4}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01 miUpd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> miUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> miUpd01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> miUpd01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> miUpd01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> miUpd01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> miUpd01_up5;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> miUpd01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> miUpd01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> miUpd01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> miUpd01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> miUpd01_down4;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
			down0 = mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);

			// 連携オペレーションの初期化
			miUpd01 = mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			
			// 連携オペレーションのコンテナ取得
			miUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR>)miUpd01.up(1);
			miUpd01_up1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR>)miUpd01.up(2);
			miUpd01_up2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR>)miUpd01.up(3);
			miUpd01_up3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR>)miUpd01.up(4);
			miUpd01_up4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR>)miUpd01.up(5);
			miUpd01_up5 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR>)miUpd01.up(6);
			miUpd01_down0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR>)miUpd01.down(1);
			miUpd01_down1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR>)miUpd01.down(2);
			miUpd01_down2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR>)miUpd01.down(3);
			miUpd01_down3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR>)miUpd01.down(4);
			miUpd01_down4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR>)miUpd01.down(5);

			// オペレーション、オペレーショングループの登録
			appendOpe(MI, miUpd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MI<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #miUpd01_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #miUpd01_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #miUpd01_up2}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #miUpd01_up3}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #miUpd01_up4}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR&gt; （{@link #miUpd01_up5}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MI)) {
				up_MI(miUpd01_up0, miUpd01_up1, miUpd01_up2, miUpd01_up3, miUpd01_up4, miUpd01_up5, up1(), up2(), up3(), up4(), up5(), up6());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MI<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt;（{@link #miUpd01_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt;（{@link #miUpd01_down1}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt;（{@link #miUpd01_down2}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt;（{@link #miUpd01_down3}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt;（{@link #miUpd01_down4}）=> down5()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MI)) {
				down_MI(down1(), down2(), down3(), down4(), down5(), miUpd01_down0, miUpd01_down1, miUpd01_down2, miUpd01_down3, miUpd01_down4);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
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
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createUpd01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
		}

		/**
		 * Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createUpd01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
		}

		/**
		 * Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createUpd01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
		}

		/**
		 * Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createUpd01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
		}

		/**
		 * Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createUpd01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
		}

		/**
		 * Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createUpd01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
		}

		/**
		 * Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createUpd01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
		}

		/**
		 * Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createUpd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
		}

		/**
		 * Upd01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createUpd01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
		}

		/**
		 * Upd01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createUpd01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
		}

		/**
		 * Upd01_DtlReExtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR createUpd01_DtlReExtR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.create();
		}

		/**
		 * Upd01_DtlReExtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> createUpd01_DtlReExtL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>po_locked_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>disp_pd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>chg_list_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>comp_dt_from_oper_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_id_no</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>unneces_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> up6() {
			return up6;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}

		//-----------------------MI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MI(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src_Upd01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> src_Upd01_DtlReExt){
			up_MI_miUpd01_0(dest0_0, src_Upd01_DtlOper);
			up_MI_miUpd01_1(dest0_1, src_Upd01_DtlInpt);
			up_MI_miUpd01_2(dest0_2, src_Upd01_DtlWk);
			up_MI_miUpd01_3(dest0_3, src_Upd01_DtlYield);
			up_MI_miUpd01_4(dest0_4, src_Upd01_DtlByProd);
			up_MI_miUpd01_5(dest0_5, src_Upd01_DtlReExt);
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_0() {
			MCRowMapper map = new Map_up_MI_miUpd01_0();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("tgt_oper_flg", "tgt_oper_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_schd_tm", "st_schd_tm");
				addColumnPathMap("end_schd_tm", "end_schd_tm");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ");
				addColumnPathMap("oper_unit_dec_place", "oper_unit_dec_place");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("oper_str_ln_cd", "oper_str_ln_cd");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("oper_abort_flg", "oper_abort_flg");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_rsrc", "oper_rsrc");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_lt", "oper_lt");
				addColumnPathMap("oper_lt_add_qty", "oper_lt_add_qty");
				addColumnPathMap("oper_offst_typ", "oper_offst_typ");
				addColumnPathMap("oper_offst", "oper_offst");
				addColumnPathMap("oper_offst_add_qty", "oper_offst_add_qty");
				addColumnPathMap("lmt_fr_dt_flg", "lmt_fr_dt_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("wip_rate", "wip_rate");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("not_oper_schd_qty", "not_oper_schd_qty");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("unschd_act_flg", "unschd_act_flg");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_1() {
			MCRowMapper map = new Map_up_MI_miUpd01_1();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("old_ver_no", "old_ver_no");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("base_unit_alt_qty", "base_unit_alt_qty");
				addColumnPathMap("base_unit_inpt_qty", "base_unit_inpt_qty");
				addColumnPathMap("base_unit_rqmt_qty", "base_unit_rqmt_qty");
				addColumnPathMap("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("schd_tm", "schd_tm");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("no_lot_fix_flg", "no_lot_fix_flg");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("vld_dt", "vld_dt");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("alloc_sno1", "alloc_sno1");
				addColumnPathMap("alloc_sno2", "alloc_sno2");
				addColumnPathMap("alloc_sno3", "alloc_sno3");
				addColumnPathMap("alloc_sno4", "alloc_sno4");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("inpt_rsn_cd", "inpt_rsn_cd");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("bom_id_no", "bom_id_no");
				addColumnPathMap("chd_itm_seq", "chd_itm_seq");
				addColumnPathMap("bom_memo1", "bom_memo1");
				addColumnPathMap("bom_memo2", "bom_memo2");
				addColumnPathMap("bom_memo3", "bom_memo3");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("disp_seq_upd_flg", "disp_seq_upd_flg");
				addColumnPathMap("xfr_inst_err_flg", "xfr_inst_err_flg");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_2() {
			MCRowMapper map = new Map_up_MI_miUpd01_2();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("disp_seq_upd_flg", "disp_seq_upd_flg");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_3() {
			MCRowMapper map = new Map_up_MI_miUpd01_3();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("schd_tm", "schd_tm");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("disp_seq_upd_flg", "disp_seq_upd_flg");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_aprv_sts_typ", "mfg_aprv_sts_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_4() {
			MCRowMapper map = new Map_up_MI_miUpd01_4();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("schd_tm", "schd_tm");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("disp_seq_upd_flg", "disp_seq_upd_flg");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("old_itm_cd", "old_itm_cd");
				addColumnPathMap("old_itm_sub1", "old_itm_sub1");
				addColumnPathMap("old_itm_sub2", "old_itm_sub2");
				addColumnPathMap("old_itm_sub3", "old_itm_sub3");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miUpd01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miUpd01_5() {
			MCRowMapper map = new Map_up_MI_miUpd01_5();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miUpd01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_rev", "mfg_inst_rev");
				addColumnPathMap("ref_ord", "ref_ord");
				addColumnPathMap("re_ext_typ", "re_ext_typ");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
			}
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miUpd01_5(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miUpd01_5(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> src) {
			MCRowMapper _rm = createMap_up_MI_miUpd01_5();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miUpd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MI(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest_Upd01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src0_4){
			down_MI_miUpd01_0(dest_Upd01_DtlOper, src0_0);
			down_MI_miUpd01_1(dest_Upd01_DtlInpt, src0_1);
			down_MI_miUpd01_2(dest_Upd01_DtlWk, src0_2);
			down_MI_miUpd01_3(dest_Upd01_DtlYield, src0_3);
			down_MI_miUpd01_4(dest_Upd01_DtlByProd, src0_4);
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miUpd01_0() {
			MCRowMapper map = new Map_down_MI_miUpd01_0();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miUpd01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miUpd01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MI_miUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miUpd01_1() {
			MCRowMapper map = new Map_down_MI_miUpd01_1();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miUpd01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miUpd01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MI_miUpd01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miUpd01_2() {
			MCRowMapper map = new Map_down_MI_miUpd01_2();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miUpd01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miUpd01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MI_miUpd01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miUpd01_3() {
			MCRowMapper map = new Map_down_MI_miUpd01_3();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miUpd01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miUpd01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MI_miUpd01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miUpd01_4() {
			MCRowMapper map = new Map_down_MI_miUpd01_4();
			return map;
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miUpd01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MI_miUpd01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miUpd01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MI_miUpd01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 製造指図を承認する。<br>
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
		private final mcframe.serverMSBC.MSBCL1010.Upd02_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Upd02_DtlR down0;
		/** [Upd02_Ctrl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR aUpd02_Ctrl;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
			aUpd02_Ctrl = mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR createUpd02_CtrlR(){
			return mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();
		}

		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR createUpd02_DtlR(){
			return mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR down0() {
			return down0;
		}


		/**
		 * [Upd02_Ctrl]ブロックのコンテナaUpd02_CtrlRを返します。
		 *
		 * @return Upd02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR Upd02_Ctrl() {
			return aUpd02_Ctrl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造指図を取り消す。<br>
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
		private final mcframe.serverMSBC.MSBCL1010.Del01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR> up1;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Del01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR.class);

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Del01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBC.MSBCL1010.Del01_HdrR.create();
		}

		/**
		 * Del01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR createDel01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR.create();
		}

		/**
		 * Del01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR> createDel01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Del01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Del01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Del01_DtlOperR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造指図の承認を取り消す。<br>
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
		private final mcframe.serverMSBC.MSBCL1010.Upd02_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Upd02_DtlR down0;
		/** [Del02_Ctrl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR aDel02_Ctrl;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
			aDel02_Ctrl = mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR createDel02_CtrlR(){
			return mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR.create();
		}

		/**
		 * Del02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR createDel02_DtlR(){
			return mcframe.serverMSBC.MSBCL1010.Upd02_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_DtlR down0() {
			return down0;
		}


		/**
		 * [Del02_Ctrl]ブロックのコンテナaDel02_CtrlRを返します。
		 *
		 * @return Del02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Upd02_CtrlR Del02_Ctrl() {
			return aDel02_Ctrl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造指図書を発行する。<br>
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
		private final mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR createPrnt01_DtlR(){
			return mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Prnt01_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 工程・ＢＯＭマスタ変更リストを発行する。<br>
	 */
	abstract public class Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR up0;
		
		
		// コンストラクタ
		protected Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR createPrnt02_DtlR(){
			return mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1010.Prnt02_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 在庫または入庫予定から投入品のロットを提案する。<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down0;
		
		/**
		 * 連携情報 LP1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.LotProp_Sprt01 （{@link #lotPropSprt01}）<br>
		 */
		public final String LP1 = "LP1";

		/**
		 * 連携オペレーション lotPropSprt01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.LotProp_Sprt01}<br>
		 */
		public final mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.LotProp_Sprt01 lotPropSprt01;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);

			// 連携オペレーションの初期化
			lotPropSprt01 = mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.crtLotProp_Sprt01();
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(LP1, lotPropSprt01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * LP1<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(LP1)) {
				up_LP1();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * LP1<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(LP1)) {
				down_LP1();
			}
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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sum_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>set_stk_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sum_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}

		//-----------------------LP1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループLP1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_LP1(){
		}

		//-----------------------LP1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループLP1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_LP1(){
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 工程指図と各予定を最新のマスタで再展開する<br>
	 */
	abstract public class Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down4;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt05 （{@link #reExpSprt05}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション reExpSprt05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt05}<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR&gt; （{@link #reExpSprt05_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #reExpSprt05_down1}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt05 reExpSprt05;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> reExpSprt05_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> reExpSprt05_down1;
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);

			// 連携オペレーションの初期化
			reExpSprt05 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt05();
			
			// 連携オペレーションのコンテナ取得
			reExpSprt05_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR>)reExpSprt05.down(0);
			reExpSprt05_down1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)reExpSprt05.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, reExpSprt05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR&gt;（{@link #reExpSprt05_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #reExpSprt05_down1}）=> down3()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down0(), down3(), reExpSprt05_down0, reExpSprt05_down1);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Sprt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR createSprt02_HdrR(){
			return mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR.create();
		}

		/**
		 * Srch01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR createSrch01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.create();
		}

		/**
		 * Srch01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> createSrch01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
		}

		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
		}

		/**
		 * Srch01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR createSrch01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.create();
		}

		/**
		 * Srch01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> createSrch01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
		}

		/**
		 * Srch01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR createSrch01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.create();
		}

		/**
		 * Srch01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
		}

		/**
		 * Srch01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR createSrch01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.create();
		}

		/**
		 * Srch01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt02_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>last_mes_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sum_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_id_no</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>split_row_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_rsn_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(){
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> dest_Srch01_DtlOper, MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest_Srch01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> src0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_1){
			down_RE1_reExpSprt05_0(dest_Srch01_DtlOper, src0_0);
			down_RE1_reExpSprt05_1(dest_Srch01_DtlYield, src0_1);
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt05_0() {
			MCRowMapper map = new Map_down_RE1_reExpSprt05_0();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_schd_dt", "st_schd_tm");
				addColumnPathMap("st_schd_hm", "st_schd_tm");
				addColumnPathMap("end_schd_dt", "end_schd_tm");
				addColumnPathMap("end_schd_hm", "end_schd_tm");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("oper_unit_qty", "oper_unit_qty");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("oper_unit_conv_rnd_typ", "unit_conv_rnd_typ");
				addColumnPathMap("oper_unit_dec_place", "dec_place");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_unit_nm", "oper_unit_nm");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("oper_loc_nm", "oper_loc_nm");
				addColumnPathMap("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg");
				addColumnPathMap("oper_str_ln_cd", "oper_str_ln_cd");
				addColumnPathMap("oper_str_ln_nm", "oper_str_ln_nm");
				addColumnPathMap("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("oper_ptn", "oper_ptn");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt05_0(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt05_0(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt05_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt05_1() {
			MCRowMapper map = new Map_down_RE1_reExpSprt05_1();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt05_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_dec_place", "trd_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_yield_qty", "base_unit_qty");
				addColumnPathMap("base_unit_dec_place", "base_dec_place");
				addColumnPathMap("schd_dt", "yield_schd_dt");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt05_1(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt05の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt05_1(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt05_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt05_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 投入予定、工数予定、副産品予定を再展開する。<br>
	 */
	abstract public class Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down3;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt06 （{@link #reExpSprt06}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション reExpSprt06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt06}<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #reExpSprt06_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt06 reExpSprt06;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> reExpSprt06_down0;
		
		// コンストラクタ
		protected Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
			up2 = mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);

			// 連携オペレーションの初期化
			reExpSprt06 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt06();
			
			// 連携オペレーションのコンテナ取得
			reExpSprt06_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)reExpSprt06.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, reExpSprt06);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #reExpSprt06_down0}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down2(), reExpSprt06_down0);
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
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Sprt03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR createSprt03_HdrR(){
			return mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR.create();
		}

		/**
		 * Srch01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR createSrch01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.create();
		}

		/**
		 * Srch01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> createSrch01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR.class);
		}

		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR.class);
		}

		/**
		 * Srch01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR createSrch01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.create();
		}

		/**
		 * Srch01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> createSrch01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR.class);
		}

		/**
		 * Srch01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR createSrch01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.create();
		}

		/**
		 * Srch01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR.class);
		}

		/**
		 * Srch01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR createSrch01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.create();
		}

		/**
		 * Srch01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR.class);
		}

		/**
		 * Sprt03_HdrFlgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR createSprt03_HdrFlgR(){
			return mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_re_ext_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_re_ext_flg</td></tr>
		 * 	<tr><td><br></td><td>byprod_re_ext_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt03_HdrFlgR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sum_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_id_no</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>split_row_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_rsn_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlWkR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlByProdR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(){
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest_Srch01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_0){
			down_RE1_reExpSprt06_0(dest_Srch01_DtlYield, src0_0);
		}

		/**
		 * 連携処理RE1_reExpSprt06の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_reExpSprt06_0() {
			MCRowMapper map = new Map_down_RE1_reExpSprt06_0();
			return map;
		}

		/**
		 * 連携処理RE1_reExpSprt06の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_reExpSprt06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_dec_place", "trd_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_yield_qty", "base_unit_qty");
				addColumnPathMap("base_unit_dec_place", "base_dec_place");
				addColumnPathMap("schd_dt", "yield_schd_dt");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
			}
		}

		/**
		 * 連携処理RE1_reExpSprt06の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_reExpSprt06_0(mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE1_reExpSprt06の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_reExpSprt06_0(MCList<mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE1_reExpSprt06_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL1010.Srch01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_reExpSprt06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	abstract public class Sprt07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR down0;
		
		
		// コンストラクタ
		protected Sprt07() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
			down0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt07_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt07_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt07_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR createSprt07_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR.create();
		}

		/**
		 * Sprt07_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR> createSprt07_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR.class);
		}

		/**
		 * Sprt07_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt07_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
		}

		/**
		 * Sprt07_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt07_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1010.Sprt07_DtlYieldR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt08オペレーション.<p>
	 *
	 * 副産品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	abstract public class Sprt08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0;
		
		
		// コンストラクタ
		protected Sprt08() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt08_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt08_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt08_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt08_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt08_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt08_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
		}

		/**
		 * Sprt08_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt08_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
		}

		/**
		 * Sprt08_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt08_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt09オペレーション.<p>
	 *
	 * 依頼元納入希望日、製造着手予定日、製造終了予定日を計算する。<br>
	 */
	abstract public class Sprt09 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt09";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR down0;
		
		
		// コンストラクタ
		protected Sprt09() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR.create();
			down0 = mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR.create();

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
			invoke((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt09_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR createSprt09_HdrR(){
			return mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1010.Sprt09_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstReg)MSBCL_MfgInstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}