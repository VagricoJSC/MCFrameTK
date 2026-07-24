package mcframe.serverMSBC.MSBCL6080;

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
 * "MSBCL_MfgActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgActRcptIFService.MfgActIF_Upd01 aMfgActIF_Upd01;

	protected void initMfgActIF_Upd01() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Upd01_INFO;
		this.aMfgActIF_Upd01 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Upd01();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Upd01 crtMfgActIF_Upd01() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Upd01();
		return lgc.aMfgActIF_Upd01;
	}

	protected void paramMfgActIF_Upd01(MCParam p) {
		if (this.aMfgActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Upd01.up0());
		p.addUpBlock(aMfgActIF_Upd01.up1());
		p.addUpBlock(aMfgActIF_Upd01.up2());
		p.addUpBlock(aMfgActIF_Upd01.up3());
		p.addUpBlock(aMfgActIF_Upd01.up4());
		p.addUpBlock(aMfgActIF_Upd01.up5());
		p.addUpBlock(aMfgActIF_Upd01.up6());
		p.addUpBlock(aMfgActIF_Upd01.up7());
		p.addUpBlock(aMfgActIF_Upd01.up8());
		p.addDownBlock(aMfgActIF_Upd01.down0());
		p.addDownBlock(aMfgActIF_Upd01.down1());
		p.addDownBlock(aMfgActIF_Upd01.down2());
		p.addDownBlock(aMfgActIF_Upd01.down3());
		p.addDownBlock(aMfgActIF_Upd01.down4());
		p.addDownBlock(aMfgActIF_Upd01.down5());
		p.addDownBlock(aMfgActIF_Upd01.down6());
	}

	protected void doMfgActIF_Upd01() {
		aMfgActIF_Upd01.call();
	};

	/**
	 * MfgActIF_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR createMfgActIF_Upd01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR.create();
	}

	/**
	 * MfgActIF_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR createMfgActIF_Upd01_HdrR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.create();
	}

	/**
	 * MfgActIF_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> createMfgActIF_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR createMfgActIF_Upd01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> createMfgActIF_Upd01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR createMfgActIF_Upd01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> createMfgActIF_Upd01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR createMfgActIF_Upd01_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> createMfgActIF_Upd01_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR createMfgActIF_Upd01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> createMfgActIF_Upd01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR createMfgActIF_Upd01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> createMfgActIF_Upd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.class);
	}

	/**
	 * MfgActIF_Upd01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR createMfgActIF_Upd01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.create();
	}

	/**
	 * MfgActIF_Upd01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> createMfgActIF_Upd01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.class);
	}

	/**
	 * MfgActIF_Upd01_IO_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR createMfgActIF_Upd01_IO_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR.create();
	}
	protected MSBCL_MfgActRcptIFService.MfgActIF_Del01 aMfgActIF_Del01;

	protected void initMfgActIF_Del01() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Del01_INFO;
		this.aMfgActIF_Del01 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Del01();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Del01 crtMfgActIF_Del01() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Del01();
		return lgc.aMfgActIF_Del01;
	}

	protected void paramMfgActIF_Del01(MCParam p) {
		if (this.aMfgActIF_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Del01.up0());
		p.addUpBlock(aMfgActIF_Del01.up1());
		p.addUpBlock(aMfgActIF_Del01.up2());
		p.addUpBlock(aMfgActIF_Del01.up3());
		p.addUpBlock(aMfgActIF_Del01.up4());
		p.addDownBlock(aMfgActIF_Del01.down0());
	}

	protected void doMfgActIF_Del01() {
		aMfgActIF_Del01.call();
	};

	/**
	 * MfgActIF_Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR createMfgActIF_Del01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR.create();
	}

	/**
	 * MfgActIF_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR createMfgActIF_Del01_HdrR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.create();
	}

	/**
	 * MfgActIF_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> createMfgActIF_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.class);
	}

	/**
	 * MfgActIF_Del01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR createMfgActIF_Del01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR.create();
	}

	/**
	 * MfgActIF_Del01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> createMfgActIF_Del01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR.class);
	}

	/**
	 * MfgActIF_Del01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR createMfgActIF_Del01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR.create();
	}

	/**
	 * MfgActIF_Del01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> createMfgActIF_Del01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR.class);
	}

	/**
	 * MfgActIF_Del01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR createMfgActIF_Del01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR.create();
	}

	/**
	 * MfgActIF_Del01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> createMfgActIF_Del01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR.class);
	}
	protected MSBCL_MfgActRcptIFService.MfgActIF_Upd02 aMfgActIF_Upd02;

	protected void initMfgActIF_Upd02() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Upd02_INFO;
		this.aMfgActIF_Upd02 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Upd02();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Upd02 crtMfgActIF_Upd02() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Upd02();
		return lgc.aMfgActIF_Upd02;
	}

	protected void paramMfgActIF_Upd02(MCParam p) {
		if (this.aMfgActIF_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Upd02.up0());
		p.addUpBlock(aMfgActIF_Upd02.up1());
		p.addDownBlock(aMfgActIF_Upd02.down0());
	}

	protected void doMfgActIF_Upd02() {
		aMfgActIF_Upd02.call();
	};

	/**
	 * MfgActIF_Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR createMfgActIF_Upd02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR.create();
	}

	/**
	 * MfgActIF_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR createMfgActIF_Upd02_RsltR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.create();
	}

	/**
	 * MfgActIF_Upd02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> createMfgActIF_Upd02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
	}
	protected MSBCL_MfgActRcptIFService.MfgActIF_Del02 aMfgActIF_Del02;

	protected void initMfgActIF_Del02() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Del02_INFO;
		this.aMfgActIF_Del02 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Del02();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Del02 crtMfgActIF_Del02() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Del02();
		return lgc.aMfgActIF_Del02;
	}

	protected void paramMfgActIF_Del02(MCParam p) {
		if (this.aMfgActIF_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Del02.up0());
		p.addUpBlock(aMfgActIF_Del02.up1());
		p.addDownBlock(aMfgActIF_Del02.down0());
	}

	protected void doMfgActIF_Del02() {
		aMfgActIF_Del02.call();
	};

	/**
	 * MfgActIF_Del02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR createMfgActIF_Del02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR.create();
	}

	/**
	 * MfgActIF_Del02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR createMfgActIF_Del02_RsltR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.create();
	}

	/**
	 * MfgActIF_Del02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> createMfgActIF_Del02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
	}
	protected MSBCL_MfgActRcptIFService.MfgActIF_Upd03 aMfgActIF_Upd03;

	protected void initMfgActIF_Upd03() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Upd03_INFO;
		this.aMfgActIF_Upd03 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Upd03();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Upd03 crtMfgActIF_Upd03() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Upd03();
		return lgc.aMfgActIF_Upd03;
	}

	protected void paramMfgActIF_Upd03(MCParam p) {
		if (this.aMfgActIF_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Upd03.up0());
		p.addUpBlock(aMfgActIF_Upd03.up1());
		p.addUpBlock(aMfgActIF_Upd03.up2());
		p.addUpBlock(aMfgActIF_Upd03.up3());
		p.addDownBlock(aMfgActIF_Upd03.down0());
		p.addDownBlock(aMfgActIF_Upd03.down1());
		p.addDownBlock(aMfgActIF_Upd03.down2());
	}

	protected void doMfgActIF_Upd03() {
		aMfgActIF_Upd03.call();
	};

	/**
	 * MfgActIF_Upd03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR createMfgActIF_Upd03_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR.create();
	}

	/**
	 * MfgActIF_Upd03_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R createMfgActIF_Upd03_Hdr1R(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.create();
	}

	/**
	 * MfgActIF_Upd03_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> createMfgActIF_Upd03_Hdr1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.class);
	}

	/**
	 * MfgActIF_Upd03_Hdr2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActIF_Upd03_Hdr2R(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
	}

	/**
	 * MfgActIF_Upd03_Hdr2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActIF_Upd03_Hdr2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
	}

	/**
	 * MfgActIF_Upd03_DtlYieldByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR createMfgActIF_Upd03_DtlYieldByProdR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.create();
	}

	/**
	 * MfgActIF_Upd03_DtlYieldByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> createMfgActIF_Upd03_DtlYieldByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.class);
	}
	protected MSBCL_MfgActRcptIFService.MfgActIF_Upd04 aMfgActIF_Upd04;

	protected void initMfgActIF_Upd04() {
		this.info = PDef.MS_MSBCL6080_MfgActIF_Upd04_INFO;
		this.aMfgActIF_Upd04 = ((MSBCL_MfgActRcptIFService)this).new MfgActIF_Upd04();
	}

	public static MSBCL_MfgActRcptIFService.MfgActIF_Upd04 crtMfgActIF_Upd04() {
		MSBCL_MfgActRcptIFService lgc = new MSBCL_MfgActRcptIFService();
		lgc.initMfgActIF_Upd04();
		return lgc.aMfgActIF_Upd04;
	}

	protected void paramMfgActIF_Upd04(MCParam p) {
		if (this.aMfgActIF_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActIF_Upd04.up0());
		p.addUpBlock(aMfgActIF_Upd04.up1());
		p.addDownBlock(aMfgActIF_Upd04.down0());
	}

	protected void doMfgActIF_Upd04() {
		aMfgActIF_Upd04.call();
	};

	/**
	 * MfgActIF_Upd04_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR createMfgActIF_Upd04_CtrlR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR.create();
	}

	/**
	 * MfgActIF_Upd04_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR createMfgActIF_Upd04_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.create();
	}

	/**
	 * MfgActIF_Upd04_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> createMfgActIF_Upd04_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgActIF_Upd01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正を行う。<br>
	 */
	abstract public class MfgActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> up6;
		/** このオペレーションへの上り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> up7;
		/** このオペレーションへの上り電文パラメータの第8ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR up8;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> down6;
		
		/**
		 * 連携情報 MARC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01 （{@link #chk01}）<br>
		 */
		public final String MARC = "MARC";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_up5}）<br>
		 * 第7 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_up6}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_down5}）<br>
		 * 第7 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_down6}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> chk01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> chk01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> chk01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> chk01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> chk01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> chk01_up5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> chk01_up6;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> chk01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> chk01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> chk01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> chk01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> chk01_down4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> chk01_down5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> chk01_down6;
		/**
		 * 連携情報 MARU<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 （{@link #upd01}）<br>
		 */
		public final String MARU = "MARU";

		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt; （{@link #upd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #upd01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #upd01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #upd01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #upd01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #upd01_up5}）<br>
		 * 第7 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #upd01_up6}）<br>
		 * 第8 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR （{@link #upd01_up7}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt; （{@link #upd01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #upd01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #upd01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #upd01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #upd01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #upd01_down5}）<br>
		 * 第7 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #upd01_down6}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> upd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> upd01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> upd01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> upd01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> upd01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> upd01_up5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> upd01_up6;
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR upd01_up7;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> upd01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> upd01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> upd01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> upd01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> upd01_down4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> upd01_down5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> upd01_down6;
		
		// コンストラクタ
		protected MfgActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.class);
			up7 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.class);
			up8 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk01();
			upd01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR>)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR>)chk01.up(2);
			chk01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR>)chk01.up(3);
			chk01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR>)chk01.up(4);
			chk01_up5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR>)chk01.up(5);
			chk01_up6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR>)chk01.up(6);
			chk01_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR>)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR>)chk01.down(2);
			chk01_down3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR>)chk01.down(3);
			chk01_down4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR>)chk01.down(4);
			chk01_down5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR>)chk01.down(5);
			chk01_down6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR>)chk01.down(6);
			upd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR>)upd01.up(0);
			upd01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR>)upd01.up(1);
			upd01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR>)upd01.up(2);
			upd01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR>)upd01.up(3);
			upd01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR>)upd01.up(4);
			upd01_up5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR>)upd01.up(5);
			upd01_up6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR>)upd01.up(6);
			upd01_up7 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR)upd01.up(7);
			upd01_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR>)upd01.down(0);
			upd01_down1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR>)upd01.down(1);
			upd01_down2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR>)upd01.down(2);
			upd01_down3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR>)upd01.down(3);
			upd01_down4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR>)upd01.down(4);
			upd01_down5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR>)upd01.down(5);
			upd01_down6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR>)upd01.down(6);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARC, chk01);
			appendOpe(MARU, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARC<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_up3}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_up4}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_up5}）<br>
		 * up7() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_up6}）<br>
		 * MARU<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt; （{@link #upd01_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #upd01_up1}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #upd01_up2}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #upd01_up3}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #upd01_up4}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #upd01_up5}）<br>
		 * up7() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #upd01_up6}）<br>
		 * up8() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR （{@link #upd01_up7}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARC)) {
				up_MARC(chk01_up0, chk01_up1, chk01_up2, chk01_up3, chk01_up4, chk01_up5, chk01_up6, up1(), up2(), up3(), up4(), up5(), up6(), up7());
			}
			if (key.equals(MARU)) {
				up_MARU(upd01_up0, upd01_up1, upd01_up2, upd01_up3, upd01_up4, upd01_up5, upd01_up6, upd01_up7, up1(), up2(), up3(), up4(), up5(), up6(), up7(), up8());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARC<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt;（{@link #chk01_down2}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt;（{@link #chk01_down3}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt;（{@link #chk01_down4}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt;（{@link #chk01_down5}）=> down5()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt;（{@link #chk01_down6}）=> down6()<br>
		 * MARU<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt;（{@link #upd01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt;（{@link #upd01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt;（{@link #upd01_down2}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt;（{@link #upd01_down3}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt;（{@link #upd01_down4}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt;（{@link #upd01_down5}）=> down5()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt;（{@link #upd01_down6}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARC)) {
				down_MARC(down0(), down1(), down2(), down3(), down4(), down5(), down6(), chk01_down0, chk01_down1, chk01_down2, chk01_down3, chk01_down4, chk01_down5, chk01_down6);
			}
			if (key.equals(MARU)) {
				down_MARU(down0(), down1(), down2(), down3(), down4(), down5(), down6(), upd01_down0, upd01_down1, upd01_down2, upd01_down3, upd01_down4, upd01_down5, upd01_down6);
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
			if (i == 7) return up7();
			if (i == 8) return up8();
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
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
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
		 * MfgActIF_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR createMfgActIF_Upd01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR.create();
		}

		/**
		 * MfgActIF_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR createMfgActIF_Upd01_HdrR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.create();
		}

		/**
		 * MfgActIF_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> createMfgActIF_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR createMfgActIF_Upd01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> createMfgActIF_Upd01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR createMfgActIF_Upd01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> createMfgActIF_Upd01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR createMfgActIF_Upd01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> createMfgActIF_Upd01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR createMfgActIF_Upd01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> createMfgActIF_Upd01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR createMfgActIF_Upd01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> createMfgActIF_Upd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR.class);
		}

		/**
		 * MfgActIF_Upd01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR createMfgActIF_Upd01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.create();
		}

		/**
		 * MfgActIF_Upd01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> createMfgActIF_Upd01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR.class);
		}

		/**
		 * MfgActIF_Upd01_IO_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR createMfgActIF_Upd01_IO_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_md_mfg_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>inpt_rsn_not_comp_flg</td></tr>
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
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> up6() {
			return up6;
		}

		/**
		 * 上り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
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
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> up7() {
			return up7;
		}

		/**
		 * 上り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_io_act_srv_exec_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR up8() {
			return up8;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARC(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest0_6, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> src_MfgActIF_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> src_MfgActIF_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> src_MfgActIF_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> src_MfgActIF_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> src_MfgActIF_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> src_MfgActIF_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> src_MfgActIF_Upd01_DtlByProd){
			up_MARC_chk01_0(dest0_0, src_MfgActIF_Upd01_Hdr);
			up_MARC_chk01_1(dest0_1, src_MfgActIF_Upd01_DtlOper);
			up_MARC_chk01_2(dest0_2, src_MfgActIF_Upd01_DtlInpt);
			up_MARC_chk01_3(dest0_3, src_MfgActIF_Upd01_DtlLoss);
			up_MARC_chk01_4(dest0_4, src_MfgActIF_Upd01_DtlWk);
			up_MARC_chk01_5(dest0_5, src_MfgActIF_Upd01_DtlYield);
			up_MARC_chk01_6(dest0_6, src_MfgActIF_Upd01_DtlByProd);
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_0() {
			MCRowMapper map = new Map_up_MARC_chk01_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_rpt_rmrks", "act_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("act_immed_prnt_flg", "act_immed_prnt_flg");
				addColumnPathMap("not_pd_chk_flg", "not_pd_chk_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARC_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_0();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_1() {
			MCRowMapper map = new Map_up_MARC_chk01_1();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_unit_act_qty", "oper_unit_act_qty");
				addColumnPathMap("oper_yield", "oper_yield");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_act_intr_rmrks", "oper_act_intr_rmrks");
				addColumnPathMap("oper_act_rpt_rmrks", "oper_act_rpt_rmrks");
				addColumnPathMap("oper_act_sub_char1", "oper_act_sub_char1");
				addColumnPathMap("oper_act_sub_char2", "oper_act_sub_char2");
				addColumnPathMap("oper_act_sub_char3", "oper_act_sub_char3");
				addColumnPathMap("bkf_upd_flg", "bkf_upd_flg");
				addColumnPathMap("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("bkf_not_ref_flg", "bkf_not_ref_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MARC_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_2() {
			MCRowMapper map = new Map_up_MARC_chk01_2();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("base_unit_inpt_qty", "base_unit_inpt_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("acxfr_act_qty", "acxfr_act_qty");
				addColumnPathMap("acxfr_act_rsn_cd", "acxfr_act_rsn_cd");
				addColumnPathMap("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("inpt_rsn_cd", "inpt_rsn_cd");
				addColumnPathMap("inpt_rsn_not_comp_flg", "inpt_rsn_not_comp_flg");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
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
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_inpt_act_no", "ext_inpt_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
				addColumnPathMap("is_only_abort_flg", "is_only_abort_flg");
			}
		}

		/**
		 * 連携処理MARC_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_2();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_3() {
			MCRowMapper map = new Map_up_MARC_chk01_3();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
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
		 * 連携処理MARC_chk01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_3();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_4() {
			MCRowMapper map = new Map_up_MARC_chk01_4();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
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
		 * 連携処理MARC_chk01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_4();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_5() {
			MCRowMapper map = new Map_up_MARC_chk01_5();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
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
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_5();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARC_chk01の上りブロック6のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk01_6() {
			MCRowMapper map = new Map_up_MARC_chk01_6();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の上りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
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
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk01の上りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk01_6(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の上りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk01_6(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk01_6();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARU専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARUの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARU(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest0_6, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR dest0_7, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> src_MfgActIF_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> src_MfgActIF_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> src_MfgActIF_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> src_MfgActIF_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> src_MfgActIF_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> src_MfgActIF_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> src_MfgActIF_Upd01_DtlByProd, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR src_MfgActIF_Upd01_IO_Ctrl){
			up_MARU_upd01_0(dest0_0, src_MfgActIF_Upd01_Hdr);
			up_MARU_upd01_1(dest0_1, src_MfgActIF_Upd01_DtlOper);
			up_MARU_upd01_2(dest0_2, src_MfgActIF_Upd01_DtlInpt);
			up_MARU_upd01_3(dest0_3, src_MfgActIF_Upd01_DtlLoss);
			up_MARU_upd01_4(dest0_4, src_MfgActIF_Upd01_DtlWk);
			up_MARU_upd01_5(dest0_5, src_MfgActIF_Upd01_DtlYield);
			up_MARU_upd01_6(dest0_6, src_MfgActIF_Upd01_DtlByProd);
			up_MARU_upd01_7(dest0_7, src_MfgActIF_Upd01_IO_Ctrl);
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_0() {
			MCRowMapper map = new Map_up_MARU_upd01_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("inst_lot_no", "inst_lot_no");
				addColumnPathMap("inst_sublot_no", "inst_sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_dfct_qty", "base_unit_dfct_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_rpt_rmrks", "act_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("act_prnt_flg", "act_prnt_flg");
				addColumnPathMap("act_prnt_tm", "act_prnt_tm");
				addColumnPathMap("prnt_seq", "prnt_seq");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("aprv_flg", "aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_end_act_tm", "old_end_act_tm");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg");
				addColumnPathMap("act_immed_prnt_flg", "act_immed_prnt_flg");
				addColumnPathMap("not_pd_chk_flg", "not_pd_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg");
				addColumnPathMap("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARU_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_0();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_1() {
			MCRowMapper map = new Map_up_MARU_upd01_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_1 extends MCRowMapper {
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
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MARU_upd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_2() {
			MCRowMapper map = new Map_up_MARU_upd01_2();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_2 extends MCRowMapper {
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
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
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
				addColumnPathMap("base_unit_std_qty", "base_unit_std_qty");
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
		 * 連携処理MARU_upd01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_2();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_3() {
			MCRowMapper map = new Map_up_MARU_upd01_3();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_3 extends MCRowMapper {
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
		 * 連携処理MARU_upd01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_3();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_4() {
			MCRowMapper map = new Map_up_MARU_upd01_4();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_4 extends MCRowMapper {
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
		 * 連携処理MARU_upd01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_4();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_5() {
			MCRowMapper map = new Map_up_MARU_upd01_5();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_5 extends MCRowMapper {
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_5();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック6のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_6() {
			MCRowMapper map = new Map_up_MARU_upd01_6();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_6 extends MCRowMapper {
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の上りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd01_6(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の上りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd01_6(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd01_6();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd01の上りブロック7のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd01_7() {
			MCRowMapper map = new Map_up_MARU_upd01_7();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の上りブロック7のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd01_7 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg");
			}
		}

		/**
		 * 連携処理MARU_upd01の上りブロック7のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARU_upd01_7(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR src) {
			createMap_up_MARU_upd01_7().copy(dest, src);
		}

		//-----------------------MARC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARC(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> dest_MfgActIF_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> dest_MfgActIF_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> dest_MfgActIF_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> dest_MfgActIF_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> dest_MfgActIF_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> dest_MfgActIF_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> dest_MfgActIF_Upd01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src0_6){
			down_MARC_chk01_0(dest_MfgActIF_Upd01_Hdr, src0_0);
			down_MARC_chk01_1(dest_MfgActIF_Upd01_DtlOper, src0_1);
			down_MARC_chk01_2(dest_MfgActIF_Upd01_DtlInpt, src0_2);
			down_MARC_chk01_3(dest_MfgActIF_Upd01_DtlLoss, src0_3);
			down_MARC_chk01_4(dest_MfgActIF_Upd01_DtlWk, src0_4);
			down_MARC_chk01_5(dest_MfgActIF_Upd01_DtlYield, src0_5);
			down_MARC_chk01_6(dest_MfgActIF_Upd01_DtlByProd, src0_6);
		}

		/**
		 * 連携処理MARC_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_0() {
			MCRowMapper map = new Map_down_MARC_chk01_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("inst_lot_no", "inst_lot_no");
				addColumnPathMap("inst_sublot_no", "inst_sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_dfct_qty", "base_unit_dfct_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_rpt_rmrks", "act_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("act_prnt_flg", "act_prnt_flg");
				addColumnPathMap("act_prnt_tm", "act_prnt_tm");
				addColumnPathMap("prnt_seq", "prnt_seq");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("aprv_flg", "aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_end_act_tm", "old_end_act_tm");
				addColumnPathMap("mfg_aprv_sts_typ", "mfg_aprv_sts_typ");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg");
				addColumnPathMap("act_immed_prnt_flg", "act_immed_prnt_flg");
				addColumnPathMap("not_pd_chk_flg", "not_pd_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_1() {
			MCRowMapper map = new Map_down_MARC_chk01_1();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_1(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_1(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_2() {
			MCRowMapper map = new Map_down_MARC_chk01_2();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
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
				addColumnPathMap("base_unit_std_qty", "base_unit_std_qty");
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
		 * 連携処理MARC_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_2(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_2(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_3() {
			MCRowMapper map = new Map_down_MARC_chk01_3();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
		 * 連携処理MARC_chk01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_3(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_3(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_4() {
			MCRowMapper map = new Map_down_MARC_chk01_4();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
		 * 連携処理MARC_chk01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_4(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_4(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_5() {
			MCRowMapper map = new Map_down_MARC_chk01_5();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_5(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_5(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック6のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk01_6() {
			MCRowMapper map = new Map_down_MARC_chk01_6();
			return map;
		}

		/**
		 * 連携処理MARC_chk01の下りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk01の下りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk01_6(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MARC_chk01の下りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk01_6(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk01_6();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARU専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARUの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARU(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> dest_MfgActIF_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> dest_MfgActIF_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> dest_MfgActIF_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> dest_MfgActIF_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> dest_MfgActIF_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> dest_MfgActIF_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> dest_MfgActIF_Upd01_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src0_6){
			down_MARU_upd01_0(dest_MfgActIF_Upd01_Hdr, src0_0);
			down_MARU_upd01_1(dest_MfgActIF_Upd01_DtlOper, src0_1);
			down_MARU_upd01_2(dest_MfgActIF_Upd01_DtlInpt, src0_2);
			down_MARU_upd01_3(dest_MfgActIF_Upd01_DtlLoss, src0_3);
			down_MARU_upd01_4(dest_MfgActIF_Upd01_DtlWk, src0_4);
			down_MARU_upd01_5(dest_MfgActIF_Upd01_DtlYield, src0_5);
			down_MARU_upd01_6(dest_MfgActIF_Upd01_DtlByProd, src0_6);
		}

		/**
		 * 連携処理MARU_upd01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_0() {
			MCRowMapper map = new Map_down_MARU_upd01_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ_nm", "mfg_sts_typ_nm");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_1() {
			MCRowMapper map = new Map_down_MARU_upd01_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_1(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_1(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_2() {
			MCRowMapper map = new Map_down_MARU_upd01_2();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_2(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_2(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_3() {
			MCRowMapper map = new Map_down_MARU_upd01_3();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("loss_act_no", "loss_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_3(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_3(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_4() {
			MCRowMapper map = new Map_down_MARU_upd01_4();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_4(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_4(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_5() {
			MCRowMapper map = new Map_down_MARU_upd01_5();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_5(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_5(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック6のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd01_6() {
			MCRowMapper map = new Map_down_MARU_upd01_6();
			return map;
		}

		/**
		 * 連携処理MARU_upd01の下りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd01の下りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd01_6(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MARU_upd01の下りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd01_6(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd01_6();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActIF_Del01オペレーション.<p>
	 *
	 * 製造実績の取消を行う。<br>
	 */
	abstract public class MfgActIF_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> down0;
		
		/**
		 * 連携情報 MARD<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del01 （{@link #del01}）<br>
		 */
		public final String MARD = "MARD";

		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR （{@link #del01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR&gt; （{@link #del01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR&gt; （{@link #del01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR&gt; （{@link #del01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR&gt; （{@link #del01_up4}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR&gt; （{@link #del01_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del01 del01;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR del01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> del01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> del01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> del01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> del01_up4;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> del01_down0;
		
		// コンストラクタ
		protected MfgActIF_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.class);

			// 連携オペレーションの初期化
			del01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Del01();
			
			// 連携オペレーションのコンテナ取得
			del01_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR)del01.up(0);
			del01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR>)del01.up(1);
			del01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR>)del01.up(2);
			del01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR>)del01.up(3);
			del01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR>)del01.up(4);
			del01_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR>)del01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARD, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARD<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR （{@link #del01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR&gt; （{@link #del01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR&gt; （{@link #del01_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR&gt; （{@link #del01_up3}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR&gt; （{@link #del01_up4}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARD)) {
				up_MARD(del01_up0, del01_up1, del01_up2, del01_up3, del01_up4, up0(), up1(), up2(), up3(), up4());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARD<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR&gt;（{@link #del01_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARD)) {
				down_MARD(down0(), del01_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActIF_Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR createMfgActIF_Del01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR.create();
		}

		/**
		 * MfgActIF_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR createMfgActIF_Del01_HdrR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.create();
		}

		/**
		 * MfgActIF_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> createMfgActIF_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR.class);
		}

		/**
		 * MfgActIF_Del01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR createMfgActIF_Del01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR.create();
		}

		/**
		 * MfgActIF_Del01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> createMfgActIF_Del01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR.class);
		}

		/**
		 * MfgActIF_Del01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR createMfgActIF_Del01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR.create();
		}

		/**
		 * MfgActIF_Del01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> createMfgActIF_Del01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR.class);
		}

		/**
		 * MfgActIF_Del01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR createMfgActIF_Del01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR.create();
		}

		/**
		 * MfgActIF_Del01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> createMfgActIF_Del01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> up2() {
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
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> up4() {
			return up4;
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARD専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARDの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARD(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> dest0_4, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR src_MfgActIF_Del01_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> src_MfgActIF_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> src_MfgActIF_Del01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> src_MfgActIF_Del01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> src_MfgActIF_Del01_DtlByProd){
			up_MARD_del01_0(dest0_0, src_MfgActIF_Del01_Ctrl);
			up_MARD_del01_1(dest0_1, src_MfgActIF_Del01_Hdr);
			up_MARD_del01_2(dest0_2, src_MfgActIF_Del01_DtlInpt);
			up_MARD_del01_3(dest0_3, src_MfgActIF_Del01_DtlYield);
			up_MARD_del01_4(dest0_4, src_MfgActIF_Del01_DtlByProd);
		}
		
		/**
		 * 連携処理MARD_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del01_0() {
			MCRowMapper map = new Map_up_MARD_del01_0();
			return map;
		}

		/**
		 * 連携処理MARD_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("lst_del_flg", "lst_del_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("not_commit_flg", "not_commit_flg");
			}
		}

		/**
		 * 連携処理MARD_del01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARD_del01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_CtrlR src) {
			createMap_up_MARD_del01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARD_del01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del01_1() {
			MCRowMapper map = new Map_up_MARD_del01_1();
			return map;
		}

		/**
		 * 連携処理MARD_del01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MARD_del01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARD_del01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR r_src) {
		}

		/**
		 * 連携処理MARD_del01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARD_del01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MARD_del01_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARD_del01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARD_del01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del01_2() {
			MCRowMapper map = new Map_up_MARD_del01_2();
			return map;
		}

		/**
		 * 連携処理MARD_del01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MARD_del01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARD_del01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MARD_del01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARD_del01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MARD_del01_2();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARD_del01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARD_del01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del01_3() {
			MCRowMapper map = new Map_up_MARD_del01_3();
			return map;
		}

		/**
		 * 連携処理MARD_del01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MARD_del01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARD_del01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MARD_del01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARD_del01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MARD_del01_3();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARD_del01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARD_del01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del01_4() {
			MCRowMapper map = new Map_up_MARD_del01_4();
			return map;
		}

		/**
		 * 連携処理MARD_del01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MARD_del01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARD_del01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MARD_del01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARD_del01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MARD_del01_4();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARD_del01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MARD専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARDの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARD(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> dest_MfgActIF_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> src0_0){
			down_MARD_del01_0(dest_MfgActIF_Del01_Hdr, src0_0);
		}

		/**
		 * 連携処理MARD_del01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARD_del01_0() {
			MCRowMapper map = new Map_down_MARD_del01_0();
			return map;
		}

		/**
		 * 連携処理MARD_del01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARD_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MARD_del01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARD_del01_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_src) {
		}

		/**
		 * 連携処理MARD_del01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARD_del01_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> src) {
			MCRowMapper _rm = createMap_down_MARD_del01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Del01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARD_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActIF_Upd02オペレーション.<p>
	 *
	 * 工数実績の登録・訂正を行う。<br>
	 */
	abstract public class MfgActIF_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> down0;
		
		/**
		 * 連携情報 MARC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk04 （{@link #chk04}）<br>
		 */
		public final String MARC = "MARC";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk04}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR （{@link #chk04_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk04_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk04_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk04 chk04;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR chk04_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> chk04_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> chk04_down0;
		/**
		 * 連携情報 MARU<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd03 （{@link #upd03}）<br>
		 */
		public final String MARU = "MARU";

		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR （{@link #upd03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #upd03_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #upd03_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd03 upd03;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR upd03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> upd03_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> upd03_down0;
		
		// コンストラクタ
		protected MfgActIF_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);

			// 連携オペレーションの初期化
			chk04 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk04();
			upd03 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd03();
			
			// 連携オペレーションのコンテナ取得
			chk04_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR)chk04.up(1);
			chk04_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)chk04.up(0);
			chk04_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)chk04.down(0);
			upd03_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR)upd03.up(1);
			upd03_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)upd03.up(0);
			upd03_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)upd03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARC, chk04);
			appendOpe(MARU, upd03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARC<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR （{@link #chk04_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk04_up1}）<br>
		 * MARU<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR （{@link #upd03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #upd03_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARC)) {
				up_MARC(chk04_up0, chk04_up1, up0(), up1());
			}
			if (key.equals(MARU)) {
				up_MARU(upd03_up0, upd03_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARC<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt;（{@link #chk04_down0}）=> down0()<br>
		 * MARU<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt;（{@link #upd03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARC)) {
				down_MARC(down0(), chk04_down0);
			}
			if (key.equals(MARU)) {
				down_MARU(down0(), upd03_down0);
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
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActIF_Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR createMfgActIF_Upd02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR.create();
		}

		/**
		 * MfgActIF_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR createMfgActIF_Upd02_RsltR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.create();
		}

		/**
		 * MfgActIF_Upd02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> createMfgActIF_Upd02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> up1() {
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
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARC(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest0_1, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR src_MfgActIF_Upd02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src_MfgActIF_Upd02_Rslt){
			up_MARC_chk04_0(dest0_0, src_MfgActIF_Upd02_Ctrl);
			up_MARC_chk04_1(dest0_1, src_MfgActIF_Upd02_Rslt);
		}
		
		/**
		 * 連携処理MARC_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk04_0() {
			MCRowMapper map = new Map_up_MARC_chk04_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MARC_chk04の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARC_chk04_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR src) {
			createMap_up_MARC_chk04_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARC_chk04の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk04_1() {
			MCRowMapper map = new Map_up_MARC_chk04_1();
			return map;
		}

		/**
		 * 連携処理MARC_chk04の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk04_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg");
				addColumnPathMap("act_intr_rmrks", "act_intr_rmrks");
				addColumnPathMap("act_sub_char1", "act_sub_char1");
				addColumnPathMap("act_sub_char2", "act_sub_char2");
				addColumnPathMap("act_sub_char3", "act_sub_char3");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk04の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk04_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src) {
		}

		/**
		 * 連携処理MARC_chk04の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk04_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk04_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk04_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARU専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARUの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARU(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest0_1, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR src_MfgActIF_Upd02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src_MfgActIF_Upd02_Rslt){
			up_MARU_upd03_0(dest0_0, src_MfgActIF_Upd02_Ctrl);
			up_MARU_upd03_1(dest0_1, src_MfgActIF_Upd02_Rslt);
		}
		
		/**
		 * 連携処理MARU_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd03_0() {
			MCRowMapper map = new Map_up_MARU_upd03_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("not_commit_flg", "not_commit_flg");
			}
		}

		/**
		 * 連携処理MARU_upd03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARU_upd03_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_CtrlR src) {
			createMap_up_MARU_upd03_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARU_upd03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd03_1() {
			MCRowMapper map = new Map_up_MARU_upd03_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("old_ac_dt", "old_ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_dec_place", "wk_cost_dec_place");
				addColumnPathMap("wk_cost_rnd_typ", "wk_cost_rnd_typ");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_nm", "wk_usr_nm");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("wk_usr_dpt_nm", "wk_usr_dpt_nm");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg");
				addColumnPathMap("act_intr_rmrks", "act_intr_rmrks");
				addColumnPathMap("act_sub_char1", "act_sub_char1");
				addColumnPathMap("act_sub_char2", "act_sub_char2");
				addColumnPathMap("act_sub_char3", "act_sub_char3");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("dpt_wg_cd", "dpt_wg_cd");
				addColumnPathMap("dpt_wg_nm", "dpt_wg_nm");
				addColumnPathMap("loc_wg_cd", "loc_wg_cd");
				addColumnPathMap("loc_wg_nm", "loc_wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd03_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src) {
		}

		/**
		 * 連携処理MARU_upd03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd03_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd03_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MARC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARC(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest_MfgActIF_Upd02_Rslt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src0_0){
			down_MARC_chk04_0(dest_MfgActIF_Upd02_Rslt, src0_0);
		}

		/**
		 * 連携処理MARC_chk04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk04_0() {
			MCRowMapper map = new Map_down_MARC_chk04_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("old_ac_dt", "old_ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_dec_place", "wk_cost_dec_place");
				addColumnPathMap("wk_cost_rnd_typ", "wk_cost_rnd_typ");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_nm", "wk_usr_nm");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("wk_usr_dpt_nm", "wk_usr_dpt_nm");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg");
				addColumnPathMap("act_intr_rmrks", "act_intr_rmrks");
				addColumnPathMap("act_sub_char1", "act_sub_char1");
				addColumnPathMap("act_sub_char2", "act_sub_char2");
				addColumnPathMap("act_sub_char3", "act_sub_char3");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("dpt_wg_cd", "dpt_wg_cd");
				addColumnPathMap("dpt_wg_nm", "dpt_wg_nm");
				addColumnPathMap("loc_wg_cd", "loc_wg_cd");
				addColumnPathMap("loc_wg_nm", "loc_wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MARC_chk04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk04_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src) {
		}

		/**
		 * 連携処理MARC_chk04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk04_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk04_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARU専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARUの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARU(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest_MfgActIF_Upd02_Rslt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src0_0){
			down_MARU_upd03_0(dest_MfgActIF_Upd02_Rslt, src0_0);
		}

		/**
		 * 連携処理MARU_upd03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd03_0() {
			MCRowMapper map = new Map_down_MARU_upd03_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MARU_upd03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd03_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src) {
		}

		/**
		 * 連携処理MARU_upd03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd03_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd03_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActIF_Del02オペレーション.<p>
	 *
	 * 工数実績の取消を行う。<br>
	 */
	abstract public class MfgActIF_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> down0;
		
		/**
		 * 連携情報 MARC<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk05 （{@link #chk05}）<br>
		 */
		public final String MARC = "MARC";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk05}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR （{@link #chk05_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk05_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk05_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk05 chk05;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR chk05_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> chk05_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> chk05_down0;
		/**
		 * 連携情報 MARD<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del02 （{@link #del02}）<br>
		 */
		public final String MARD = "MARD";

		/**
		 * 連携オペレーション del02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR （{@link #del02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #del02_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #del02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Del02 del02;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR del02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> del02_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> del02_down0;
		
		// コンストラクタ
		protected MfgActIF_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);

			// 連携オペレーションの初期化
			chk05 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk05();
			del02 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Del02();
			
			// 連携オペレーションのコンテナ取得
			chk05_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR)chk05.up(1);
			chk05_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)chk05.up(0);
			chk05_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)chk05.down(0);
			del02_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR)del02.up(1);
			del02_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)del02.up(0);
			del02_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR>)del02.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARC, chk05);
			appendOpe(MARD, del02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARC<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR （{@link #chk05_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #chk05_up1}）<br>
		 * MARD<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR （{@link #del02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt; （{@link #del02_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARC)) {
				up_MARC(chk05_up0, chk05_up1, up0(), up1());
			}
			if (key.equals(MARD)) {
				up_MARD(del02_up0, del02_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARC<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt;（{@link #chk05_down0}）=> down0()<br>
		 * MARD<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR&gt;（{@link #del02_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARC)) {
				down_MARC(down0(), chk05_down0);
			}
			if (key.equals(MARD)) {
				down_MARD(down0(), del02_down0);
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
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActIF_Del02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR createMfgActIF_Del02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR.create();
		}

		/**
		 * MfgActIF_Del02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR createMfgActIF_Del02_RsltR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.create();
		}

		/**
		 * MfgActIF_Del02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> createMfgActIF_Del02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> up1() {
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
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARC(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest0_1, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR src_MfgActIF_Del02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src_MfgActIF_Del02_Rslt){
			up_MARC_chk05_0(dest0_0, src_MfgActIF_Del02_Ctrl);
			up_MARC_chk05_1(dest0_1, src_MfgActIF_Del02_Rslt);
		}
		
		/**
		 * 連携処理MARC_chk05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk05_0() {
			MCRowMapper map = new Map_up_MARC_chk05_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MARC_chk05の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARC_chk05_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR src) {
			createMap_up_MARC_chk05_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARC_chk05の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARC_chk05_1() {
			MCRowMapper map = new Map_up_MARC_chk05_1();
			return map;
		}

		/**
		 * 連携処理MARC_chk05の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARC_chk05_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MARC_chk05の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARC_chk05_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src) {
		}

		/**
		 * 連携処理MARC_chk05の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARC_chk05_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src) {
			MCRowMapper _rm = createMap_up_MARC_chk05_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARC_chk05_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARD専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARDの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARD(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest0_1, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR src_MfgActIF_Del02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src_MfgActIF_Del02_Rslt){
			up_MARD_del02_0(dest0_0, src_MfgActIF_Del02_Ctrl);
			up_MARD_del02_1(dest0_1, src_MfgActIF_Del02_Rslt);
		}
		
		/**
		 * 連携処理MARD_del02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del02_0() {
			MCRowMapper map = new Map_up_MARD_del02_0();
			return map;
		}

		/**
		 * 連携処理MARD_del02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("not_commit_flg", "not_commit_flg");
			}
		}

		/**
		 * 連携処理MARD_del02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARD_del02_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Del02_CtrlR src) {
			createMap_up_MARD_del02_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARD_del02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARD_del02_1() {
			MCRowMapper map = new Map_up_MARD_del02_1();
			return map;
		}

		/**
		 * 連携処理MARD_del02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARD_del02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("old_ac_dt", "old_ac_dt");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MARD_del02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARD_del02_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src) {
		}

		/**
		 * 連携処理MARD_del02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARD_del02_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> src) {
			MCRowMapper _rm = createMap_up_MARD_del02_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARD_del02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MARC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARC(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest_MfgActIF_Del02_Rslt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src0_0){
			down_MARC_chk05_0(dest_MfgActIF_Del02_Rslt, src0_0);
		}

		/**
		 * 連携処理MARC_chk05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARC_chk05_0() {
			MCRowMapper map = new Map_down_MARC_chk05_0();
			return map;
		}

		/**
		 * 連携処理MARC_chk05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARC_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inst_wk_act_flg", "inst_wk_act_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("old_ac_dt", "old_ac_dt");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("wk_act_upd_cntr", "wk_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MARC_chk05の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARC_chk05_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src) {
		}

		/**
		 * 連携処理MARC_chk05の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARC_chk05_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src) {
			MCRowMapper _rm = createMap_down_MARC_chk05_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARC_chk05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MARD専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARDの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARD(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest_MfgActIF_Del02_Rslt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src0_0){
			down_MARD_del02_0(dest_MfgActIF_Del02_Rslt, src0_0);
		}

		/**
		 * 連携処理MARD_del02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARD_del02_0() {
			MCRowMapper map = new Map_down_MARD_del02_0();
			return map;
		}

		/**
		 * 連携処理MARD_del02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARD_del02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MARD_del02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARD_del02_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src) {
		}

		/**
		 * 連携処理MARD_del02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARD_del02_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> src) {
			MCRowMapper _rm = createMap_down_MARD_del02_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARD_del02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActIF_Upd03オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正処理<br>
	 */
	abstract public class MfgActIF_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> down2;
		
		/**
		 * 連携情報 MARU<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd02 （{@link #upd02}）<br>
		 */
		public final String MARU = "MARU";

		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR （{@link #upd02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR&gt; （{@link #upd02_up3}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR&gt; （{@link #upd02_down2}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd02 upd02;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR upd02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> upd02_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> upd02_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> upd02_up3;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> upd02_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> upd02_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> upd02_down2;
		
		// コンストラクタ
		protected MfgActIF_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.class);

			// 連携オペレーションの初期化
			upd02 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd02();
			
			// 連携オペレーションのコンテナ取得
			upd02_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR)upd02.up(0);
			upd02_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R>)upd02.up(1);
			upd02_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R>)upd02.up(2);
			upd02_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR>)upd02.up(3);
			upd02_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R>)upd02.down(0);
			upd02_down1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R>)upd02.down(1);
			upd02_down2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR>)upd02.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARU, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARU<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR （{@link #upd02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt; （{@link #upd02_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR&gt; （{@link #upd02_up3}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARU)) {
				up_MARU(upd02_up0, upd02_up1, upd02_up2, upd02_up3, up0(), up1(), up2(), up3());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARU<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt;（{@link #upd02_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R&gt;（{@link #upd02_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR&gt;（{@link #upd02_down2}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARU)) {
				down_MARU(down0(), down1(), down2(), upd02_down0, upd02_down1, upd02_down2);
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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * MfgActIF_Upd03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR createMfgActIF_Upd03_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR.create();
		}

		/**
		 * MfgActIF_Upd03_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R createMfgActIF_Upd03_Hdr1R(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.create();
		}

		/**
		 * MfgActIF_Upd03_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> createMfgActIF_Upd03_Hdr1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R.class);
		}

		/**
		 * MfgActIF_Upd03_Hdr2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActIF_Upd03_Hdr2R(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
		}

		/**
		 * MfgActIF_Upd03_Hdr2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActIF_Upd03_Hdr2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
		}

		/**
		 * MfgActIF_Upd03_DtlYieldByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR createMfgActIF_Upd03_DtlYieldByProdR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.create();
		}

		/**
		 * MfgActIF_Upd03_DtlYieldByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> createMfgActIF_Upd03_DtlYieldByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>not_io_act_srv_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
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
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARU専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARUの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARU(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> dest0_3, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR src_MfgActIF_Upd03_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> src_MfgActIF_Upd03_Hdr1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src_MfgActIF_Upd03_Hdr2, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> src_MfgActIF_Upd03_DtlYieldByProd){
			up_MARU_upd02_0(dest0_0, src_MfgActIF_Upd03_Ctrl);
			up_MARU_upd02_1(dest0_1, src_MfgActIF_Upd03_Hdr1);
			up_MARU_upd02_2(dest0_2, src_MfgActIF_Upd03_Hdr2);
			up_MARU_upd02_3(dest0_3, src_MfgActIF_Upd03_DtlYieldByProd);
		}
		
		/**
		 * 連携処理MARU_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd02_0() {
			MCRowMapper map = new Map_up_MARU_upd02_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_unit_flg", "oper_unit_flg");
				addColumnPathMap("act_immed_prnt_flg", "act_immed_prnt_flg");
				addColumnPathMap("not_bkf_upd_flg", "not_bkf_upd_flg");
				addColumnPathMap("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg");
				addColumnPathMap("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("not_commit_flg", "not_commit_flg");
			}
		}

		/**
		 * 連携処理MARU_upd02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARU_upd02_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_CtrlR src) {
			createMap_up_MARU_upd02_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARU_upd02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd02_1() {
			MCRowMapper map = new Map_up_MARU_upd02_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks");
				addColumnPathMap("mfg_act_intr_rmrks", "mfg_act_intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("oper_unit_act_qty", "oper_unit_act_qty");
				addColumnPathMap("oper_act_intr_rmrks", "oper_act_intr_rmrks");
				addColumnPathMap("oper_act_rpt_rmrks", "oper_act_rpt_rmrks");
				addColumnPathMap("oper_act_sub_char1", "oper_act_sub_char1");
				addColumnPathMap("oper_act_sub_char2", "oper_act_sub_char2");
				addColumnPathMap("oper_act_sub_char3", "oper_act_sub_char3");
				addColumnPathMap("oper_yield", "oper_yield");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MARU_upd02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd02_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R r_src) {
		}

		/**
		 * 連携処理MARU_upd02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd02_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MARU_upd02_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd02_2() {
			MCRowMapper map = new Map_up_MARU_upd02_2();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks");
				addColumnPathMap("mfg_act_intr_rmrks", "mfg_act_intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MARU_upd02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd02_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MARU_upd02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd02_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MARU_upd02_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MARU_upd02の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd02_3() {
			MCRowMapper map = new Map_up_MARU_upd02_3();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd02_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
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
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("yield_act_intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("yield_act_rpt_rmrks", "yield_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
				addColumnPathMap("all_oper_act_reg_flg", "all_oper_act_reg_flg");
			}
		}

		/**
		 * 連携処理MARU_upd02の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd02_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR r_src) {
		}

		/**
		 * 連携処理MARU_upd02の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd02_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd02_3();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd02_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MARU専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARUの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARU(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> dest_MfgActIF_Upd03_Hdr1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest_MfgActIF_Upd03_Hdr2, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> dest_MfgActIF_Upd03_DtlYieldByProd, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> src0_2){
			down_MARU_upd02_0(dest_MfgActIF_Upd03_Hdr1, src0_0);
			down_MARU_upd02_1(dest_MfgActIF_Upd03_Hdr2, src0_1);
			down_MARU_upd02_2(dest_MfgActIF_Upd03_DtlYieldByProd, src0_2);
		}

		/**
		 * 連携処理MARU_upd02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd02_0() {
			MCRowMapper map = new Map_down_MARU_upd02_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ_nm", "mfg_sts_typ_nm");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARU_upd02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd02_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MARU_upd02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd02_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_down_MARU_upd02_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd02_1() {
			MCRowMapper map = new Map_down_MARU_upd02_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ_nm", "mfg_sts_typ_nm");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MARU_upd02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd02_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MARU_upd02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd02_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_down_MARU_upd02_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MARU_upd02の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd02_2() {
			MCRowMapper map = new Map_down_MARU_upd02_2();
			return map;
		}

		/**
		 * 連携処理MARU_upd02の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd02の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd02_2(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_src) {
		}

		/**
		 * 連携処理MARU_upd02の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd02_2(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd02_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd03_DtlYieldByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActIF_Upd04オペレーション.<p>
	 *
	 * 工程（製造）実績の完了処理を行う。<br>
	 */
	abstract public class MfgActIF_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActIF_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> down0;
		
		/**
		 * 連携情報 MARU<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd04 （{@link #upd04}）<br>
		 */
		public final String MARU = "MARU";

		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd04}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR （{@link #upd04_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR&gt; （{@link #upd04_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR&gt; （{@link #upd04_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd04 upd04;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR upd04_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> upd04_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> upd04_down0;
		
		// コンストラクタ
		protected MfgActIF_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.class);

			// 連携オペレーションの初期化
			upd04 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd04();
			
			// 連携オペレーションのコンテナ取得
			upd04_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR)upd04.up(0);
			upd04_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR>)upd04.up(1);
			upd04_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR>)upd04.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MARU, upd04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MARU<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR （{@link #upd04_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR&gt; （{@link #upd04_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MARU)) {
				up_MARU(upd04_up0, upd04_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MARU<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR&gt;（{@link #upd04_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MARU)) {
				down_MARU(down0(), upd04_down0);
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
			invoke((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActIF_Upd04_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR createMfgActIF_Upd04_CtrlR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR.create();
		}

		/**
		 * MfgActIF_Upd04_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR createMfgActIF_Upd04_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.create();
		}

		/**
		 * MfgActIF_Upd04_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> createMfgActIF_Upd04_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRcptIFService)MSBCL_MfgActRcptIFService_MC_A.this).info;
		}

		//-----------------------MARU専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARUの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MARU(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> dest0_1, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR src_MfgActIF_Upd04_Ctrl, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> src_MfgActIF_Upd04_DtlOper){
			up_MARU_upd04_0(dest0_0, src_MfgActIF_Upd04_Ctrl);
			up_MARU_upd04_1(dest0_1, src_MfgActIF_Upd04_DtlOper);
		}
		
		/**
		 * 連携処理MARU_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd04_0() {
			MCRowMapper map = new Map_up_MARU_upd04_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("not_commit_flg", "not_commit_flg");
			}
		}

		/**
		 * 連携処理MARU_upd04の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MARU_upd04_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_CtrlR src) {
			createMap_up_MARU_upd04_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MARU_upd04の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MARU_upd04_1() {
			MCRowMapper map = new Map_up_MARU_upd04_1();
			return map;
		}

		/**
		 * 連携処理MARU_upd04の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MARU_upd04_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
			}
		}

		/**
		 * 連携処理MARU_upd04の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MARU_upd04_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARU_upd04の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MARU_upd04_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MARU_upd04_1();
			for(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MARU_upd04_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MARU専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARUの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MARU(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> dest_MfgActIF_Upd04_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> src0_0){
			down_MARU_upd04_0(dest_MfgActIF_Upd04_DtlOper, src0_0);
		}

		/**
		 * 連携処理MARU_upd04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MARU_upd04_0() {
			MCRowMapper map = new Map_down_MARU_upd04_0();
			return map;
		}

		/**
		 * 連携処理MARU_upd04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MARU_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MARU_upd04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MARU_upd04_0(mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR r_src) {
		}

		/**
		 * 連携処理MARU_upd04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MARU_upd04_0(MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MARU_upd04_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd04_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MARU_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}