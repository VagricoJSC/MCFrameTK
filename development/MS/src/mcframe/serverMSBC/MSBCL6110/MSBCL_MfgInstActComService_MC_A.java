package mcframe.serverMSBC.MSBCL6110;

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
 * "MSBCL_MfgInstActComService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgInstActComService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 aMfgInstActCom_Sprt01;

	protected void initMfgInstActCom_Sprt01() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Sprt01_INFO;
		this.aMfgInstActCom_Sprt01 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Sprt01();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 crtMfgInstActCom_Sprt01() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Sprt01();
		return lgc.aMfgInstActCom_Sprt01;
	}

	protected void paramMfgInstActCom_Sprt01(MCParam p) {
		if (this.aMfgInstActCom_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Sprt01.up0());
		p.addUpBlock(aMfgInstActCom_Sprt01.up1());
		p.addDownBlock(aMfgInstActCom_Sprt01.down0());
	}

	protected void doMfgInstActCom_Sprt01() {
		aMfgInstActCom_Sprt01.call();
	};

	/**
	 * MfgInstActCom_Sprt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createMfgInstActCom_Sprt01_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
	}

	/**
	 * MfgInstActCom_Sprt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createMfgInstActCom_Sprt01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
	}

	/**
	 * MfgInstActCom_Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createMfgInstActCom_Sprt01_DtlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
	}

	/**
	 * MfgInstActCom_Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createMfgInstActCom_Sprt01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Chk01 aMfgInstActCom_Chk01;

	protected void initMfgInstActCom_Chk01() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Chk01_INFO;
		this.aMfgInstActCom_Chk01 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Chk01();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Chk01 crtMfgInstActCom_Chk01() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Chk01();
		return lgc.aMfgInstActCom_Chk01;
	}

	protected void paramMfgInstActCom_Chk01(MCParam p) {
		if (this.aMfgInstActCom_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Chk01.up0());
		p.addUpBlock(aMfgInstActCom_Chk01.up1());
		p.addDownBlock(aMfgInstActCom_Chk01.down0());
	}

	protected void doMfgInstActCom_Chk01() {
		aMfgInstActCom_Chk01.call();
	};

	/**
	 * MfgInstActCom_Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR createMfgInstActCom_Chk01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
	}

	/**
	 * MfgInstActCom_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR createMfgInstActCom_Chk01_DtlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.create();
	}

	/**
	 * MfgInstActCom_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> createMfgInstActCom_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd01 aMfgInstActCom_Upd01;

	protected void initMfgInstActCom_Upd01() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd01_INFO;
		this.aMfgInstActCom_Upd01 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd01();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd01 crtMfgInstActCom_Upd01() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd01();
		return lgc.aMfgInstActCom_Upd01;
	}

	protected void paramMfgInstActCom_Upd01(MCParam p) {
		if (this.aMfgInstActCom_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd01.up0());
		p.addUpBlock(aMfgInstActCom_Upd01.up1());
		p.addDownBlock(aMfgInstActCom_Upd01.down0());
	}

	protected void doMfgInstActCom_Upd01() {
		aMfgInstActCom_Upd01.call();
	};

	/**
	 * MfgInstActCom_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR createMfgInstActCom_Upd01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
	}

	/**
	 * MfgInstActCom_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR createMfgInstActCom_Upd01_DtlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.create();
	}

	/**
	 * MfgInstActCom_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> createMfgInstActCom_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd02 aMfgInstActCom_Upd02;

	protected void initMfgInstActCom_Upd02() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd02_INFO;
		this.aMfgInstActCom_Upd02 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd02();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd02 crtMfgInstActCom_Upd02() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd02();
		return lgc.aMfgInstActCom_Upd02;
	}

	protected void paramMfgInstActCom_Upd02(MCParam p) {
		if (this.aMfgInstActCom_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd02.up0());
	}

	protected void doMfgInstActCom_Upd02() {
		aMfgInstActCom_Upd02.call();
	};

	/**
	 * MfgInstActCom_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR createMfgInstActCom_Upd02_CndR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR.create();
	}

	/**
	 * MfgInstActCom_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR> createMfgInstActCom_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR.class);
	}

	/**
	 * MfgInstActCom_Upd02_InptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR createMfgInstActCom_Upd02_InptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR.create();
	}

	/**
	 * MfgInstActCom_Upd02_InptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR> createMfgInstActCom_Upd02_InptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR.class);
	}

	/**
	 * MfgInstActCom_Upd02_YieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR createMfgInstActCom_Upd02_YieldR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR.create();
	}

	/**
	 * MfgInstActCom_Upd02_YieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR> createMfgInstActCom_Upd02_YieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd03 aMfgInstActCom_Upd03;

	protected void initMfgInstActCom_Upd03() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd03_INFO;
		this.aMfgInstActCom_Upd03 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd03();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd03 crtMfgInstActCom_Upd03() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd03();
		return lgc.aMfgInstActCom_Upd03;
	}

	protected void paramMfgInstActCom_Upd03(MCParam p) {
		if (this.aMfgInstActCom_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd03.up0());
	}

	protected void doMfgInstActCom_Upd03() {
		aMfgInstActCom_Upd03.call();
	};

	/**
	 * MfgInstActCom_Upd03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR createMfgInstActCom_Upd03_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR.create();
	}

	/**
	 * MfgInstActCom_Upd03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR> createMfgInstActCom_Upd03_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd04 aMfgInstActCom_Upd04;

	protected void initMfgInstActCom_Upd04() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd04_INFO;
		this.aMfgInstActCom_Upd04 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd04();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd04 crtMfgInstActCom_Upd04() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd04();
		return lgc.aMfgInstActCom_Upd04;
	}

	protected void paramMfgInstActCom_Upd04(MCParam p) {
		if (this.aMfgInstActCom_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd04.up0());
		p.addUpBlock(aMfgInstActCom_Upd04.up1());
	}

	protected void doMfgInstActCom_Upd04() {
		aMfgInstActCom_Upd04.call();
	};

	/**
	 * MfgInstActCom_Upd04_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR createMfgInstActCom_Upd04_CtrlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR.create();
	}

	/**
	 * MfgInstActCom_Upd04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR createMfgInstActCom_Upd04_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR.create();
	}

	/**
	 * MfgInstActCom_Upd04_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR> createMfgInstActCom_Upd04_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd08 aMfgInstActCom_Upd08;

	protected void initMfgInstActCom_Upd08() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd08_INFO;
		this.aMfgInstActCom_Upd08 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd08();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd08 crtMfgInstActCom_Upd08() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd08();
		return lgc.aMfgInstActCom_Upd08;
	}

	protected void paramMfgInstActCom_Upd08(MCParam p) {
		if (this.aMfgInstActCom_Upd08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd08.up0());
		p.addUpBlock(aMfgInstActCom_Upd08.up1());
		p.addUpBlock(aMfgInstActCom_Upd08.up2());
		p.addUpBlock(aMfgInstActCom_Upd08.up3());
		p.addUpBlock(aMfgInstActCom_Upd08.up4());
		p.addUpBlock(aMfgInstActCom_Upd08.up5());
		p.addUpBlock(aMfgInstActCom_Upd08.up6());
		p.addDownBlock(aMfgInstActCom_Upd08.down0());
	}

	protected void doMfgInstActCom_Upd08() {
		aMfgInstActCom_Upd08.call();
	};

	/**
	 * MfgInstActCom_Upd08_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR createMfgInstActCom_Upd08_CtrlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR.create();
	}

	/**
	 * MfgInstActCom_Upd08_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR createMfgInstActCom_Upd08_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.create();
	}

	/**
	 * MfgInstActCom_Upd08_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> createMfgInstActCom_Upd08_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR createMfgInstActCom_Upd08_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR> createMfgInstActCom_Upd08_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR createMfgInstActCom_Upd08_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> createMfgInstActCom_Upd08_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR createMfgInstActCom_Upd08_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR> createMfgInstActCom_Upd08_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR createMfgInstActCom_Upd08_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR> createMfgInstActCom_Upd08_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR createMfgInstActCom_Upd08_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> createMfgInstActCom_Upd08_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
	}

	/**
	 * MfgInstActCom_Upd08_HdrInstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR createMfgInstActCom_Upd08_HdrInstR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR.create();
	}

	/**
	 * MfgInstActCom_Upd08_HdrInstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR> createMfgInstActCom_Upd08_HdrInstL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperInstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR createMfgInstActCom_Upd08_DtlOperInstR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperInstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR> createMfgInstActCom_Upd08_DtlOperInstL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR createMfgInstActCom_Upd08_DtlYieldSchdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR> createMfgInstActCom_Upd08_DtlYieldSchdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR createMfgInstActCom_Upd08_DtlInptSchdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR> createMfgInstActCom_Upd08_DtlInptSchdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR createMfgInstActCom_Upd08_DtlWkSchdR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR> createMfgInstActCom_Upd08_DtlWkSchdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR.class);
	}

	/**
	 * MfgInstActCom_Upd08_HdrActRemブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR createMfgInstActCom_Upd08_HdrActRemR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR.create();
	}

	/**
	 * MfgInstActCom_Upd08_HdrActRemブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR> createMfgInstActCom_Upd08_HdrActRemL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperActRemブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR createMfgInstActCom_Upd08_DtlOperActRemR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlOperActRemブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR> createMfgInstActCom_Upd08_DtlOperActRemL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldActRemブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR createMfgInstActCom_Upd08_DtlYieldActRemR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlYieldActRemブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR> createMfgInstActCom_Upd08_DtlYieldActRemL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptActRemブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR createMfgInstActCom_Upd08_DtlInptActRemR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlInptActRemブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR> createMfgInstActCom_Upd08_DtlInptActRemL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR.class);
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkActRemブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR createMfgInstActCom_Upd08_DtlWkActRemR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR.create();
	}

	/**
	 * MfgInstActCom_Upd08_DtlWkActRemブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR> createMfgInstActCom_Upd08_DtlWkActRemL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd05 aMfgInstActCom_Upd05;

	protected void initMfgInstActCom_Upd05() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd05_INFO;
		this.aMfgInstActCom_Upd05 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd05();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd05 crtMfgInstActCom_Upd05() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd05();
		return lgc.aMfgInstActCom_Upd05;
	}

	protected void paramMfgInstActCom_Upd05(MCParam p) {
		if (this.aMfgInstActCom_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd05.up0());
	}

	protected void doMfgInstActCom_Upd05() {
		aMfgInstActCom_Upd05.call();
	};

	/**
	 * MfgInstActCom_Upd05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR createMfgInstActCom_Upd05_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR.create();
	}

	/**
	 * MfgInstActCom_Upd05_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR> createMfgInstActCom_Upd05_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd06 aMfgInstActCom_Upd06;

	protected void initMfgInstActCom_Upd06() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd06_INFO;
		this.aMfgInstActCom_Upd06 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd06();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd06 crtMfgInstActCom_Upd06() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd06();
		return lgc.aMfgInstActCom_Upd06;
	}

	protected void paramMfgInstActCom_Upd06(MCParam p) {
		if (this.aMfgInstActCom_Upd06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd06.up0());
	}

	protected void doMfgInstActCom_Upd06() {
		aMfgInstActCom_Upd06.call();
	};

	/**
	 * MfgInstActCom_Upd06_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR createMfgInstActCom_Upd06_DtlR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR.create();
	}

	/**
	 * MfgInstActCom_Upd06_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR> createMfgInstActCom_Upd06_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR.class);
	}
	protected MSBCL_MfgInstActComService.MfgInstActCom_Upd07 aMfgInstActCom_Upd07;

	protected void initMfgInstActCom_Upd07() {
		this.info = PDef.MS_MSBCL6110_MfgInstActCom_Upd07_INFO;
		this.aMfgInstActCom_Upd07 = ((MSBCL_MfgInstActComService)this).new MfgInstActCom_Upd07();
	}

	public static MSBCL_MfgInstActComService.MfgInstActCom_Upd07 crtMfgInstActCom_Upd07() {
		MSBCL_MfgInstActComService lgc = new MSBCL_MfgInstActComService();
		lgc.initMfgInstActCom_Upd07();
		return lgc.aMfgInstActCom_Upd07;
	}

	protected void paramMfgInstActCom_Upd07(MCParam p) {
		if (this.aMfgInstActCom_Upd07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstActCom_Upd07.up0());
	}

	protected void doMfgInstActCom_Upd07() {
		aMfgInstActCom_Upd07.call();
	};

	/**
	 * MfgInstActCom_Upd07_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR createMfgInstActCom_Upd07_HdrR(){
		return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgInstActCom_Sprt01オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯの発番を行う。<br>
	 */
	abstract public class MfgInstActCom_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstActCom_Sprt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR createMfgInstActCom_Sprt01_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.create();
		}

		/**
		 * MfgInstActCom_Sprt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> createMfgInstActCom_Sprt01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR.class);
		}

		/**
		 * MfgInstActCom_Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR createMfgInstActCom_Sprt01_DtlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.create();
		}

		/**
		 * MfgInstActCom_Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> createMfgInstActCom_Sprt01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>yield_dt_label_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>no_exception_flg</td></tr>
		 * 	<tr><td><br></td><td>no_err_msg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Sprt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Chk01オペレーション.<p>
	 *
	 * 製造指図、製造記録の承認前チェックを行う。<br>
	 */
	abstract public class MfgInstActCom_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstActCom_Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR createMfgInstActCom_Chk01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
		}

		/**
		 * MfgInstActCom_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR createMfgInstActCom_Chk01_DtlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.create();
		}

		/**
		 * MfgInstActCom_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> createMfgInstActCom_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> up1() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd01オペレーション.<p>
	 *
	 * 製造指図、製造記録を承認する。<br>
	 */
	abstract public class MfgInstActCom_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstActCom_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR createMfgInstActCom_Upd01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR.create();
		}

		/**
		 * MfgInstActCom_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR createMfgInstActCom_Upd01_DtlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.create();
		}

		/**
		 * MfgInstActCom_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> createMfgInstActCom_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd02オペレーション.<p>
	 *
	 * 品目製造指図ＮＯまたは製造実績ＮＯから引継対象子品目の情報を親品目に設定する。<br>
	 */
	abstract public class MfgInstActCom_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR> up0;
		/** [MfgInstActCom_Upd02_Inpt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR> aMfgInstActCom_Upd02_Inpt;
		/** [MfgInstActCom_Upd02_Yield]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR> aMfgInstActCom_Upd02_Yield;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR.class);
			aMfgInstActCom_Upd02_Inpt = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR.class);
			aMfgInstActCom_Upd02_Yield = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR createMfgInstActCom_Upd02_CndR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR.create();
		}

		/**
		 * MfgInstActCom_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR> createMfgInstActCom_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR.class);
		}

		/**
		 * MfgInstActCom_Upd02_InptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR createMfgInstActCom_Upd02_InptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR.create();
		}

		/**
		 * MfgInstActCom_Upd02_InptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR> createMfgInstActCom_Upd02_InptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR.class);
		}

		/**
		 * MfgInstActCom_Upd02_YieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR createMfgInstActCom_Upd02_YieldR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR.create();
		}

		/**
		 * MfgInstActCom_Upd02_YieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR> createMfgInstActCom_Upd02_YieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_CndR> up0() {
			return up0;
		}



		/**
		 * [MfgInstActCom_Upd02_Inpt]ブロックのコンテナaMfgInstActCom_Upd02_InptLを返します。
		 *
		 * @return MfgInstActCom_Upd02_InptL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_InptR> MfgInstActCom_Upd02_Inpt() {
			return aMfgInstActCom_Upd02_Inpt;
		}

		/**
		 * [MfgInstActCom_Upd02_Yield]ブロックのコンテナaMfgInstActCom_Upd02_YieldLを返します。
		 *
		 * @return MfgInstActCom_Upd02_YieldL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd02_YieldR> MfgInstActCom_Upd02_Yield() {
			return aMfgInstActCom_Upd02_Yield;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd03オペレーション.<p>
	 *
	 * 着手後の製造指図訂正時、製造実績残テーブルを再作成する。<br>
	 */
	abstract public class MfgInstActCom_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR> up0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR createMfgInstActCom_Upd03_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR.create();
		}

		/**
		 * MfgInstActCom_Upd03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR> createMfgInstActCom_Upd03_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd03_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd04オペレーション.<p>
	 *
	 * 受払予定の削除及び、分割連番1以上の各種実績残の登録<br>
	 */
	abstract public class MfgInstActCom_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR> up1;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd04_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR createMfgInstActCom_Upd04_CtrlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR.create();
		}

		/**
		 * MfgInstActCom_Upd04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR createMfgInstActCom_Upd04_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR.create();
		}

		/**
		 * MfgInstActCom_Upd04_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR> createMfgInstActCom_Upd04_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>is_src_mfg_inst_srv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd04_HdrR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd08オペレーション.<p>
	 *
	 * 残数分の受払予定の登録及び、各種実績残の更新<br>
	 */
	abstract public class MfgInstActCom_Upd08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> down0;
		/** [MfgInstActCom_Upd08_DtlInptActRem]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR> aMfgInstActCom_Upd08_DtlInptActRem;
		/** [MfgInstActCom_Upd08_DtlInptSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR> aMfgInstActCom_Upd08_DtlInptSchd;
		/** [MfgInstActCom_Upd08_DtlOperActRem]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR> aMfgInstActCom_Upd08_DtlOperActRem;
		/** [MfgInstActCom_Upd08_DtlOperInst]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR> aMfgInstActCom_Upd08_DtlOperInst;
		/** [MfgInstActCom_Upd08_DtlWkActRem]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR> aMfgInstActCom_Upd08_DtlWkActRem;
		/** [MfgInstActCom_Upd08_DtlWkSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR> aMfgInstActCom_Upd08_DtlWkSchd;
		/** [MfgInstActCom_Upd08_DtlYieldActRem]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR> aMfgInstActCom_Upd08_DtlYieldActRem;
		/** [MfgInstActCom_Upd08_DtlYieldSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR> aMfgInstActCom_Upd08_DtlYieldSchd;
		/** [MfgInstActCom_Upd08_HdrActRem]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR> aMfgInstActCom_Upd08_HdrActRem;
		/** [MfgInstActCom_Upd08_HdrInst]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR> aMfgInstActCom_Upd08_HdrInst;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd08() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.class);
			aMfgInstActCom_Upd08_DtlInptActRem = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR.class);
			aMfgInstActCom_Upd08_DtlInptSchd = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR.class);
			aMfgInstActCom_Upd08_DtlOperActRem = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR.class);
			aMfgInstActCom_Upd08_DtlOperInst = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR.class);
			aMfgInstActCom_Upd08_DtlWkActRem = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR.class);
			aMfgInstActCom_Upd08_DtlWkSchd = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR.class);
			aMfgInstActCom_Upd08_DtlYieldActRem = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR.class);
			aMfgInstActCom_Upd08_DtlYieldSchd = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR.class);
			aMfgInstActCom_Upd08_HdrActRem = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR.class);
			aMfgInstActCom_Upd08_HdrInst = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstActCom_Upd08_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR createMfgInstActCom_Upd08_CtrlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR.create();
		}

		/**
		 * MfgInstActCom_Upd08_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR createMfgInstActCom_Upd08_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.create();
		}

		/**
		 * MfgInstActCom_Upd08_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> createMfgInstActCom_Upd08_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR createMfgInstActCom_Upd08_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR> createMfgInstActCom_Upd08_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR createMfgInstActCom_Upd08_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> createMfgInstActCom_Upd08_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR createMfgInstActCom_Upd08_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR> createMfgInstActCom_Upd08_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR createMfgInstActCom_Upd08_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR> createMfgInstActCom_Upd08_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR createMfgInstActCom_Upd08_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> createMfgInstActCom_Upd08_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR.class);
		}

		/**
		 * MfgInstActCom_Upd08_HdrInstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR createMfgInstActCom_Upd08_HdrInstR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR.create();
		}

		/**
		 * MfgInstActCom_Upd08_HdrInstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR> createMfgInstActCom_Upd08_HdrInstL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperInstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR createMfgInstActCom_Upd08_DtlOperInstR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperInstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR> createMfgInstActCom_Upd08_DtlOperInstL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR createMfgInstActCom_Upd08_DtlYieldSchdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR> createMfgInstActCom_Upd08_DtlYieldSchdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR createMfgInstActCom_Upd08_DtlInptSchdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR> createMfgInstActCom_Upd08_DtlInptSchdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR createMfgInstActCom_Upd08_DtlWkSchdR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR> createMfgInstActCom_Upd08_DtlWkSchdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR.class);
		}

		/**
		 * MfgInstActCom_Upd08_HdrActRemブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR createMfgInstActCom_Upd08_HdrActRemR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR.create();
		}

		/**
		 * MfgInstActCom_Upd08_HdrActRemブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR> createMfgInstActCom_Upd08_HdrActRemL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperActRemブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR createMfgInstActCom_Upd08_DtlOperActRemR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlOperActRemブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR> createMfgInstActCom_Upd08_DtlOperActRemL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldActRemブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR createMfgInstActCom_Upd08_DtlYieldActRemR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlYieldActRemブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR> createMfgInstActCom_Upd08_DtlYieldActRemL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptActRemブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR createMfgInstActCom_Upd08_DtlInptActRemR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlInptActRemブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR> createMfgInstActCom_Upd08_DtlInptActRemL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR.class);
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkActRemブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR createMfgInstActCom_Upd08_DtlWkActRemR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR.create();
		}

		/**
		 * MfgInstActCom_Upd08_DtlWkActRemブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR> createMfgInstActCom_Upd08_DtlWkActRemL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>is_src_mfg_inst_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_wk_act_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldR> up6() {
			return up6;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>all_inpt_cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrR> down0() {
			return down0;
		}


		/**
		 * [MfgInstActCom_Upd08_DtlInptActRem]ブロックのコンテナaMfgInstActCom_Upd08_DtlInptActRemLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlInptActRemL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptActRemR> MfgInstActCom_Upd08_DtlInptActRem() {
			return aMfgInstActCom_Upd08_DtlInptActRem;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlInptSchd]ブロックのコンテナaMfgInstActCom_Upd08_DtlInptSchdLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlInptSchdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlInptSchdR> MfgInstActCom_Upd08_DtlInptSchd() {
			return aMfgInstActCom_Upd08_DtlInptSchd;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlOperActRem]ブロックのコンテナaMfgInstActCom_Upd08_DtlOperActRemLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlOperActRemL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperActRemR> MfgInstActCom_Upd08_DtlOperActRem() {
			return aMfgInstActCom_Upd08_DtlOperActRem;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlOperInst]ブロックのコンテナaMfgInstActCom_Upd08_DtlOperInstLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlOperInstL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlOperInstR> MfgInstActCom_Upd08_DtlOperInst() {
			return aMfgInstActCom_Upd08_DtlOperInst;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlWkActRem]ブロックのコンテナaMfgInstActCom_Upd08_DtlWkActRemLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlWkActRemL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkActRemR> MfgInstActCom_Upd08_DtlWkActRem() {
			return aMfgInstActCom_Upd08_DtlWkActRem;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlWkSchd]ブロックのコンテナaMfgInstActCom_Upd08_DtlWkSchdLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlWkSchdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlWkSchdR> MfgInstActCom_Upd08_DtlWkSchd() {
			return aMfgInstActCom_Upd08_DtlWkSchd;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlYieldActRem]ブロックのコンテナaMfgInstActCom_Upd08_DtlYieldActRemLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlYieldActRemL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldActRemR> MfgInstActCom_Upd08_DtlYieldActRem() {
			return aMfgInstActCom_Upd08_DtlYieldActRem;
		}

		/**
		 * [MfgInstActCom_Upd08_DtlYieldSchd]ブロックのコンテナaMfgInstActCom_Upd08_DtlYieldSchdLを返します。
		 *
		 * @return MfgInstActCom_Upd08_DtlYieldSchdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_DtlYieldSchdR> MfgInstActCom_Upd08_DtlYieldSchd() {
			return aMfgInstActCom_Upd08_DtlYieldSchd;
		}

		/**
		 * [MfgInstActCom_Upd08_HdrActRem]ブロックのコンテナaMfgInstActCom_Upd08_HdrActRemLを返します。
		 *
		 * @return MfgInstActCom_Upd08_HdrActRemL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrActRemR> MfgInstActCom_Upd08_HdrActRem() {
			return aMfgInstActCom_Upd08_HdrActRem;
		}

		/**
		 * [MfgInstActCom_Upd08_HdrInst]ブロックのコンテナaMfgInstActCom_Upd08_HdrInstLを返します。
		 *
		 * @return MfgInstActCom_Upd08_HdrInstL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd08_HdrInstR> MfgInstActCom_Upd08_HdrInst() {
			return aMfgInstActCom_Upd08_HdrInst;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd05オペレーション.<p>
	 *
	 * 月次仕掛の登録・更新・削除を行う。<br>
	 */
	abstract public class MfgInstActCom_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR> up0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR createMfgInstActCom_Upd05_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR.create();
		}

		/**
		 * MfgInstActCom_Upd05_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR> createMfgInstActCom_Upd05_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd05_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd06オペレーション.<p>
	 *
	 * 出来高実績残の現品票発行済ＦＬＧをオンに更新する。<br>
	 */
	abstract public class MfgInstActCom_Upd06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR.class);

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd06_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR createMfgInstActCom_Upd06_DtlR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR.create();
		}

		/**
		 * MfgInstActCom_Upd06_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR> createMfgInstActCom_Upd06_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd06_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstActCom_Upd07オペレーション.<p>
	 *
	 * 上り電文で指定された値に応じて、仕掛締・締解除処理を実行する。<br>
	 */
	abstract public class MfgInstActCom_Upd07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstActCom_Upd07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR up0;
		
		
		// コンストラクタ
		protected MfgInstActCom_Upd07() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR.create();

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
			invoke((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstActCom_Upd07_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR createMfgInstActCom_Upd07_HdrR(){
			return mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>closing_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR
		 */
		public mcframe.serverMSBC.MSBCL6110.MfgInstActCom_Upd07_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstActComService)MSBCL_MfgInstActComService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}