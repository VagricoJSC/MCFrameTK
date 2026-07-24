package mcframe.serverMSBC.MSBCL1100;

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
 * "MSBCL_MfgActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL1100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL1100_Srch01_INFO;
		this.aSrch01 = ((MSBCL_MfgActReg)this).new Srch01();
	}

	public static MSBCL_MfgActReg.Srch01 crtSrch01() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
		p.addDownBlock(aSrch01.down7());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR createSrch01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.create();
	}

	/**
	 * Srch01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> createSrch01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
	}

	/**
	 * Srch01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR createSrch01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.create();
	}

	/**
	 * Srch01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> createSrch01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
	}

	/**
	 * Srch01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR createSrch01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.create();
	}

	/**
	 * Srch01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> createSrch01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
	}

	/**
	 * Srch01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR createSrch01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.create();
	}

	/**
	 * Srch01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
	}

	/**
	 * Srch01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR createSrch01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.create();
	}

	/**
	 * Srch01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
	}

	/**
	 * Srch01_Dtl_ArrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR createSrch01_Dtl_ArrR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR.create();
	}

	/**
	 * Srch01_Dtl_ArrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR> createSrch01_Dtl_ArrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR.class);
	}

	/**
	 * Srch01_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSrch01_DtlLossR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
	}

	/**
	 * Srch01_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSrch01_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
	}
	protected MSBCL_MfgActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBCL1100_Upd01_INFO;
		this.aUpd01 = ((MSBCL_MfgActReg)this).new Upd01();
	}

	public static MSBCL_MfgActReg.Upd01 crtUpd01() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
		p.addDownBlock(aUpd01.down6());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createUpd01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
	}

	/**
	 * Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createUpd01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
	}

	/**
	 * Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createUpd01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
	}

	/**
	 * Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createUpd01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
	}

	/**
	 * Upd01_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createUpd01_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
	}

	/**
	 * Upd01_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createUpd01_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
	}

	/**
	 * Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createUpd01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
	}

	/**
	 * Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createUpd01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
	}

	/**
	 * Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createUpd01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
	}

	/**
	 * Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createUpd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
	}

	/**
	 * Upd01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createUpd01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
	}

	/**
	 * Upd01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createUpd01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
	}
	protected MSBCL_MfgActReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBCL1100_Upd02_INFO;
		this.aUpd02 = ((MSBCL_MfgActReg)this).new Upd02();
	}

	public static MSBCL_MfgActReg.Upd02 crtUpd02() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
	public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR createUpd02_CtrlR(){
		return mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();
	}

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR createUpd02_DtlR(){
		return mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
	}
	protected MSBCL_MfgActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBCL1100_Del01_INFO;
		this.aDel01 = ((MSBCL_MfgActReg)this).new Del01();
	}

	public static MSBCL_MfgActReg.Del01 crtDel01() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
		p.addUpBlock(aDel01.up2());
		p.addUpBlock(aDel01.up3());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Del01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBC.MSBCL1100.Del01_HdrR.create();
	}

	/**
	 * Del01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR createDel01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR.create();
	}

	/**
	 * Del01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR> createDel01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR.class);
	}

	/**
	 * Del01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR createDel01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR.create();
	}

	/**
	 * Del01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR> createDel01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR.class);
	}

	/**
	 * Del01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR createDel01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR.create();
	}

	/**
	 * Del01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR> createDel01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR.class);
	}
	protected MSBCL_MfgActReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MS_MSBCL1100_Del02_INFO;
		this.aDel02 = ((MSBCL_MfgActReg)this).new Del02();
	}

	public static MSBCL_MfgActReg.Del02 crtDel02() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
	public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR createDel02_CtrlR(){
		return mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();
	}

	/**
	 * Del02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR createDel02_DtlR(){
		return mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
	}
	protected MSBCL_MfgActReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBCL1100_Prnt01_INFO;
		this.aPrnt01 = ((MSBCL_MfgActReg)this).new Prnt01();
	}

	public static MSBCL_MfgActReg.Prnt01 crtPrnt01() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
	public mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR createPrnt01_DtlR(){
		return mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR.create();
	}
	protected MSBCL_MfgActReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBCL1100_Sprt01_INFO;
		this.aSprt01 = ((MSBCL_MfgActReg)this).new Sprt01();
	}

	public static MSBCL_MfgActReg.Sprt01 crtSprt01() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addUpBlock(aSprt01.up1());
		p.addDownBlock(aSprt01.down0());
		p.addDownBlock(aSprt01.down1());
	}

	protected void doSprt01() {
		aSprt01.call();
	};
	protected MSBCL_MfgActReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBCL1100_Sprt02_INFO;
		this.aSprt02 = ((MSBCL_MfgActReg)this).new Sprt02();
	}

	public static MSBCL_MfgActReg.Sprt02 crtSprt02() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addUpBlock(aSprt02.up1());
		p.addUpBlock(aSprt02.up2());
		p.addDownBlock(aSprt02.down0());
	}

	protected void doSprt02() {
		aSprt02.call();
	};

	/**
	 * Sprt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt02_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
	}

	/**
	 * Sprt02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
	}

	/**
	 * Sprt02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
	}
	protected MSBCL_MfgActReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBCL1100_Sprt03_INFO;
		this.aSprt03 = ((MSBCL_MfgActReg)this).new Sprt03();
	}

	public static MSBCL_MfgActReg.Sprt03 crtSprt03() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
	}

	protected void doSprt03() {
		aSprt03.call();
	};

	/**
	 * Sprt03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt03_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt03_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt03_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * Sprt03_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt03_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
	}

	/**
	 * Sprt03_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt03_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
	}

	/**
	 * Sprt03_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt03_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
	}
	protected MSBCL_MfgActReg.Sprt04 aSprt04;

	protected void initSprt04() {
		this.info = PDef.MS_MSBCL1100_Sprt04_INFO;
		this.aSprt04 = ((MSBCL_MfgActReg)this).new Sprt04();
	}

	public static MSBCL_MfgActReg.Sprt04 crtSprt04() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
		lgc.initSprt04();
		return lgc.aSprt04;
	}

	protected void paramSprt04(MCParam p) {
		if (this.aSprt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt04.up0());
		p.addDownBlock(aSprt04.down0());
		p.addDownBlock(aSprt04.down1());
		p.addDownBlock(aSprt04.down2());
		p.addDownBlock(aSprt04.down3());
		p.addDownBlock(aSprt04.down4());
		p.addDownBlock(aSprt04.down5());
	}

	protected void doSprt04() {
		aSprt04.call();
	};

	/**
	 * Sprt04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR createSprt04_HdrR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.create();
	}

	/**
	 * Sprt04_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR createSprt04_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.create();
	}

	/**
	 * Sprt04_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> createSprt04_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
	}

	/**
	 * Sprt04_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR createSprt04_DtlInptR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.create();
	}

	/**
	 * Sprt04_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> createSprt04_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
	}

	/**
	 * Sprt04_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSprt04_DtlLossR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
	}

	/**
	 * Sprt04_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSprt04_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
	}

	/**
	 * Sprt04_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR createSprt04_DtlWkR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.create();
	}

	/**
	 * Sprt04_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> createSprt04_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
	}

	/**
	 * Sprt04_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR createSprt04_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.create();
	}

	/**
	 * Sprt04_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> createSprt04_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
	}

	/**
	 * Sprt04_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR createSprt04_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.create();
	}

	/**
	 * Sprt04_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> createSprt04_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
	}
	protected MSBCL_MfgActReg.Sprt06 aSprt06;

	protected void initSprt06() {
		this.info = PDef.MS_MSBCL1100_Sprt06_INFO;
		this.aSprt06 = ((MSBCL_MfgActReg)this).new Sprt06();
	}

	public static MSBCL_MfgActReg.Sprt06 crtSprt06() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
		lgc.initSprt06();
		return lgc.aSprt06;
	}

	protected void paramSprt06(MCParam p) {
		if (this.aSprt06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt06.up0());
		p.addUpBlock(aSprt06.up1());
		p.addUpBlock(aSprt06.up2());
		p.addUpBlock(aSprt06.up3());
		p.addDownBlock(aSprt06.down0());
		p.addDownBlock(aSprt06.down1());
	}

	protected void doSprt06() {
		aSprt06.call();
	};

	/**
	 * Sprt06_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createSprt06_HdrR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
	}

	/**
	 * Sprt06_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR createSprt06_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.create();
	}

	/**
	 * Sprt06_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> createSprt06_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
	}

	/**
	 * Sprt06_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR createSprt06_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.create();
	}

	/**
	 * Sprt06_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> createSprt06_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
	}

	/**
	 * Sprt06_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR createSprt06_DtlInptR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.create();
	}

	/**
	 * Sprt06_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> createSprt06_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
	}

	/**
	 * Sprt06_DtlInptForSrvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR createSprt06_DtlInptForSrvR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.create();
	}

	/**
	 * Sprt06_DtlInptForSrvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> createSprt06_DtlInptForSrvL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
	}

	/**
	 * Sprt06_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSprt06_DtlLossR(){
		return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
	}

	/**
	 * Sprt06_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSprt06_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
	}
	protected MSBCL_MfgActReg.Sprt07 aSprt07;

	protected void initSprt07() {
		this.info = PDef.MS_MSBCL1100_Sprt07_INFO;
		this.aSprt07 = ((MSBCL_MfgActReg)this).new Sprt07();
	}

	public static MSBCL_MfgActReg.Sprt07 crtSprt07() {
		MSBCL_MfgActReg lgc = new MSBCL_MfgActReg();
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
		p.addUpBlock(aSprt07.up3());
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
	public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createSprt07_HdrR(){
		return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
	}

	/**
	 * Sprt07_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR createSprt07_DtlOperR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.create();
	}

	/**
	 * Sprt07_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> createSprt07_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
	}

	/**
	 * Sprt07_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR createSprt07_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.create();
	}

	/**
	 * Sprt07_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> createSprt07_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
	}

	/**
	 * Sprt07_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR createSprt07_DtlWkR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.create();
	}

	/**
	 * Sprt07_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> createSprt07_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
	}

	/**
	 * Sprt07_DtlWkForSrvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR createSprt07_DtlWkForSrvR(){
		return mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.create();
	}

	/**
	 * Sprt07_DtlWkForSrvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> createSprt07_DtlWkForSrvL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索対象区分に応じて、未着手の製造指図または登録済みの製造実績を検索する<br>
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
		private final mcframe.serverMSBC.MSBCL1100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down7;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1100.Srch01_CndR.create();
			down0 = mcframe.serverMSBC.MSBCL1100.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR.class);
			down7 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);

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
			if (i == 6) return down6();
			if (i == 7) return down7();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
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
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR createSrch01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.create();
		}

		/**
		 * Srch01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> createSrch01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
		}

		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
		}

		/**
		 * Srch01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR createSrch01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.create();
		}

		/**
		 * Srch01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> createSrch01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
		}

		/**
		 * Srch01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR createSrch01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.create();
		}

		/**
		 * Srch01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> createSrch01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
		}

		/**
		 * Srch01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR createSrch01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.create();
		}

		/**
		 * Srch01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> createSrch01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
		}

		/**
		 * Srch01_Dtl_ArrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR createSrch01_Dtl_ArrR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR.create();
		}

		/**
		 * Srch01_Dtl_ArrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR> createSrch01_Dtl_ArrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR.class);
		}

		/**
		 * Srch01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSrch01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
		}

		/**
		 * Srch01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSrch01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
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
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>inst_srch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_mfg_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
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
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_purc_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Srch01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_rem_qty</td></tr>
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
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>loss_qty_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_qty_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty_bef</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>schd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_Dtl_ArrR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>def_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down7() {
			return down7;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造実績を登録・訂正する。<br>
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
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> down6;
		
		/**
		 * 連携情報 MA<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 （{@link #maUpd01}）<br>
		 */
		public final String MA = "MA";

		/**
		 * 連携オペレーション maUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #maUpd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #maUpd01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #maUpd01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #maUpd01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #maUpd01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #maUpd01_up5}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #maUpd01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #maUpd01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #maUpd01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #maUpd01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #maUpd01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #maUpd01_down5}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 maUpd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> maUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> maUpd01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> maUpd01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> maUpd01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> maUpd01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> maUpd01_up5;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> maUpd01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> maUpd01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> maUpd01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> maUpd01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> maUpd01_down4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> maUpd01_down5;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
			down0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);

			// 連携オペレーションの初期化
			maUpd01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd01();
			
			// 連携オペレーションのコンテナ取得
			maUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR>)maUpd01.up(1);
			maUpd01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR>)maUpd01.up(2);
			maUpd01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR>)maUpd01.up(3);
			maUpd01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR>)maUpd01.up(4);
			maUpd01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR>)maUpd01.up(5);
			maUpd01_up5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR>)maUpd01.up(6);
			maUpd01_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR>)maUpd01.down(1);
			maUpd01_down1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR>)maUpd01.down(2);
			maUpd01_down2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR>)maUpd01.down(3);
			maUpd01_down3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR>)maUpd01.down(4);
			maUpd01_down4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR>)maUpd01.down(5);
			maUpd01_down5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR>)maUpd01.down(6);

			// オペレーション、オペレーショングループの登録
			appendOpe(MA, maUpd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MA<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #maUpd01_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #maUpd01_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #maUpd01_up2}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #maUpd01_up3}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #maUpd01_up4}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #maUpd01_up5}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MA)) {
				up_MA(maUpd01_up0, maUpd01_up1, maUpd01_up2, maUpd01_up3, maUpd01_up4, maUpd01_up5, up1(), up2(), up3(), up4(), up5(), up6());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MA<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt;（{@link #maUpd01_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt;（{@link #maUpd01_down1}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt;（{@link #maUpd01_down2}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt;（{@link #maUpd01_down3}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt;（{@link #maUpd01_down4}）=> down5()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt;（{@link #maUpd01_down5}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MA)) {
				down_MA(down1(), down2(), down3(), down4(), down5(), down6(), maUpd01_down0, maUpd01_down1, maUpd01_down2, maUpd01_down3, maUpd01_down4, maUpd01_down5);
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
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
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
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createUpd01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
		}

		/**
		 * Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createUpd01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
		}

		/**
		 * Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createUpd01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
		}

		/**
		 * Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createUpd01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
		}

		/**
		 * Upd01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createUpd01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
		}

		/**
		 * Upd01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createUpd01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
		}

		/**
		 * Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createUpd01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
		}

		/**
		 * Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createUpd01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
		}

		/**
		 * Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createUpd01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
		}

		/**
		 * Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createUpd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
		}

		/**
		 * Upd01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createUpd01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
		}

		/**
		 * Upd01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createUpd01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> up6() {
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
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> down4() {
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
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}

		//-----------------------MA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MA(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src_Upd01_DtlByProd){
			up_MA_maUpd01_0(dest0_0, src_Upd01_DtlOper);
			up_MA_maUpd01_1(dest0_1, src_Upd01_DtlInpt);
			up_MA_maUpd01_2(dest0_2, src_Upd01_DtlLoss);
			up_MA_maUpd01_3(dest0_3, src_Upd01_DtlWk);
			up_MA_maUpd01_4(dest0_4, src_Upd01_DtlYield);
			up_MA_maUpd01_5(dest0_5, src_Upd01_DtlByProd);
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_0() {
			MCRowMapper map = new Map_up_MA_maUpd01_0();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_unit_act_qty", "oper_unit_act_qty");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ");
				addColumnPathMap("oper_unit_dec_place", "oper_unit_dec_place");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_yield", "oper_yield");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_act_intr_rmrks", "oper_act_intr_rmrks");
				addColumnPathMap("oper_act_rpt_rmrks", "oper_act_rpt_rmrks");
				addColumnPathMap("oper_act_sub_char1", "oper_act_sub_char1");
				addColumnPathMap("oper_act_sub_char2", "oper_act_sub_char2");
				addColumnPathMap("oper_act_sub_char3", "oper_act_sub_char3");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("bkf_upd_flg", "bkf_upd_flg");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("bkf_not_ref_flg", "bkf_not_ref_flg");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_1() {
			MCRowMapper map = new Map_up_MA_maUpd01_1();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("base_unit_inpt_qty", "base_unit_inpt_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("inpt_lot_no", "inpt_lot_no");
				addColumnPathMap("inpt_sublot_no", "inpt_sublot_no");
				addColumnPathMap("vld_dt", "vld_dt");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
				addColumnPathMap("acxfr_act_qty", "acxfr_act_qty");
				addColumnPathMap("acxfr_act_rsn_cd", "acxfr_act_rsn_cd");
				addColumnPathMap("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("inst_sno1", "inst_sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("inst_sno2", "inst_sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("inst_sno3", "inst_sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inst_sno4", "inst_sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("inpt_rsn_cd", "inpt_rsn_cd");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_loc_sppl_cd", "inpt_loc_sppl_cd");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("inpt_act_intr_rmrks", "inpt_act_intr_rmrks");
				addColumnPathMap("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("inpt_act_sub_char1", "inpt_act_sub_char1");
				addColumnPathMap("inpt_act_sub_char2", "inpt_act_sub_char2");
				addColumnPathMap("inpt_act_sub_char3", "inpt_act_sub_char3");
				addColumnPathMap("bkf_upd_flg", "bkf_upd_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("base_unit_alt_qty", "base_unit_alt_qty");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("slf_support_cur_cd", "slf_support_cur_cd");
				addColumnPathMap("slf_support_upri", "slf_support_upri");
				addColumnPathMap("slf_support_tax_cd", "slf_support_tax_cd");
				addColumnPathMap("slf_support_xrate_cd", "slf_support_xrate_cd");
				addColumnPathMap("slf_support_xrate", "slf_support_xrate");
				addColumnPathMap("vmi_interim_flg", "vmi_interim_flg");
				addColumnPathMap("vmi_upri", "vmi_upri");
				addColumnPathMap("add_flg", "add_flg");
				addColumnPathMap("old_ver_no", "old_ver_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_inpt_act_no", "ext_inpt_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
				addColumnPathMap("is_only_abort_flg", "is_only_abort_flg");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_2() {
			MCRowMapper map = new Map_up_MA_maUpd01_2();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("fxd_loss_flg", "fxd_loss_flg");
				addColumnPathMap("loss_act_no", "loss_act_no");
				addColumnPathMap("loss_rsn_cd", "loss_rsn_cd");
				addColumnPathMap("loss_qty", "loss_qty");
				addColumnPathMap("cont_loss_qty", "cont_loss_qty");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_3() {
			MCRowMapper map = new Map_up_MA_maUpd01_3();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg");
				addColumnPathMap("wk_act_intr_rmrks", "wk_act_intr_rmrks");
				addColumnPathMap("wk_act_sub_char1", "wk_act_sub_char1");
				addColumnPathMap("wk_act_sub_char2", "wk_act_sub_char2");
				addColumnPathMap("wk_act_sub_char3", "wk_act_sub_char3");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_4() {
			MCRowMapper map = new Map_up_MA_maUpd01_4();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("yield_act_intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("yield_act_rpt_rmrks", "yield_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("sublot_ctl_flg", "sublot_ctl_flg");
				addColumnPathMap("not_stk_flg", "not_stk_flg");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("old_yield_typ", "old_yield_typ");
				addColumnPathMap("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maUpd01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maUpd01_5() {
			MCRowMapper map = new Map_up_MA_maUpd01_5();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maUpd01_5 extends MCRowMapper {
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
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("yield_act_intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("sublot_ctl_flg", "sublot_ctl_flg");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maUpd01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maUpd01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MA_maUpd01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maUpd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MA(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest_Upd01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src0_5){
			down_MA_maUpd01_0(dest_Upd01_DtlOper, src0_0);
			down_MA_maUpd01_1(dest_Upd01_DtlInpt, src0_1);
			down_MA_maUpd01_2(dest_Upd01_DtlLoss, src0_2);
			down_MA_maUpd01_3(dest_Upd01_DtlWk, src0_3);
			down_MA_maUpd01_4(dest_Upd01_DtlYield, src0_4);
			down_MA_maUpd01_5(dest_Upd01_DtlByProd, src0_5);
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_0() {
			MCRowMapper map = new Map_down_MA_maUpd01_0();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_act_no", "oper_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_1() {
			MCRowMapper map = new Map_down_MA_maUpd01_1();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_act_no", "inpt_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_2() {
			MCRowMapper map = new Map_down_MA_maUpd01_2();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loss_act_no", "loss_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_3() {
			MCRowMapper map = new Map_down_MA_maUpd01_3();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wk_act_no", "wk_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_4() {
			MCRowMapper map = new Map_down_MA_maUpd01_4();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maUpd01_5() {
			MCRowMapper map = new Map_down_MA_maUpd01_5();
			return map;
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maUpd01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
			}
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maUpd01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MA_maUpd01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maUpd01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MA_maUpd01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maUpd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 製造実績を承認する。<br>
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
		private final mcframe.serverMSBC.MSBCL1100.Upd02_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Upd02_DtlR down0;
		/** [Upd02_Ctrl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR aUpd02_Ctrl;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
			aUpd02_Ctrl = mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();

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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR createUpd02_CtrlR(){
			return mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();
		}

		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR createUpd02_DtlR(){
			return mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
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
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR up0() {
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
		 * @see mcframe.serverMSBC.MSBCL1100.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR down0() {
			return down0;
		}


		/**
		 * [Upd02_Ctrl]ブロックのコンテナaUpd02_CtrlRを返します。
		 *
		 * @return Upd02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR Upd02_Ctrl() {
			return aUpd02_Ctrl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造実績を削除する。<br>
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
		private final mcframe.serverMSBC.MSBCL1100.Del01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR> up3;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1100.Del01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR.class);

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
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Del01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBC.MSBCL1100.Del01_HdrR.create();
		}

		/**
		 * Del01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR createDel01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR.create();
		}

		/**
		 * Del01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR> createDel01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR.class);
		}

		/**
		 * Del01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR createDel01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR.create();
		}

		/**
		 * Del01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR> createDel01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR.class);
		}

		/**
		 * Del01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR createDel01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR.create();
		}

		/**
		 * Del01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR> createDel01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Del01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL1100.Del01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlInptR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Del01_DtlByProdR> up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造実績の承認を取り消す。<br>
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
		private final mcframe.serverMSBC.MSBCL1100.Upd02_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Upd02_DtlR down0;
		/** [Del02_Ctrl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR aDel02_Ctrl;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
			aDel02_Ctrl = mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();

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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR createDel02_CtrlR(){
			return mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR.create();
		}

		/**
		 * Del02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR createDel02_DtlR(){
			return mcframe.serverMSBC.MSBCL1100.Upd02_DtlR.create();
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
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR up0() {
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
		 * @see mcframe.serverMSBC.MSBCL1100.Upd02_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_DtlR down0() {
			return down0;
		}


		/**
		 * [Del02_Ctrl]ブロックのコンテナaDel02_CtrlRを返します。
		 *
		 * @return Del02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Upd02_CtrlR Del02_Ctrl() {
			return aDel02_Ctrl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造記録書を発行する。<br>
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
		private final mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR.create();

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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR createPrnt01_DtlR(){
			return mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL1100.Prnt01_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 在庫から投入品のロットを提案する。<br>
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
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down1;
		
		/**
		 * 連携情報 LP<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.LotProp_Sprt01 （{@link #lotPropSprt01}）<br>
		 */
		public final String LP = "LP";

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
			up0 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);

			// 連携オペレーションの初期化
			lotPropSprt01 = mcframe.serverMSBC.MSBCL6040.MSBCL_LotPropService.crtLotProp_Sprt01();
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
			appendOpe(LP, lotPropSprt01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * LP<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(LP)) {
				up_LP();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * LP<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(LP)) {
				down_LP();
			}
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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR createSrch01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.create();
		}

		/**
		 * Srch01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> createSrch01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
		}

		/**
		 * Srch01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSrch01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
		}

		/**
		 * Srch01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSrch01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>check</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>check</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}

		//-----------------------LP専用up関連メソッド--------------------------
		/**
		 * オペレーショングループLPの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_LP(){
		}

		//-----------------------LP専用down関連メソッド--------------------------

		/**
		 * オペレーショングループLPの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_LP(){
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯを発番する<br>
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
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0;
		
		
		// コンストラクタ
		protected Sprt02() {
			
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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt02_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
		}

		/**
		 * Sprt02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
		}

		/**
		 * Sprt02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt02_DtlInptL(){
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
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 副産品のロットＮＯ、サブロットＮＯを発番する<br>
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
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0;
		
		
		// コンストラクタ
		protected Sprt03() {
			
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
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt03_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt03_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createSprt03_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * Sprt03_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createSprt03_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
		}

		/**
		 * Sprt03_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createSprt03_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
		}

		/**
		 * Sprt03_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createSprt03_DtlInptL(){
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
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 入力された着手数量で指図、出来高、投入、工数、副産品の数量を再計算する。<br>
	 */
	abstract public class Sprt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> down5;
		/** [Sprt04_DtlByProd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> aSprt04_DtlByProd;
		/** [Sprt04_DtlInpt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> aSprt04_DtlInpt;
		/** [Sprt04_DtlOper]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> aSprt04_DtlOper;
		/** [Sprt04_DtlWk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> aSprt04_DtlWk;
		/** [Sprt04_DtlYield]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> aSprt04_DtlYield;
		
		/**
		 * 連携情報 RC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt03 （{@link #reCalcSprt03}）<br>
		 */
		public final String RC = "RC";

		/**
		 * 連携オペレーション reCalcSprt03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR&gt; （{@link #reCalcSprt03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR&gt; （{@link #reCalcSprt03_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR&gt; （{@link #reCalcSprt03_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR&gt; （{@link #reCalcSprt03_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR&gt; （{@link #reCalcSprt03_up4}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt03 reCalcSprt03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> reCalcSprt03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> reCalcSprt03_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> reCalcSprt03_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> reCalcSprt03_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> reCalcSprt03_up4;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
			aSprt04_DtlByProd = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
			aSprt04_DtlInpt = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
			aSprt04_DtlOper = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
			aSprt04_DtlWk = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
			aSprt04_DtlYield = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);

			// 連携オペレーションの初期化
			reCalcSprt03 = mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.crtMfgReCalc_Sprt03();
			
			// 連携オペレーションのコンテナ取得
			reCalcSprt03_up0 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR>)reCalcSprt03.up(1);
			reCalcSprt03_up1 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR>)reCalcSprt03.up(4);
			reCalcSprt03_up2 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR>)reCalcSprt03.up(5);
			reCalcSprt03_up3 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR>)reCalcSprt03.up(2);
			reCalcSprt03_up4 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR>)reCalcSprt03.up(3);

			// オペレーション、オペレーショングループの登録
			appendOpe(RC, reCalcSprt03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RC<br>
		 * aSprt04_DtlOper => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR&gt; （{@link #reCalcSprt03_up0}）<br>
		 * aSprt04_DtlInpt => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR&gt; （{@link #reCalcSprt03_up1}）<br>
		 * aSprt04_DtlWk => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR&gt; （{@link #reCalcSprt03_up2}）<br>
		 * aSprt04_DtlYield => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR&gt; （{@link #reCalcSprt03_up3}）<br>
		 * aSprt04_DtlByProd => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR&gt; （{@link #reCalcSprt03_up4}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RC)) {
				up_RC(reCalcSprt03_up0, reCalcSprt03_up1, reCalcSprt03_up2, reCalcSprt03_up3, reCalcSprt03_up4, aSprt04_DtlOper, aSprt04_DtlInpt, aSprt04_DtlWk, aSprt04_DtlYield, aSprt04_DtlByProd);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RC<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RC)) {
				down_RC();
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
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
		 * Sprt04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR createSprt04_HdrR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR.create();
		}

		/**
		 * Sprt04_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR createSprt04_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.create();
		}

		/**
		 * Sprt04_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> createSprt04_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR.class);
		}

		/**
		 * Sprt04_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR createSprt04_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.create();
		}

		/**
		 * Sprt04_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> createSprt04_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR.class);
		}

		/**
		 * Sprt04_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSprt04_DtlLossR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
		}

		/**
		 * Sprt04_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSprt04_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
		}

		/**
		 * Sprt04_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR createSprt04_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.create();
		}

		/**
		 * Sprt04_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> createSprt04_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR.class);
		}

		/**
		 * Sprt04_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR createSprt04_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.create();
		}

		/**
		 * Sprt04_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> createSprt04_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR.class);
		}

		/**
		 * Sprt04_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR createSprt04_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.create();
		}

		/**
		 * Sprt04_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> createSprt04_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_rem_qty</td></tr>
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
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>loss_qty_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_qty_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>def_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>schd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> down5() {
			return down5;
		}


		/**
		 * [Sprt04_DtlByProd]ブロックのコンテナaSprt04_DtlByProdLを返します。
		 *
		 * @return Sprt04_DtlByProdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> Sprt04_DtlByProd() {
			return aSprt04_DtlByProd;
		}

		/**
		 * [Sprt04_DtlInpt]ブロックのコンテナaSprt04_DtlInptLを返します。
		 *
		 * @return Sprt04_DtlInptL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> Sprt04_DtlInpt() {
			return aSprt04_DtlInpt;
		}

		/**
		 * [Sprt04_DtlOper]ブロックのコンテナaSprt04_DtlOperLを返します。
		 *
		 * @return Sprt04_DtlOperL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> Sprt04_DtlOper() {
			return aSprt04_DtlOper;
		}

		/**
		 * [Sprt04_DtlWk]ブロックのコンテナaSprt04_DtlWkLを返します。
		 *
		 * @return Sprt04_DtlWkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> Sprt04_DtlWk() {
			return aSprt04_DtlWk;
		}

		/**
		 * [Sprt04_DtlYield]ブロックのコンテナaSprt04_DtlYieldLを返します。
		 *
		 * @return Sprt04_DtlYieldL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> Sprt04_DtlYield() {
			return aSprt04_DtlYield;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}

		//-----------------------RC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RC(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> dest0_4, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> src_Sprt04_DtlOper, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> src_Sprt04_DtlInpt, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> src_Sprt04_DtlWk, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> src_Sprt04_DtlYield, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> src_Sprt04_DtlByProd){
			up_RC_reCalcSprt03_0(dest0_0, src_Sprt04_DtlOper);
			up_RC_reCalcSprt03_1(dest0_1, src_Sprt04_DtlInpt);
			up_RC_reCalcSprt03_2(dest0_2, src_Sprt04_DtlWk);
			up_RC_reCalcSprt03_3(dest0_3, src_Sprt04_DtlYield);
			up_RC_reCalcSprt03_4(dest0_4, src_Sprt04_DtlByProd);
		}
		
		/**
		 * 連携処理RC_reCalcSprt03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt03_0() {
			MCRowMapper map = new Map_up_RC_reCalcSprt03_0();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt03_0(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR r_dest, mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt03_0(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt03_0();
			for(mcframe.serverMSBC.MSBCL1100.Srch01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt03_1() {
			MCRowMapper map = new Map_up_RC_reCalcSprt03_1();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("recalc_grp", "recalc_grp");
				addColumnPathMap("recalc_grp_seq", "recalc_grp_seq");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt03_1(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR r_dest, mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt03_1(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt03_1();
			for(mcframe.serverMSBC.MSBCL1100.Srch01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt03の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt03_2() {
			MCRowMapper map = new Map_up_RC_reCalcSprt03_2();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt03_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt03_2(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR r_dest, mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt03_2(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt03_2();
			for(mcframe.serverMSBC.MSBCL1100.Srch01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt03_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt03の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt03_3() {
			MCRowMapper map = new Map_up_RC_reCalcSprt03_3();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt03_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt03_3(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt03_3(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt03_3();
			for(mcframe.serverMSBC.MSBCL1100.Srch01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt03_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt03の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt03_4() {
			MCRowMapper map = new Map_up_RC_reCalcSprt03_4();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt03_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt03_4(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt03の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt03_4(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt03_4();
			for(mcframe.serverMSBC.MSBCL1100.Srch01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt03_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt03_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RC(){
		}
	}
	/**
	 * Sprt06オペレーション.<p>
	 *
	 * 投入再計算ボタン押下時、工程実績または出来高実績の予定数量・実績数量から投入の数量を再計算する。<br>
	 */
	abstract public class Sprt06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down1;
		/** [Sprt06_DtlInptForSrv]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> aSprt06_DtlInptForSrv;
		
		/**
		 * 連携情報 RC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02 （{@link #reCalcSprt02}）<br>
		 */
		public final String RC = "RC";

		/**
		 * 連携オペレーション reCalcSprt02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR&gt; （{@link #reCalcSprt02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR&gt; （{@link #reCalcSprt02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR&gt; （{@link #reCalcSprt02_up2}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02 reCalcSprt02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> reCalcSprt02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> reCalcSprt02_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> reCalcSprt02_up2;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt06() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
			aSprt06_DtlInptForSrv = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);

			// 連携オペレーションの初期化
			reCalcSprt02 = mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.crtMfgReCalc_Sprt02();
			
			// 連携オペレーションのコンテナ取得
			reCalcSprt02_up0 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR>)reCalcSprt02.up(1);
			reCalcSprt02_up1 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR>)reCalcSprt02.up(2);
			reCalcSprt02_up2 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR>)reCalcSprt02.up(3);

			// オペレーション、オペレーショングループの登録
			appendOpe(RC, reCalcSprt02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RC<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR&gt; （{@link #reCalcSprt02_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR&gt; （{@link #reCalcSprt02_up1}）<br>
		 * aSprt06_DtlInptForSrv => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR&gt; （{@link #reCalcSprt02_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RC)) {
				up_RC(reCalcSprt02_up0, reCalcSprt02_up1, reCalcSprt02_up2, up1(), up2(), aSprt06_DtlInptForSrv);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RC<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RC)) {
				down_RC();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Sprt06_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createSprt06_HdrR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
		}

		/**
		 * Sprt06_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR createSprt06_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.create();
		}

		/**
		 * Sprt06_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> createSprt06_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
		}

		/**
		 * Sprt06_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR createSprt06_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.create();
		}

		/**
		 * Sprt06_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> createSprt06_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
		}

		/**
		 * Sprt06_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR createSprt06_DtlInptR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.create();
		}

		/**
		 * Sprt06_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> createSprt06_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
		}

		/**
		 * Sprt06_DtlInptForSrvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR createSprt06_DtlInptForSrvR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.create();
		}

		/**
		 * Sprt06_DtlInptForSrvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> createSprt06_DtlInptForSrvL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR.class);
		}

		/**
		 * Sprt06_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR createSprt06_DtlLossR(){
			return mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.create();
		}

		/**
		 * Sprt06_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> createSprt06_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_purc_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>up_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp</td></tr>
		 * 	<tr><td><br></td><td>recalc_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_st_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_act_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>up_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_act_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>def_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Srch01_DtlLossR> down1() {
			return down1;
		}


		/**
		 * [Sprt06_DtlInptForSrv]ブロックのコンテナaSprt06_DtlInptForSrvLを返します。
		 *
		 * @return Sprt06_DtlInptForSrvL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> Sprt06_DtlInptForSrv() {
			return aSprt06_DtlInptForSrv;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}

		//-----------------------RC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RC(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> src_Sprt06_DtlOper, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> src_Sprt06_DtlYield, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> src_Sprt06_DtlInptForSrv){
			up_RC_reCalcSprt02_0(dest0_0, src_Sprt06_DtlOper);
			up_RC_reCalcSprt02_1(dest0_1, src_Sprt06_DtlYield);
			up_RC_reCalcSprt02_2(dest0_2, src_Sprt06_DtlInptForSrv);
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_0() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_0();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("base_unit_st_qty", "base_unit_st_qty");
				addColumnPathMap("base_unit_act_qty", "base_unit_act_qty");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_0(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_0(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_0();
			for(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_1() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_1();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("base_unit_yield_st_qty", "base_unit_yield_st_qty");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_1(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_1(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_1();
			for(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_2() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_2();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("recalc_grp", "recalc_grp");
				addColumnPathMap("recalc_grp_seq", "recalc_grp_seq");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
				addColumnPathMap("inpt_st_qty", "inpt_st_qty");
				addColumnPathMap("inpt_act_qty", "inpt_act_qty");
				addColumnPathMap("dec_place", "dec_place");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_2(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_2(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_2();
			for(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RC(){
		}
	}
	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 工数再計算ボタン押下時、工程実績または出来高実績の予定数量・実績数量から工数を再計算する。<br>
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
		private final mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> down0;
		/** [Sprt07_DtlWkForSrv]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> aSprt07_DtlWkForSrv;
		
		/**
		 * 連携情報 RC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02 （{@link #reCalcSprt02}）<br>
		 */
		public final String RC = "RC";

		/**
		 * 連携オペレーション reCalcSprt02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR&gt; （{@link #reCalcSprt02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR&gt; （{@link #reCalcSprt02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR&gt; （{@link #reCalcSprt02_up2}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.MfgReCalc_Sprt02 reCalcSprt02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> reCalcSprt02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> reCalcSprt02_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> reCalcSprt02_up2;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt07() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
			aSprt07_DtlWkForSrv = MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);

			// 連携オペレーションの初期化
			reCalcSprt02 = mcframe.serverMSBC.MSBCL6070.MSBCL_MfgReCalcService.crtMfgReCalc_Sprt02();
			
			// 連携オペレーションのコンテナ取得
			reCalcSprt02_up0 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR>)reCalcSprt02.up(1);
			reCalcSprt02_up1 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR>)reCalcSprt02.up(2);
			reCalcSprt02_up2 = (MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR>)reCalcSprt02.up(4);

			// オペレーション、オペレーショングループの登録
			appendOpe(RC, reCalcSprt02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RC<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR&gt; （{@link #reCalcSprt02_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR&gt; （{@link #reCalcSprt02_up1}）<br>
		 * aSprt07_DtlWkForSrv => MCList&lt;mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR&gt; （{@link #reCalcSprt02_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RC)) {
				up_RC(reCalcSprt02_up0, reCalcSprt02_up1, reCalcSprt02_up2, up1(), up2(), aSprt07_DtlWkForSrv);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RC<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RC)) {
				down_RC();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt07_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR createSprt07_HdrR(){
			return mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR.create();
		}

		/**
		 * Sprt07_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR createSprt07_DtlOperR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.create();
		}

		/**
		 * Sprt07_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> createSprt07_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR.class);
		}

		/**
		 * Sprt07_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR createSprt07_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.create();
		}

		/**
		 * Sprt07_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> createSprt07_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR.class);
		}

		/**
		 * Sprt07_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR createSprt07_DtlWkR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.create();
		}

		/**
		 * Sprt07_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> createSprt07_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
		}

		/**
		 * Sprt07_DtlWkForSrvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR createSprt07_DtlWkForSrvR(){
			return mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.create();
		}

		/**
		 * Sprt07_DtlWkForSrvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> createSprt07_DtlWkForSrvL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_st_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>st_cost</td></tr>
		 * 	<tr><td><br></td><td>act_cost</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_fxd_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>act_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> down0() {
			return down0;
		}


		/**
		 * [Sprt07_DtlWkForSrv]ブロックのコンテナaSprt07_DtlWkForSrvLを返します。
		 *
		 * @return Sprt07_DtlWkForSrvL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> Sprt07_DtlWkForSrv() {
			return aSprt07_DtlWkForSrv;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActReg)MSBCL_MfgActReg_MC_A.this).info;
		}

		//-----------------------RC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RC(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> dest0_2, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> src_Sprt07_DtlOper, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> src_Sprt07_DtlYield, MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> src_Sprt07_DtlWkForSrv){
			up_RC_reCalcSprt02_0(dest0_0, src_Sprt07_DtlOper);
			up_RC_reCalcSprt02_1(dest0_1, src_Sprt07_DtlYield);
			up_RC_reCalcSprt02_2(dest0_2, src_Sprt07_DtlWkForSrv);
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_0() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_0();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("base_unit_st_qty", "base_unit_st_qty");
				addColumnPathMap("base_unit_act_qty", "base_unit_act_qty");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_0(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_0(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_0();
			for(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_1() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_1();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("base_unit_yield_st_qty", "base_unit_yield_st_qty");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_1(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_1(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_1();
			for(mcframe.serverMSBC.MSBCL1100.Sprt06_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RC_reCalcSprt02_2() {
			MCRowMapper map = new Map_up_RC_reCalcSprt02_2();
			return map;
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_RC_reCalcSprt02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("st_cost", "st_cost");
				addColumnPathMap("act_cost", "act_cost");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("st_fxd_cost", "st_fxd_cost");
			}
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RC_reCalcSprt02_2(mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR r_dest, mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR r_src) {
		}

		/**
		 * 連携処理RC_reCalcSprt02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RC_reCalcSprt02_2(MCList<mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_RC_reCalcSprt02_2();
			for(mcframe.serverMSBC.MSBCL1100.Sprt07_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6070.MfgReCalc_Sprt02_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RC_reCalcSprt02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RC(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}