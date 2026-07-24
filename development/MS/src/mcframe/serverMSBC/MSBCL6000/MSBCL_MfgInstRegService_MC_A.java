package mcframe.serverMSBC.MSBCL6000;

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
 * "MSBCL_MfgInstRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgInstRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6000";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgInstRegService.MfgInstReg_Chk01 aMfgInstReg_Chk01;

	protected void initMfgInstReg_Chk01() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Chk01_INFO;
		this.aMfgInstReg_Chk01 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Chk01();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Chk01 crtMfgInstReg_Chk01() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Chk01();
		return lgc.aMfgInstReg_Chk01;
	}

	protected void paramMfgInstReg_Chk01(MCParam p) {
		if (this.aMfgInstReg_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Chk01.up0());
		p.addUpBlock(aMfgInstReg_Chk01.up1());
		p.addUpBlock(aMfgInstReg_Chk01.up2());
		p.addUpBlock(aMfgInstReg_Chk01.up3());
		p.addUpBlock(aMfgInstReg_Chk01.up4());
		p.addUpBlock(aMfgInstReg_Chk01.up5());
		p.addUpBlock(aMfgInstReg_Chk01.up6());
		p.addDownBlock(aMfgInstReg_Chk01.down0());
		p.addDownBlock(aMfgInstReg_Chk01.down1());
		p.addDownBlock(aMfgInstReg_Chk01.down2());
		p.addDownBlock(aMfgInstReg_Chk01.down3());
		p.addDownBlock(aMfgInstReg_Chk01.down4());
		p.addDownBlock(aMfgInstReg_Chk01.down5());
		p.addDownBlock(aMfgInstReg_Chk01.down6());
	}

	protected void doMfgInstReg_Chk01() {
		aMfgInstReg_Chk01.call();
	};

	/**
	 * MfgInstReg_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createMfgInstReg_Chk01_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
	}

	/**
	 * MfgInstReg_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> createMfgInstReg_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createMfgInstReg_Chk01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createMfgInstReg_Chk01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createMfgInstReg_Chk01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createMfgInstReg_Chk01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createMfgInstReg_Chk01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createMfgInstReg_Chk01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createMfgInstReg_Chk01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createMfgInstReg_Chk01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createMfgInstReg_Chk01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createMfgInstReg_Chk01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
	}

	/**
	 * MfgInstReg_Chk01_DtlReExtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR createMfgInstReg_Chk01_DtlReExtR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.create();
	}

	/**
	 * MfgInstReg_Chk01_DtlReExtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> createMfgInstReg_Chk01_DtlReExtL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_Chk02 aMfgInstReg_Chk02;

	protected void initMfgInstReg_Chk02() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Chk02_INFO;
		this.aMfgInstReg_Chk02 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Chk02();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Chk02 crtMfgInstReg_Chk02() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Chk02();
		return lgc.aMfgInstReg_Chk02;
	}

	protected void paramMfgInstReg_Chk02(MCParam p) {
		if (this.aMfgInstReg_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Chk02.up0());
		p.addUpBlock(aMfgInstReg_Chk02.up1());
		p.addDownBlock(aMfgInstReg_Chk02.down0());
		p.addDownBlock(aMfgInstReg_Chk02.down1());
		p.addDownBlock(aMfgInstReg_Chk02.down2());
		p.addDownBlock(aMfgInstReg_Chk02.down3());
		p.addDownBlock(aMfgInstReg_Chk02.down4());
		p.addDownBlock(aMfgInstReg_Chk02.down5());
		p.addDownBlock(aMfgInstReg_Chk02.down6());
	}

	protected void doMfgInstReg_Chk02() {
		aMfgInstReg_Chk02.call();
	};

	/**
	 * MfgInstReg_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR createMfgInstReg_Chk02_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.create();
	}

	/**
	 * MfgInstReg_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> createMfgInstReg_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR createMfgInstReg_Chk02_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> createMfgInstReg_Chk02_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR createMfgInstReg_Chk02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> createMfgInstReg_Chk02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR createMfgInstReg_Chk02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> createMfgInstReg_Chk02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR createMfgInstReg_Chk02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> createMfgInstReg_Chk02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR createMfgInstReg_Chk02_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> createMfgInstReg_Chk02_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.class);
	}

	/**
	 * MfgInstReg_Chk02_DtlReExtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR createMfgInstReg_Chk02_DtlReExtR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.create();
	}

	/**
	 * MfgInstReg_Chk02_DtlReExtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> createMfgInstReg_Chk02_DtlReExtL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_Chk03 aMfgInstReg_Chk03;

	protected void initMfgInstReg_Chk03() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Chk03_INFO;
		this.aMfgInstReg_Chk03 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Chk03();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Chk03 crtMfgInstReg_Chk03() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Chk03();
		return lgc.aMfgInstReg_Chk03;
	}

	protected void paramMfgInstReg_Chk03(MCParam p) {
		if (this.aMfgInstReg_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Chk03.up0());
		p.addUpBlock(aMfgInstReg_Chk03.up1());
		p.addUpBlock(aMfgInstReg_Chk03.up2());
		p.addDownBlock(aMfgInstReg_Chk03.down0());
		p.addDownBlock(aMfgInstReg_Chk03.down1());
	}

	protected void doMfgInstReg_Chk03() {
		aMfgInstReg_Chk03.call();
	};

	/**
	 * MfgInstReg_Chk03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR createMfgInstReg_Chk03_CtrlR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR.create();
	}

	/**
	 * MfgInstReg_Chk03_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R createMfgInstReg_Chk03_Hdr1R(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.create();
	}

	/**
	 * MfgInstReg_Chk03_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> createMfgInstReg_Chk03_Hdr1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.class);
	}

	/**
	 * MfgInstReg_Chk03_Hdr2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R createMfgInstReg_Chk03_Hdr2R(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.create();
	}

	/**
	 * MfgInstReg_Chk03_Hdr2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> createMfgInstReg_Chk03_Hdr2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_Upd01 aMfgInstReg_Upd01;

	protected void initMfgInstReg_Upd01() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Upd01_INFO;
		this.aMfgInstReg_Upd01 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Upd01();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Upd01 crtMfgInstReg_Upd01() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Upd01();
		return lgc.aMfgInstReg_Upd01;
	}

	protected void paramMfgInstReg_Upd01(MCParam p) {
		if (this.aMfgInstReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Upd01.up0());
		p.addUpBlock(aMfgInstReg_Upd01.up1());
		p.addUpBlock(aMfgInstReg_Upd01.up2());
		p.addUpBlock(aMfgInstReg_Upd01.up3());
		p.addUpBlock(aMfgInstReg_Upd01.up4());
		p.addUpBlock(aMfgInstReg_Upd01.up5());
		p.addUpBlock(aMfgInstReg_Upd01.up6());
		p.addDownBlock(aMfgInstReg_Upd01.down0());
		p.addDownBlock(aMfgInstReg_Upd01.down1());
		p.addDownBlock(aMfgInstReg_Upd01.down2());
		p.addDownBlock(aMfgInstReg_Upd01.down3());
		p.addDownBlock(aMfgInstReg_Upd01.down4());
		p.addDownBlock(aMfgInstReg_Upd01.down5());
	}

	protected void doMfgInstReg_Upd01() {
		aMfgInstReg_Upd01.call();
	};

	/**
	 * MfgInstReg_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR createMfgInstReg_Upd01_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.create();
	}

	/**
	 * MfgInstReg_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> createMfgInstReg_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR createMfgInstReg_Upd01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> createMfgInstReg_Upd01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR createMfgInstReg_Upd01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> createMfgInstReg_Upd01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR createMfgInstReg_Upd01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> createMfgInstReg_Upd01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR createMfgInstReg_Upd01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> createMfgInstReg_Upd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR createMfgInstReg_Upd01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> createMfgInstReg_Upd01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.class);
	}

	/**
	 * MfgInstReg_Upd01_DtlReExtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR createMfgInstReg_Upd01_DtlReExtR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR.create();
	}

	/**
	 * MfgInstReg_Upd01_DtlReExtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> createMfgInstReg_Upd01_DtlReExtL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_Upd02 aMfgInstReg_Upd02;

	protected void initMfgInstReg_Upd02() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Upd02_INFO;
		this.aMfgInstReg_Upd02 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Upd02();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Upd02 crtMfgInstReg_Upd02() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Upd02();
		return lgc.aMfgInstReg_Upd02;
	}

	protected void paramMfgInstReg_Upd02(MCParam p) {
		if (this.aMfgInstReg_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Upd02.up0());
		p.addUpBlock(aMfgInstReg_Upd02.up1());
		p.addUpBlock(aMfgInstReg_Upd02.up2());
		p.addDownBlock(aMfgInstReg_Upd02.down0());
		p.addDownBlock(aMfgInstReg_Upd02.down1());
	}

	protected void doMfgInstReg_Upd02() {
		aMfgInstReg_Upd02.call();
	};

	/**
	 * MfgInstReg_Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR createMfgInstReg_Upd02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR.create();
	}

	/**
	 * MfgInstReg_Upd02_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R createMfgInstReg_Upd02_Hdr1R(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.create();
	}

	/**
	 * MfgInstReg_Upd02_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> createMfgInstReg_Upd02_Hdr1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
	}

	/**
	 * MfgInstReg_Upd02_Hdr2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R createMfgInstReg_Upd02_Hdr2R(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.create();
	}

	/**
	 * MfgInstReg_Upd02_Hdr2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> createMfgInstReg_Upd02_Hdr2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
	}

	/**
	 * MfgInstReg_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createMfgInstReg_Upd02_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
	}

	/**
	 * MfgInstReg_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> createMfgInstReg_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
	}

	/**
	 * MfgInstReg_Upd02_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createMfgInstReg_Upd02_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
	}

	/**
	 * MfgInstReg_Upd02_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createMfgInstReg_Upd02_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
	}

	/**
	 * MfgInstReg_Upd02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createMfgInstReg_Upd02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
	}

	/**
	 * MfgInstReg_Upd02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createMfgInstReg_Upd02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
	}

	/**
	 * MfgInstReg_Upd02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createMfgInstReg_Upd02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
	}

	/**
	 * MfgInstReg_Upd02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createMfgInstReg_Upd02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
	}

	/**
	 * MfgInstReg_Upd02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createMfgInstReg_Upd02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
	}

	/**
	 * MfgInstReg_Upd02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createMfgInstReg_Upd02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
	}

	/**
	 * MfgInstReg_Upd02_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createMfgInstReg_Upd02_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
	}

	/**
	 * MfgInstReg_Upd02_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createMfgInstReg_Upd02_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_Del01 aMfgInstReg_Del01;

	protected void initMfgInstReg_Del01() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_Del01_INFO;
		this.aMfgInstReg_Del01 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_Del01();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_Del01 crtMfgInstReg_Del01() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_Del01();
		return lgc.aMfgInstReg_Del01;
	}

	protected void paramMfgInstReg_Del01(MCParam p) {
		if (this.aMfgInstReg_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_Del01.up0());
		p.addUpBlock(aMfgInstReg_Del01.up1());
		p.addUpBlock(aMfgInstReg_Del01.up2());
		p.addDownBlock(aMfgInstReg_Del01.down0());
	}

	protected void doMfgInstReg_Del01() {
		aMfgInstReg_Del01.call();
	};

	/**
	 * MfgInstReg_Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR createMfgInstReg_Del01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR.create();
	}

	/**
	 * MfgInstReg_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR createMfgInstReg_Del01_HdrR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.create();
	}

	/**
	 * MfgInstReg_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> createMfgInstReg_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.class);
	}

	/**
	 * MfgInstReg_Del01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR createMfgInstReg_Del01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR.create();
	}

	/**
	 * MfgInstReg_Del01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> createMfgInstReg_Del01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR.class);
	}
	protected MSBCL_MfgInstRegService.MfgInstReg_RevUpd01 aMfgInstReg_RevUpd01;

	protected void initMfgInstReg_RevUpd01() {
		this.info = PDef.MS_MSBCL6000_MfgInstReg_RevUpd01_INFO;
		this.aMfgInstReg_RevUpd01 = ((MSBCL_MfgInstRegService)this).new MfgInstReg_RevUpd01();
	}

	public static MSBCL_MfgInstRegService.MfgInstReg_RevUpd01 crtMfgInstReg_RevUpd01() {
		MSBCL_MfgInstRegService lgc = new MSBCL_MfgInstRegService();
		lgc.initMfgInstReg_RevUpd01();
		return lgc.aMfgInstReg_RevUpd01;
	}

	protected void paramMfgInstReg_RevUpd01(MCParam p) {
		if (this.aMfgInstReg_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstReg_RevUpd01.up0());
	}

	protected void doMfgInstReg_RevUpd01() {
		aMfgInstReg_RevUpd01.call();
	};

	/**
	 * MfgInstReg_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createMfgInstReg_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * MfgInstReg_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createMfgInstReg_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgInstReg_Chk01オペレーション.<p>
	 *
	 * 製造指図の登録・訂正・取消前チェックの共通処理<br>
	 */
	abstract public class MfgInstReg_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> up0;
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
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> down0;
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
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> down6;
		
		
		// コンストラクタ
		protected MfgInstReg_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);

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
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
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
		 * MfgInstReg_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createMfgInstReg_Chk01_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
		}

		/**
		 * MfgInstReg_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> createMfgInstReg_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createMfgInstReg_Chk01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createMfgInstReg_Chk01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createMfgInstReg_Chk01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createMfgInstReg_Chk01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createMfgInstReg_Chk01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createMfgInstReg_Chk01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createMfgInstReg_Chk01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createMfgInstReg_Chk01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createMfgInstReg_Chk01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createMfgInstReg_Chk01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
		}

		/**
		 * MfgInstReg_Chk01_DtlReExtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR createMfgInstReg_Chk01_DtlReExtR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.create();
		}

		/**
		 * MfgInstReg_Chk01_DtlReExtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> createMfgInstReg_Chk01_DtlReExtL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>chg_list_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_reg_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_dt_from_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
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
		 * 	<tr><td><br></td><td>mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
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
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>chg_list_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>frst_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_ord_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>inst_rec_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>no_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_reg_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
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
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_err_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
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
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstReg_Chk02オペレーション.<p>
	 *
	 * 製造指図の取消前チェックの共通処理<br>
	 */
	abstract public class MfgInstReg_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> down6;
		/** [MfgInstReg_Chk02_DtlByProd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> aMfgInstReg_Chk02_DtlByProd;
		/** [MfgInstReg_Chk02_DtlInpt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> aMfgInstReg_Chk02_DtlInpt;
		/** [MfgInstReg_Chk02_DtlReExt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> aMfgInstReg_Chk02_DtlReExt;
		/** [MfgInstReg_Chk02_DtlWk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> aMfgInstReg_Chk02_DtlWk;
		/** [MfgInstReg_Chk02_DtlYield]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> aMfgInstReg_Chk02_DtlYield;
		
		/**
		 * 連携情報 MIR<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk01 （{@link #chk01}）<br>
		 */
		public final String MIR = "MIR";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR&gt; （{@link #chk01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR&gt; （{@link #chk01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR&gt; （{@link #chk01_up5}）<br>
		 * 第7 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR&gt; （{@link #chk01_up6}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR&gt; （{@link #chk01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR&gt; （{@link #chk01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR&gt; （{@link #chk01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR&gt; （{@link #chk01_down5}）<br>
		 * 第7 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR&gt; （{@link #chk01_down6}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> chk01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> chk01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> chk01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> chk01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> chk01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> chk01_up5;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> chk01_up6;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> chk01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> chk01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> chk01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> chk01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> chk01_down4;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> chk01_down5;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> chk01_down6;
		
		// コンストラクタ
		protected MfgInstReg_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.class);
			aMfgInstReg_Chk02_DtlByProd = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.class);
			aMfgInstReg_Chk02_DtlInpt = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.class);
			aMfgInstReg_Chk02_DtlReExt = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.class);
			aMfgInstReg_Chk02_DtlWk = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.class);
			aMfgInstReg_Chk02_DtlYield = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.crtMfgInstReg_Chk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR>)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR>)chk01.up(2);
			chk01_up3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR>)chk01.up(3);
			chk01_up4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR>)chk01.up(4);
			chk01_up5 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR>)chk01.up(5);
			chk01_up6 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR>)chk01.up(6);
			chk01_down0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR>)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR>)chk01.down(2);
			chk01_down3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR>)chk01.down(3);
			chk01_down4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR>)chk01.down(4);
			chk01_down5 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR>)chk01.down(5);
			chk01_down6 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR>)chk01.down(6);

			// オペレーション、オペレーショングループの登録
			appendOpe(MIR, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MIR<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * aMfgInstReg_Chk02_DtlInpt => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * aMfgInstReg_Chk02_DtlWk => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR&gt; （{@link #chk01_up3}）<br>
		 * aMfgInstReg_Chk02_DtlYield => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR&gt; （{@link #chk01_up4}）<br>
		 * aMfgInstReg_Chk02_DtlByProd => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR&gt; （{@link #chk01_up5}）<br>
		 * aMfgInstReg_Chk02_DtlReExt => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR&gt; （{@link #chk01_up6}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MIR)) {
				up_MIR(chk01_up0, chk01_up1, chk01_up2, chk01_up3, chk01_up4, chk01_up5, chk01_up6, up0(), up1(), aMfgInstReg_Chk02_DtlInpt, aMfgInstReg_Chk02_DtlWk, aMfgInstReg_Chk02_DtlYield, aMfgInstReg_Chk02_DtlByProd, aMfgInstReg_Chk02_DtlReExt);
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MIR<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR&gt;（{@link #chk01_down2}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR&gt;（{@link #chk01_down3}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR&gt;（{@link #chk01_down4}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR&gt;（{@link #chk01_down5}）=> down5()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR&gt;（{@link #chk01_down6}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MIR)) {
				down_MIR(down0(), down1(), down2(), down3(), down4(), down5(), down6(), chk01_down0, chk01_down1, chk01_down2, chk01_down3, chk01_down4, chk01_down5, chk01_down6);
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
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
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
		 * MfgInstReg_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR createMfgInstReg_Chk02_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.create();
		}

		/**
		 * MfgInstReg_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> createMfgInstReg_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR createMfgInstReg_Chk02_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> createMfgInstReg_Chk02_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR createMfgInstReg_Chk02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> createMfgInstReg_Chk02_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR createMfgInstReg_Chk02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> createMfgInstReg_Chk02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR createMfgInstReg_Chk02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> createMfgInstReg_Chk02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR createMfgInstReg_Chk02_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> createMfgInstReg_Chk02_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR.class);
		}

		/**
		 * MfgInstReg_Chk02_DtlReExtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR createMfgInstReg_Chk02_DtlReExtR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.create();
		}

		/**
		 * MfgInstReg_Chk02_DtlReExtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> createMfgInstReg_Chk02_DtlReExtL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> up0() {
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
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>frst_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>old_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> down6() {
			return down6;
		}


		/**
		 * [MfgInstReg_Chk02_DtlByProd]ブロックのコンテナaMfgInstReg_Chk02_DtlByProdLを返します。
		 *
		 * @return MfgInstReg_Chk02_DtlByProdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> MfgInstReg_Chk02_DtlByProd() {
			return aMfgInstReg_Chk02_DtlByProd;
		}

		/**
		 * [MfgInstReg_Chk02_DtlInpt]ブロックのコンテナaMfgInstReg_Chk02_DtlInptLを返します。
		 *
		 * @return MfgInstReg_Chk02_DtlInptL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> MfgInstReg_Chk02_DtlInpt() {
			return aMfgInstReg_Chk02_DtlInpt;
		}

		/**
		 * [MfgInstReg_Chk02_DtlReExt]ブロックのコンテナaMfgInstReg_Chk02_DtlReExtLを返します。
		 *
		 * @return MfgInstReg_Chk02_DtlReExtL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> MfgInstReg_Chk02_DtlReExt() {
			return aMfgInstReg_Chk02_DtlReExt;
		}

		/**
		 * [MfgInstReg_Chk02_DtlWk]ブロックのコンテナaMfgInstReg_Chk02_DtlWkLを返します。
		 *
		 * @return MfgInstReg_Chk02_DtlWkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> MfgInstReg_Chk02_DtlWk() {
			return aMfgInstReg_Chk02_DtlWk;
		}

		/**
		 * [MfgInstReg_Chk02_DtlYield]ブロックのコンテナaMfgInstReg_Chk02_DtlYieldLを返します。
		 *
		 * @return MfgInstReg_Chk02_DtlYieldL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> MfgInstReg_Chk02_DtlYield() {
			return aMfgInstReg_Chk02_DtlYield;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}

		//-----------------------MIR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMIRの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MIR(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> dest0_6, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> src_MfgInstReg_Chk02_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> src_MfgInstReg_Chk02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> src_MfgInstReg_Chk02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> src_MfgInstReg_Chk02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> src_MfgInstReg_Chk02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> src_MfgInstReg_Chk02_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> src_MfgInstReg_Chk02_DtlReExt){
			up_MIR_chk01_0(dest0_0, src_MfgInstReg_Chk02_Hdr);
			up_MIR_chk01_1(dest0_1, src_MfgInstReg_Chk02_DtlOper);
			up_MIR_chk01_2(dest0_2, src_MfgInstReg_Chk02_DtlInpt);
			up_MIR_chk01_3(dest0_3, src_MfgInstReg_Chk02_DtlWk);
			up_MIR_chk01_4(dest0_4, src_MfgInstReg_Chk02_DtlYield);
			up_MIR_chk01_5(dest0_5, src_MfgInstReg_Chk02_DtlByProd);
			up_MIR_chk01_6(dest0_6, src_MfgInstReg_Chk02_DtlReExt);
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_0() {
			MCRowMapper map = new Map_up_MIR_chk01_0();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("itm_ord_upd_cntr", "itm_ord_upd_cntr");
				addColumnPathMap("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_1() {
			MCRowMapper map = new Map_up_MIR_chk01_1();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("mes_flg", "mes_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_2() {
			MCRowMapper map = new Map_up_MIR_chk01_2();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_3() {
			MCRowMapper map = new Map_up_MIR_chk01_3();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_4() {
			MCRowMapper map = new Map_up_MIR_chk01_4();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_5() {
			MCRowMapper map = new Map_up_MIR_chk01_5();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_5(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_5(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_5();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR_chk01の上りブロック6のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR_chk01_6() {
			MCRowMapper map = new Map_up_MIR_chk01_6();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の上りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理MIR_chk01の上りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR_chk01_6(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の上りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR_chk01_6(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> src) {
			MCRowMapper _rm = createMap_up_MIR_chk01_6();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MIR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMIRの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MIR(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> dest_MfgInstReg_Chk02_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> dest_MfgInstReg_Chk02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> dest_MfgInstReg_Chk02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> dest_MfgInstReg_Chk02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> dest_MfgInstReg_Chk02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> dest_MfgInstReg_Chk02_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> dest_MfgInstReg_Chk02_DtlReExt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> src0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src0_4, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src0_5, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> src0_6){
			down_MIR_chk01_0(dest_MfgInstReg_Chk02_Hdr, src0_0);
			down_MIR_chk01_1(dest_MfgInstReg_Chk02_DtlOper, src0_1);
			down_MIR_chk01_2(dest_MfgInstReg_Chk02_DtlInpt, src0_2);
			down_MIR_chk01_3(dest_MfgInstReg_Chk02_DtlWk, src0_3);
			down_MIR_chk01_4(dest_MfgInstReg_Chk02_DtlYield, src0_4);
			down_MIR_chk01_5(dest_MfgInstReg_Chk02_DtlByProd, src0_5);
			down_MIR_chk01_6(dest_MfgInstReg_Chk02_DtlReExt, src0_6);
		}

		/**
		 * 連携処理MIR_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_0() {
			MCRowMapper map = new Map_down_MIR_chk01_0();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("mfg_inst_data_crud_typ", "mfg_inst_data_crud_typ");
				addColumnPathMap("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("frst_mfg_inst_no", "frst_mfg_inst_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("base_unit_not_inst_qty", "base_unit_not_inst_qty");
				addColumnPathMap("mfg_loc_wg_cd", "mfg_loc_wg_cd");
				addColumnPathMap("mfg_loc_site_cd", "mfg_loc_site_cd");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("po_schd_src_typ", "po_schd_src_typ");
				addColumnPathMap("po_schd_src_no", "po_schd_src_no");
				addColumnPathMap("po_schd_data_crud_typ", "po_schd_data_crud_typ");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_aprv_flg", "old_aprv_flg");
				addColumnPathMap("old_mfg_aprv_role_cd", "old_mfg_aprv_role_cd");
				addColumnPathMap("old_inst_dt", "old_inst_dt");
				addColumnPathMap("old_bom_ptn", "old_bom_ptn");
				addColumnPathMap("itm_ord_upd_cntr", "itm_ord_upd_cntr");
				addColumnPathMap("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_1() {
			MCRowMapper map = new Map_down_MIR_chk01_1();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("not_oper_schd_qty", "not_oper_schd_qty");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("mes_flg", "mes_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_2() {
			MCRowMapper map = new Map_down_MIR_chk01_2();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_2 extends MCRowMapper {
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
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("old_ver_no", "old_ver_no");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("xfr_inst_err_flg", "xfr_inst_err_flg");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_3() {
			MCRowMapper map = new Map_down_MIR_chk01_3();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_4() {
			MCRowMapper map = new Map_down_MIR_chk01_4();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("schd_tm", "schd_tm");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("trd_unit_yield_qty", "trd_unit_yield_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_5() {
			MCRowMapper map = new Map_down_MIR_chk01_5();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_5 extends MCRowMapper {
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
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("old_itm_cd", "old_itm_cd");
				addColumnPathMap("old_itm_sub1", "old_itm_sub1");
				addColumnPathMap("old_itm_sub2", "old_itm_sub2");
				addColumnPathMap("old_itm_sub3", "old_itm_sub3");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_5(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_5(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_5();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック6のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR_chk01_6() {
			MCRowMapper map = new Map_down_MIR_chk01_6();
			return map;
		}

		/**
		 * 連携処理MIR_chk01の下りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("ref_ord", "ref_ord");
			}
		}

		/**
		 * 連携処理MIR_chk01の下りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR_chk01_6(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_src) {
		}

		/**
		 * 連携処理MIR_chk01の下りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR_chk01_6(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR> src) {
			MCRowMapper _rm = createMap_down_MIR_chk01_6();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlReExtR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlReExtR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgInstReg_Chk03オペレーション.<p>
	 *
	 * 製造指図の一括登録・訂正前チェックの共通処理<br>
	 */
	abstract public class MfgInstReg_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> down1;
		
		
		// コンストラクタ
		protected MfgInstReg_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * MfgInstReg_Chk03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR createMfgInstReg_Chk03_CtrlR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR.create();
		}

		/**
		 * MfgInstReg_Chk03_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R createMfgInstReg_Chk03_Hdr1R(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.create();
		}

		/**
		 * MfgInstReg_Chk03_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> createMfgInstReg_Chk03_Hdr1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R.class);
		}

		/**
		 * MfgInstReg_Chk03_Hdr2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R createMfgInstReg_Chk03_Hdr2R(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.create();
		}

		/**
		 * MfgInstReg_Chk03_Hdr2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> createMfgInstReg_Chk03_Hdr2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> up2() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> down0() {
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
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstReg_Upd01オペレーション.<p>
	 *
	 * 製造指図の登録・訂正・取消の共通処理<br>
	 */
	abstract public class MfgInstReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> down5;
		
		/**
		 * 連携情報 MIT<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01 （{@link #mitUpd01}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd02 （{@link #mitUpd02}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03 （{@link #mitUpd03}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 （{@link #mitUpd04}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd05 （{@link #mitUpd05}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd06 （{@link #mitUpd06}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07 （{@link #mitUpd07}）<br>
		 */
		public final String MIT = "MIT";

		/**
		 * 連携オペレーション mitUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR&gt; （{@link #mitUpd01_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01 mitUpd01;
		/**
		 * 連携オペレーション mitUpd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR&gt; （{@link #mitUpd02_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd02 mitUpd02;
		/**
		 * 連携オペレーション mitUpd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR&gt; （{@link #mitUpd03_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03 mitUpd03;
		/**
		 * 連携オペレーション mitUpd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR&gt; （{@link #mitUpd04_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 mitUpd04;
		/**
		 * 連携オペレーション mitUpd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd05}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR&gt; （{@link #mitUpd05_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd05 mitUpd05;
		/**
		 * 連携オペレーション mitUpd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd06}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR&gt; （{@link #mitUpd06_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd06 mitUpd06;
		/**
		 * 連携オペレーション mitUpd07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR&gt; （{@link #mitUpd07_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07 mitUpd07;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> mitUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> mitUpd02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> mitUpd03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> mitUpd04_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> mitUpd05_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> mitUpd06_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> mitUpd07_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 REH<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6140.MSBCL_ReExtHstService.ReExtHst_Upd01 （{@link #rehUpd01}）<br>
		 */
		public final String REH = "REH";

		/**
		 * 連携オペレーション rehUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6140.MSBCL_ReExtHstService.ReExtHst_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR&gt; （{@link #rehUpd01_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6140.MSBCL_ReExtHstService.ReExtHst_Upd01 rehUpd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> rehUpd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MfgInstReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.class);

			// 連携オペレーションの初期化
			mitUpd01 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd01();
			mitUpd02 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd02();
			mitUpd03 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd03();
			mitUpd04 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd04();
			mitUpd05 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd05();
			mitUpd06 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd06();
			mitUpd07 = mcframe.serverMSBC.MSBCL6010.MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd07();
			rehUpd01 = mcframe.serverMSBC.MSBCL6140.MSBCL_ReExtHstService.crtReExtHst_Upd01();
			
			// 連携オペレーションのコンテナ取得
			mitUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR>)mitUpd01.up(0);
			mitUpd02_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR>)mitUpd02.up(0);
			mitUpd03_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR>)mitUpd03.up(0);
			mitUpd04_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR>)mitUpd04.up(0);
			mitUpd05_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR>)mitUpd05.up(0);
			mitUpd06_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR>)mitUpd06.up(0);
			mitUpd07_up0 = (MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR>)mitUpd07.up(0);
			rehUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR>)rehUpd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MIT, mitUpd01);
			appendOpe(MIT, mitUpd02);
			appendOpe(MIT, mitUpd03);
			appendOpe(MIT, mitUpd04);
			appendOpe(MIT, mitUpd05);
			appendOpe(MIT, mitUpd06);
			appendOpe(MIT, mitUpd07);
			appendOpe(REH, rehUpd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MIT<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR&gt; （{@link #mitUpd01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR&gt; （{@link #mitUpd02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR&gt; （{@link #mitUpd03_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR&gt; （{@link #mitUpd04_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR&gt; （{@link #mitUpd05_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR&gt; （{@link #mitUpd06_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR&gt; （{@link #mitUpd07_up0}）<br>
		 * REH<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR&gt; （{@link #rehUpd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MIT)) {
				up_MIT(mitUpd01_up0, mitUpd02_up0, mitUpd03_up0, mitUpd04_up0, mitUpd05_up0, mitUpd06_up0, mitUpd07_up0, up0(), up1(), up4(), up2(), up3(), up5());
			}
			if (key.equals(REH)) {
				up_REH(rehUpd01_up0, up6());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MIT<br>
		 * （下りブロック定義なし）<br>
		 * REH<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MIT)) {
				down_MIT();
			}
			if (key.equals(REH)) {
				down_REH();
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
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
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
		 * MfgInstReg_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR createMfgInstReg_Upd01_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.create();
		}

		/**
		 * MfgInstReg_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> createMfgInstReg_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR createMfgInstReg_Upd01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> createMfgInstReg_Upd01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR createMfgInstReg_Upd01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> createMfgInstReg_Upd01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR createMfgInstReg_Upd01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> createMfgInstReg_Upd01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR createMfgInstReg_Upd01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> createMfgInstReg_Upd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR createMfgInstReg_Upd01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> createMfgInstReg_Upd01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR.class);
		}

		/**
		 * MfgInstReg_Upd01_DtlReExtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR createMfgInstReg_Upd01_DtlReExtR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR.create();
		}

		/**
		 * MfgInstReg_Upd01_DtlReExtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> createMfgInstReg_Upd01_DtlReExtL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
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
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>chg_list_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>frst_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_ord_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>inst_rec_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>no_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_reg_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>re_alloc_mode_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
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
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> up1() {
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
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_err_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> up2() {
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
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_tm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> up4() {
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
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
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> up5() {
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
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> up6() {
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
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> down2() {
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
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> down3() {
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
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> down4() {
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
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}

		//-----------------------MIT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMITの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MIT(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> dest1_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> dest2_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> dest3_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> dest4_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> dest5_0, MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> dest6_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> src_MfgInstReg_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src_MfgInstReg_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src_MfgInstReg_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src_MfgInstReg_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src_MfgInstReg_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src_MfgInstReg_Upd01_DtlByProd){
			up_MIT_mitUpd01_0(dest0_0, src_MfgInstReg_Upd01_Hdr);
			up_MIT_mitUpd02_0(dest1_0, src_MfgInstReg_Upd01_Hdr);
			up_MIT_mitUpd03_0(dest2_0, src_MfgInstReg_Upd01_DtlOper);
			up_MIT_mitUpd04_0(dest3_0, src_MfgInstReg_Upd01_DtlYield);
			up_MIT_mitUpd05_0(dest4_0, src_MfgInstReg_Upd01_DtlInpt);
			up_MIT_mitUpd06_0(dest5_0, src_MfgInstReg_Upd01_DtlWk);
			up_MIT_mitUpd07_0(dest6_0, src_MfgInstReg_Upd01_DtlByProd);
		}
		
		/**
		 * 連携処理MIT_mitUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd01_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd01_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "mfg_inst_data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("base_unit_inst_qty", "base_unit_inst_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("inst_dt", "inst_dt");
				addColumnPathMap("inst_usr_cd", "inst_usr_cd");
				addColumnPathMap("inst_dpt_cd", "inst_dpt_cd");
				addColumnPathMap("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm");
				addColumnPathMap("st_schd_tm", "st_schd_tm");
				addColumnPathMap("end_schd_tm", "end_schd_tm");
				addColumnPathMap("po_locked_flg", "po_locked_flg");
				addColumnPathMap("abort_flg", "inst_abort_flg");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_po_cnt_rmrks", "inst_po_cnt_rmrks");
				addColumnPathMap("disp_pd", "disp_pd");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_rev", "mfg_inst_rev");
				addColumnPathMap("inst_prnt_tm", "inst_prnt_tm");
				addColumnPathMap("inst_prnt_flg", "inst_prnt_flg");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("schd_chg_flg", "schd_chg_flg");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("po_auto_reg_flg", "po_auto_reg_flg");
				addColumnPathMap("sub_char1", "mfg_inst_sub_char1");
				addColumnPathMap("sub_char2", "mfg_inst_sub_char2");
				addColumnPathMap("sub_char3", "mfg_inst_sub_char3");
				addColumnPathMap("aprv_flg", "aprv_flg");
				addColumnPathMap("mfg_aprv_sts_typ", "mfg_aprv_sts_typ");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("aprv_dt", "aprv_dt");
				addColumnPathMap("aprv_dpt_cd", "aprv_dpt_cd");
				addColumnPathMap("aprv_usr_cd", "aprv_usr_cd");
				addColumnPathMap("aprv_tm", "aprv_tm");
				addColumnPathMap("aprv_rsn", "aprv_rsn");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd01_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd01_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd02_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd02_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "itm_mfg_inst_data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("master_dt", "master_dt");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("base_unit_inst_qty", "base_unit_inst_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("frst_mfg_inst_no", "frst_mfg_inst_no");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("unschd_act_flg", "unschd_act_flg");
				addColumnPathMap("wg_cd", "mfg_loc_wg_cd");
				addColumnPathMap("site_cd", "mfg_loc_site_cd");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("sub_char1", "itm_mfg_inst_sub_char1");
				addColumnPathMap("sub_char2", "itm_mfg_inst_sub_char2");
				addColumnPathMap("sub_char3", "itm_mfg_inst_sub_char3");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd02_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd02_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd02_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd03_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd03_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
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
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("unschd_act_flg", "unschd_act_flg");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("not_header_inst_abort_flg", "not_header_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd03_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd03_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd03_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd04_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd04_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
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
				addColumnPathMap("mfg_loc_site_cd", "mfg_loc_site_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_aprv_sts_typ", "mfg_aprv_sts_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("not_header_inst_abort_flg", "not_header_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd04_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd04_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd04_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd05_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd05_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
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
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("inst_dt", "inst_dt");
				addColumnPathMap("inst_usr_cd", "inst_usr_cd");
				addColumnPathMap("inst_dpt_cd", "inst_dpt_cd");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("not_header_inst_abort_flg", "not_header_inst_abort_flg");
				addColumnPathMap("set_stk_str_ln_flg", "set_stk_str_ln_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd05_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd05_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd05_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd06_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd06_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
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
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("not_header_inst_abort_flg", "not_header_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd06_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd06_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd06_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIT_mitUpd07の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIT_mitUpd07_0() {
			MCRowMapper map = new Map_up_MIT_mitUpd07_0();
			return map;
		}

		/**
		 * 連携処理MIT_mitUpd07の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIT_mitUpd07_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
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
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("hdr_mfg_sts_typ", "hdr_mfg_sts_typ");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("not_frst_inst_can_flg", "not_frst_inst_can_flg");
				addColumnPathMap("not_header_inst_abort_flg", "not_header_inst_abort_flg");
			}
		}

		/**
		 * 連携処理MIT_mitUpd07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIT_mitUpd07_0(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MIT_mitUpd07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIT_mitUpd07_0(MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MIT_mitUpd07_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIT_mitUpd07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------REH専用up関連メソッド--------------------------
		/**
		 * オペレーショングループREHの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_REH(MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> src_MfgInstReg_Upd01_DtlReExt){
			up_REH_rehUpd01_0(dest0_0, src_MfgInstReg_Upd01_DtlReExt);
		}
		
		/**
		 * 連携処理REH_rehUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_REH_rehUpd01_0() {
			MCRowMapper map = new Map_up_REH_rehUpd01_0();
			return map;
		}

		/**
		 * 連携処理REH_rehUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_REH_rehUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
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
		 * 連携処理REH_rehUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_REH_rehUpd01_0(mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR r_src) {
		}

		/**
		 * 連携処理REH_rehUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_REH_rehUpd01_0(MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR> src) {
			MCRowMapper _rm = createMap_up_REH_rehUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlReExtR r_src : src){
				mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_REH_rehUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MIT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMITの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MIT(){
		}
		//-----------------------REH専用down関連メソッド--------------------------

		/**
		 * オペレーショングループREHの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_REH(){
		}
	}
	/**
	 * MfgInstReg_Upd02オペレーション.<p>
	 *
	 */
	abstract public class MfgInstReg_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> down1;
		/** [MfgInstReg_Upd02_DtlByProd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> aMfgInstReg_Upd02_DtlByProd;
		/** [MfgInstReg_Upd02_DtlInpt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> aMfgInstReg_Upd02_DtlInpt;
		/** [MfgInstReg_Upd02_DtlOper]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> aMfgInstReg_Upd02_DtlOper;
		/** [MfgInstReg_Upd02_DtlWk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> aMfgInstReg_Upd02_DtlWk;
		/** [MfgInstReg_Upd02_DtlYield]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> aMfgInstReg_Upd02_DtlYield;
		/** [MfgInstReg_Upd02_Hdr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> aMfgInstReg_Upd02_Hdr;
		
		/**
		 * 連携情報 MIR1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01 （{@link #mirUpd01}）<br>
		 */
		public final String MIR1 = "MIR1";

		/**
		 * 連携オペレーション mirUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR&gt; （{@link #mirUpd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #mirUpd01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #mirUpd01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #mirUpd01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #mirUpd01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #mirUpd01_up5}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #mirUpd01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #mirUpd01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #mirUpd01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #mirUpd01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #mirUpd01_down4}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Upd01 mirUpd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> mirUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> mirUpd01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> mirUpd01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> mirUpd01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> mirUpd01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> mirUpd01_up5;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> mirUpd01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> mirUpd01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> mirUpd01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> mirUpd01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> mirUpd01_down4;
		/**
		 * 連携情報 MIR2<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk03 （{@link #mirChk03}）<br>
		 */
		public final String MIR2 = "MIR2";

		/**
		 * 連携オペレーション mirChk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR （{@link #mirChk03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R&gt; （{@link #mirChk03_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R&gt; （{@link #mirChk03_up2}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk03 mirChk03;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR mirChk03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> mirChk03_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> mirChk03_up2;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MfgInstReg_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
			aMfgInstReg_Upd02_DtlByProd = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
			aMfgInstReg_Upd02_DtlInpt = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
			aMfgInstReg_Upd02_DtlOper = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
			aMfgInstReg_Upd02_DtlWk = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
			aMfgInstReg_Upd02_DtlYield = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
			aMfgInstReg_Upd02_Hdr = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);

			// 連携オペレーションの初期化
			mirUpd01 = mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			mirChk03 = mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.crtMfgInstReg_Chk03();
			
			// 連携オペレーションのコンテナ取得
			mirUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR>)mirUpd01.up(0);
			mirUpd01_up1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR>)mirUpd01.up(1);
			mirUpd01_up2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR>)mirUpd01.up(2);
			mirUpd01_up3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR>)mirUpd01.up(3);
			mirUpd01_up4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR>)mirUpd01.up(4);
			mirUpd01_up5 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR>)mirUpd01.up(5);
			mirUpd01_down0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR>)mirUpd01.down(1);
			mirUpd01_down1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR>)mirUpd01.down(2);
			mirUpd01_down2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR>)mirUpd01.down(3);
			mirUpd01_down3 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR>)mirUpd01.down(4);
			mirUpd01_down4 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR>)mirUpd01.down(5);
			mirChk03_up0 = (mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR)mirChk03.up(0);
			mirChk03_up1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R>)mirChk03.up(1);
			mirChk03_up2 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R>)mirChk03.up(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(MIR1, mirUpd01);
			appendOpe(MIR2, mirChk03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MIR1<br>
		 * aMfgInstReg_Upd02_Hdr => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR&gt; （{@link #mirUpd01_up0}）<br>
		 * aMfgInstReg_Upd02_DtlOper => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt; （{@link #mirUpd01_up1}）<br>
		 * aMfgInstReg_Upd02_DtlInpt => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt; （{@link #mirUpd01_up2}）<br>
		 * aMfgInstReg_Upd02_DtlWk => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt; （{@link #mirUpd01_up3}）<br>
		 * aMfgInstReg_Upd02_DtlYield => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt; （{@link #mirUpd01_up4}）<br>
		 * aMfgInstReg_Upd02_DtlByProd => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt; （{@link #mirUpd01_up5}）<br>
		 * MIR2<br>
		 * up0() => mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR （{@link #mirChk03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R&gt; （{@link #mirChk03_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R&gt; （{@link #mirChk03_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MIR1)) {
				up_MIR1(mirUpd01_up0, mirUpd01_up1, mirUpd01_up2, mirUpd01_up3, mirUpd01_up4, mirUpd01_up5, aMfgInstReg_Upd02_Hdr, aMfgInstReg_Upd02_DtlOper, aMfgInstReg_Upd02_DtlInpt, aMfgInstReg_Upd02_DtlWk, aMfgInstReg_Upd02_DtlYield, aMfgInstReg_Upd02_DtlByProd);
			}
			if (key.equals(MIR2)) {
				up_MIR2(mirChk03_up0, mirChk03_up1, mirChk03_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MIR1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR&gt;（{@link #mirUpd01_down0}）=> aMfgInstReg_Upd02_DtlOper<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR&gt;（{@link #mirUpd01_down1}）=> aMfgInstReg_Upd02_DtlInpt<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR&gt;（{@link #mirUpd01_down2}）=> aMfgInstReg_Upd02_DtlWk<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR&gt;（{@link #mirUpd01_down3}）=> aMfgInstReg_Upd02_DtlYield<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR&gt;（{@link #mirUpd01_down4}）=> aMfgInstReg_Upd02_DtlByProd<br>
		 * MIR2<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MIR1)) {
				down_MIR1(aMfgInstReg_Upd02_DtlOper, aMfgInstReg_Upd02_DtlInpt, aMfgInstReg_Upd02_DtlWk, aMfgInstReg_Upd02_DtlYield, aMfgInstReg_Upd02_DtlByProd, mirUpd01_down0, mirUpd01_down1, mirUpd01_down2, mirUpd01_down3, mirUpd01_down4);
			}
			if (key.equals(MIR2)) {
				down_MIR2();
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * MfgInstReg_Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR createMfgInstReg_Upd02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR.create();
		}

		/**
		 * MfgInstReg_Upd02_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R createMfgInstReg_Upd02_Hdr1R(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.create();
		}

		/**
		 * MfgInstReg_Upd02_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> createMfgInstReg_Upd02_Hdr1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
		}

		/**
		 * MfgInstReg_Upd02_Hdr2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R createMfgInstReg_Upd02_Hdr2R(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.create();
		}

		/**
		 * MfgInstReg_Upd02_Hdr2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> createMfgInstReg_Upd02_Hdr2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R.class);
		}

		/**
		 * MfgInstReg_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR createMfgInstReg_Upd02_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.create();
		}

		/**
		 * MfgInstReg_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> createMfgInstReg_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR.class);
		}

		/**
		 * MfgInstReg_Upd02_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR createMfgInstReg_Upd02_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.create();
		}

		/**
		 * MfgInstReg_Upd02_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> createMfgInstReg_Upd02_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR.class);
		}

		/**
		 * MfgInstReg_Upd02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR createMfgInstReg_Upd02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.create();
		}

		/**
		 * MfgInstReg_Upd02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> createMfgInstReg_Upd02_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR.class);
		}

		/**
		 * MfgInstReg_Upd02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR createMfgInstReg_Upd02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.create();
		}

		/**
		 * MfgInstReg_Upd02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> createMfgInstReg_Upd02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR.class);
		}

		/**
		 * MfgInstReg_Upd02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR createMfgInstReg_Upd02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.create();
		}

		/**
		 * MfgInstReg_Upd02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> createMfgInstReg_Upd02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR.class);
		}

		/**
		 * MfgInstReg_Upd02_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR createMfgInstReg_Upd02_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.create();
		}

		/**
		 * MfgInstReg_Upd02_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> createMfgInstReg_Upd02_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>re_alloc_mode_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_locked_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>disp_pd</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> up1() {
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
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
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
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_locked_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>disp_pd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>inst_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> up2() {
			return up2;
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
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> down0() {
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
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> down1() {
			return down1;
		}


		/**
		 * [MfgInstReg_Upd02_DtlByProd]ブロックのコンテナaMfgInstReg_Upd02_DtlByProdLを返します。
		 *
		 * @return MfgInstReg_Upd02_DtlByProdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> MfgInstReg_Upd02_DtlByProd() {
			return aMfgInstReg_Upd02_DtlByProd;
		}

		/**
		 * [MfgInstReg_Upd02_DtlInpt]ブロックのコンテナaMfgInstReg_Upd02_DtlInptLを返します。
		 *
		 * @return MfgInstReg_Upd02_DtlInptL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> MfgInstReg_Upd02_DtlInpt() {
			return aMfgInstReg_Upd02_DtlInpt;
		}

		/**
		 * [MfgInstReg_Upd02_DtlOper]ブロックのコンテナaMfgInstReg_Upd02_DtlOperLを返します。
		 *
		 * @return MfgInstReg_Upd02_DtlOperL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> MfgInstReg_Upd02_DtlOper() {
			return aMfgInstReg_Upd02_DtlOper;
		}

		/**
		 * [MfgInstReg_Upd02_DtlWk]ブロックのコンテナaMfgInstReg_Upd02_DtlWkLを返します。
		 *
		 * @return MfgInstReg_Upd02_DtlWkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> MfgInstReg_Upd02_DtlWk() {
			return aMfgInstReg_Upd02_DtlWk;
		}

		/**
		 * [MfgInstReg_Upd02_DtlYield]ブロックのコンテナaMfgInstReg_Upd02_DtlYieldLを返します。
		 *
		 * @return MfgInstReg_Upd02_DtlYieldL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> MfgInstReg_Upd02_DtlYield() {
			return aMfgInstReg_Upd02_DtlYield;
		}

		/**
		 * [MfgInstReg_Upd02_Hdr]ブロックのコンテナaMfgInstReg_Upd02_HdrLを返します。
		 *
		 * @return MfgInstReg_Upd02_HdrL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> MfgInstReg_Upd02_Hdr() {
			return aMfgInstReg_Upd02_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}

		//-----------------------MIR1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMIR1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MIR1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> src_MfgInstReg_Upd02_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src_MfgInstReg_Upd02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src_MfgInstReg_Upd02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src_MfgInstReg_Upd02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src_MfgInstReg_Upd02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src_MfgInstReg_Upd02_DtlByProd){
			up_MIR1_mirUpd01_0(dest0_0, src_MfgInstReg_Upd02_Hdr);
			up_MIR1_mirUpd01_1(dest0_1, src_MfgInstReg_Upd02_DtlOper);
			up_MIR1_mirUpd01_2(dest0_2, src_MfgInstReg_Upd02_DtlInpt);
			up_MIR1_mirUpd01_3(dest0_3, src_MfgInstReg_Upd02_DtlWk);
			up_MIR1_mirUpd01_4(dest0_4, src_MfgInstReg_Upd02_DtlYield);
			up_MIR1_mirUpd01_5(dest0_5, src_MfgInstReg_Upd02_DtlByProd);
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_0() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_0();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("mfg_inst_data_crud_typ", "mfg_inst_data_crud_typ");
				addColumnPathMap("itm_mfg_inst_data_crud_typ", "itm_mfg_inst_data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("master_dt", "master_dt");
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
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_issue_typ", "lot_issue_typ");
				addColumnPathMap("base_unit_inst_qty", "base_unit_inst_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("inst_dt", "inst_dt");
				addColumnPathMap("inst_usr_cd", "inst_usr_cd");
				addColumnPathMap("inst_dpt_cd", "inst_dpt_cd");
				addColumnPathMap("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm");
				addColumnPathMap("st_schd_tm", "st_schd_tm");
				addColumnPathMap("end_schd_tm", "end_schd_tm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("po_locked_flg", "po_locked_flg");
				addColumnPathMap("inst_abort_flg", "inst_abort_flg");
				addColumnPathMap("inst_rpt_rmrks", "inst_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("inst_po_cnt_rmrks", "inst_po_cnt_rmrks");
				addColumnPathMap("disp_pd", "disp_pd");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_rev", "mfg_inst_rev");
				addColumnPathMap("inst_prnt_tm", "inst_prnt_tm");
				addColumnPathMap("inst_prnt_flg", "inst_prnt_flg");
				addColumnPathMap("inst_immed_prnt_flg", "inst_immed_prnt_flg");
				addColumnPathMap("chg_list_immed_prnt_flg", "chg_list_immed_prnt_flg");
				addColumnPathMap("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("frst_mfg_inst_no", "frst_mfg_inst_no");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("unschd_inst_flg", "unschd_inst_flg");
				addColumnPathMap("unschd_act_flg", "unschd_act_flg");
				addColumnPathMap("schd_chg_flg", "schd_chg_flg");
				addColumnPathMap("base_unit_ord_qty", "base_unit_ord_qty");
				addColumnPathMap("base_unit_not_inst_qty", "base_unit_not_inst_qty");
				addColumnPathMap("ord_abort_flg", "ord_abort_flg");
				addColumnPathMap("mfg_loc_wg_cd", "mfg_loc_wg_cd");
				addColumnPathMap("mfg_loc_site_cd", "mfg_loc_site_cd");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("inst_rec_issue_flg", "inst_rec_issue_flg");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("po_auto_reg_flg", "po_auto_reg_flg");
				addColumnPathMap("po_schd_src_typ", "po_schd_src_typ");
				addColumnPathMap("po_schd_src_no", "po_schd_src_no");
				addColumnPathMap("po_schd_data_crud_typ", "po_schd_data_crud_typ");
				addColumnPathMap("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1");
				addColumnPathMap("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2");
				addColumnPathMap("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3");
				addColumnPathMap("mfg_inst_sub_char1", "mfg_inst_sub_char1");
				addColumnPathMap("mfg_inst_sub_char2", "mfg_inst_sub_char2");
				addColumnPathMap("mfg_inst_sub_char3", "mfg_inst_sub_char3");
				addColumnPathMap("no_mfg_aprv_flg", "no_mfg_aprv_flg");
				addColumnPathMap("old_mfg_sts_typ", "old_mfg_sts_typ");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_aprv_flg", "old_aprv_flg");
				addColumnPathMap("old_mfg_aprv_role_cd", "old_mfg_aprv_role_cd");
				addColumnPathMap("old_inst_dt", "old_inst_dt");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("old_bom_ptn", "old_bom_ptn");
				addColumnPathMap("old_inst_abort_flg", "old_inst_abort_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("not_frst_inst_reg_oper_flg", "not_frst_inst_reg_oper_flg");
				addColumnPathMap("old_mfg_inst_rev", "old_mfg_inst_rev");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_1() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_1();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_1 extends MCRowMapper {
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
		 * 連携処理MIR1_mirUpd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_2() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_2();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_2 extends MCRowMapper {
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
		 * 連携処理MIR1_mirUpd01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_3() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_3();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_3 extends MCRowMapper {
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
		 * 連携処理MIR1_mirUpd01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_4() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_4();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_4 extends MCRowMapper {
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
		 * 連携処理MIR1_mirUpd01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR1_mirUpd01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR1_mirUpd01_5() {
			MCRowMapper map = new Map_up_MIR1_mirUpd01_5();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR1_mirUpd01_5 extends MCRowMapper {
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
		 * 連携処理MIR1_mirUpd01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR1_mirUpd01_5(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR1_mirUpd01_5(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MIR1_mirUpd01_5();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR1_mirUpd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MIR2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMIR2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MIR2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> dest0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> dest0_2, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR src_MfgInstReg_Upd02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> src_MfgInstReg_Upd02_Hdr1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> src_MfgInstReg_Upd02_Hdr2){
			up_MIR2_mirChk03_0(dest0_0, src_MfgInstReg_Upd02_Ctrl);
			up_MIR2_mirChk03_1(dest0_1, src_MfgInstReg_Upd02_Hdr1);
			up_MIR2_mirChk03_2(dest0_2, src_MfgInstReg_Upd02_Hdr2);
		}
		
		/**
		 * 連携処理MIR2_mirChk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR2_mirChk03_0() {
			MCRowMapper map = new Map_up_MIR2_mirChk03_0();
			return map;
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR2_mirChk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_unit_flg", "oper_unit_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
			}
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MIR2_mirChk03_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_CtrlR dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_CtrlR src) {
			createMap_up_MIR2_mirChk03_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MIR2_mirChk03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR2_mirChk03_1() {
			MCRowMapper map = new Map_up_MIR2_mirChk03_1();
			return map;
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR2_mirChk03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("base_unit_inst_qty", "base_unit_inst_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("oper_base_unit_qty", "oper_base_unit_qty");
				addColumnPathMap("st_schd_tm", "st_schd_tm");
				addColumnPathMap("end_schd_tm", "end_schd_tm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("itm_ord_upd_cntr", "itm_ord_upd_cntr");
				addColumnPathMap("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
			}
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR2_mirChk03_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR2_mirChk03_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MIR2_mirChk03_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR2_mirChk03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MIR2_mirChk03の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MIR2_mirChk03_2() {
			MCRowMapper map = new Map_up_MIR2_mirChk03_2();
			return map;
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MIR2_mirChk03_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("base_unit_inst_qty", "base_unit_inst_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("st_schd_tm", "st_schd_tm");
				addColumnPathMap("end_schd_tm", "end_schd_tm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("itm_ord_upd_cntr", "itm_ord_upd_cntr");
				addColumnPathMap("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
			}
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MIR2_mirChk03_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MIR2_mirChk03の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MIR2_mirChk03_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MIR2_mirChk03_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk03_Hdr2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MIR2_mirChk03_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MIR1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMIR1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MIR1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest_MfgInstReg_Upd02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest_MfgInstReg_Upd02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest_MfgInstReg_Upd02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest_MfgInstReg_Upd02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest_MfgInstReg_Upd02_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src0_2, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src0_3, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src0_4){
			down_MIR1_mirUpd01_0(dest_MfgInstReg_Upd02_DtlOper, src0_0);
			down_MIR1_mirUpd01_1(dest_MfgInstReg_Upd02_DtlInpt, src0_1);
			down_MIR1_mirUpd01_2(dest_MfgInstReg_Upd02_DtlWk, src0_2);
			down_MIR1_mirUpd01_3(dest_MfgInstReg_Upd02_DtlYield, src0_3);
			down_MIR1_mirUpd01_4(dest_MfgInstReg_Upd02_DtlByProd, src0_4);
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR1_mirUpd01_0() {
			MCRowMapper map = new Map_down_MIR1_mirUpd01_0();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR1_mirUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR1_mirUpd01_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR1_mirUpd01_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MIR1_mirUpd01_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR1_mirUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR1_mirUpd01_1() {
			MCRowMapper map = new Map_down_MIR1_mirUpd01_1();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR1_mirUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR1_mirUpd01_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR1_mirUpd01_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MIR1_mirUpd01_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR1_mirUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR1_mirUpd01_2() {
			MCRowMapper map = new Map_down_MIR1_mirUpd01_2();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR1_mirUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wk_schd_no", "wk_schd_no");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR1_mirUpd01_2(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR1_mirUpd01_2(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MIR1_mirUpd01_2();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR1_mirUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR1_mirUpd01_3() {
			MCRowMapper map = new Map_down_MIR1_mirUpd01_3();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR1_mirUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR1_mirUpd01_3(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR1_mirUpd01_3(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MIR1_mirUpd01_3();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR1_mirUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MIR1_mirUpd01_4() {
			MCRowMapper map = new Map_down_MIR1_mirUpd01_4();
			return map;
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MIR1_mirUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
			}
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MIR1_mirUpd01_4(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MIR1_mirUpd01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MIR1_mirUpd01_4(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MIR1_mirUpd01_4();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MIR1_mirUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MIR2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMIR2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MIR2(){
		}
	}
	/**
	 * MfgInstReg_Del01オペレーション.<p>
	 *
	 * 製造指図の取消の共通処理<br>
	 */
	abstract public class MfgInstReg_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> down0;
		
		/**
		 * 連携情報 MI<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk02 （{@link #miChk02}）<br>
		 */
		public final String MI = "MI";

		/**
		 * 連携オペレーション miChk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR&gt; （{@link #miChk02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR&gt; （{@link #miChk02_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR&gt; （{@link #miChk02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.MfgInstReg_Chk02 miChk02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> miChk02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> miChk02_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> miChk02_down0;
		
		// コンストラクタ
		protected MfgInstReg_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.class);

			// 連携オペレーションの初期化
			miChk02 = mcframe.serverMSBC.MSBCL6000.MSBCL_MfgInstRegService.crtMfgInstReg_Chk02();
			
			// 連携オペレーションのコンテナ取得
			miChk02_up0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR>)miChk02.up(0);
			miChk02_up1 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR>)miChk02.up(1);
			miChk02_down0 = (MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR>)miChk02.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MI, miChk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MI<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR&gt; （{@link #miChk02_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR&gt; （{@link #miChk02_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MI)) {
				up_MI(miChk02_up0, miChk02_up1, up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MI<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR&gt;（{@link #miChk02_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MI)) {
				down_MI(down0(), miChk02_down0);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstReg_Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR createMfgInstReg_Del01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR.create();
		}

		/**
		 * MfgInstReg_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR createMfgInstReg_Del01_HdrR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.create();
		}

		/**
		 * MfgInstReg_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> createMfgInstReg_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR.class);
		}

		/**
		 * MfgInstReg_Del01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR createMfgInstReg_Del01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR.create();
		}

		/**
		 * MfgInstReg_Del01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> createMfgInstReg_Del01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>not_chk_cntr_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_del_enable_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> up2() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}

		//-----------------------MI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MI(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> src_MfgInstReg_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> src_MfgInstReg_Del01_DtlOper){
			up_MI_miChk02_0(dest0_0, src_MfgInstReg_Del01_Hdr);
			up_MI_miChk02_1(dest0_1, src_MfgInstReg_Del01_DtlOper);
		}
		
		/**
		 * 連携処理MI_miChk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miChk02_0() {
			MCRowMapper map = new Map_up_MI_miChk02_0();
			return map;
		}

		/**
		 * 連携処理MI_miChk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miChk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("itm_ord_upd_cntr", "itm_ord_upd_cntr");
				addColumnPathMap("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg");
			}
		}

		/**
		 * 連携処理MI_miChk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miChk02_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR r_src) {
		}

		/**
		 * 連携処理MI_miChk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miChk02_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MI_miChk02_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miChk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MI_miChk02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MI_miChk02_1() {
			MCRowMapper map = new Map_up_MI_miChk02_1();
			return map;
		}

		/**
		 * 連携処理MI_miChk02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MI_miChk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("mes_flg", "mes_flg");
			}
		}

		/**
		 * 連携処理MI_miChk02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MI_miChk02_1(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MI_miChk02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MI_miChk02_1(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MI_miChk02_1();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MI_miChk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MI(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> dest_MfgInstReg_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> src0_0){
			down_MI_miChk02_0(dest_MfgInstReg_Del01_Hdr, src0_0);
		}

		/**
		 * 連携処理MI_miChk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MI_miChk02_0() {
			MCRowMapper map = new Map_down_MI_miChk02_0();
			return map;
		}

		/**
		 * 連携処理MI_miChk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MI_miChk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MI_miChk02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MI_miChk02_0(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR r_dest, mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_src) {
		}

		/**
		 * 連携処理MI_miChk02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MI_miChk02_0(MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR> src) {
			MCRowMapper _rm = createMap_down_MI_miChk02_0();
			for(mcframe.serverMSBC.MSBCL6000.MfgInstReg_Chk02_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6000.MfgInstReg_Del01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MI_miChk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgInstReg_RevUpd01オペレーション.<p>
	 *
	 * 製造指図改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class MfgInstReg_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstReg_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgInstReg_RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstReg_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createMfgInstReg_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * MfgInstReg_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createMfgInstReg_RevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstRegService)MSBCL_MfgInstRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}