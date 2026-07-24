package mcframe.serverMSBC.MSBCL6060;

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
 * "MSBCL_MfgActTblRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgActTblRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgActTblRegService.MfgActTblReg_Chk05 aMfgActTblReg_Chk05;

	protected void initMfgActTblReg_Chk05() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Chk05_INFO;
		this.aMfgActTblReg_Chk05 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Chk05();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Chk05 crtMfgActTblReg_Chk05() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Chk05();
		return lgc.aMfgActTblReg_Chk05;
	}

	protected void paramMfgActTblReg_Chk05(MCParam p) {
		if (this.aMfgActTblReg_Chk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Chk05.up0());
		p.addDownBlock(aMfgActTblReg_Chk05.down0());
	}

	protected void doMfgActTblReg_Chk05() {
		aMfgActTblReg_Chk05.call();
	};

	/**
	 * MfgActTblReg_Chk05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR createMfgActTblReg_Chk05_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.create();
	}

	/**
	 * MfgActTblReg_Chk05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> createMfgActTblReg_Chk05_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd01 aMfgActTblReg_Upd01;

	protected void initMfgActTblReg_Upd01() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd01_INFO;
		this.aMfgActTblReg_Upd01 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd01();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd01 crtMfgActTblReg_Upd01() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd01();
		return lgc.aMfgActTblReg_Upd01;
	}

	protected void paramMfgActTblReg_Upd01(MCParam p) {
		if (this.aMfgActTblReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd01.up0());
	}

	protected void doMfgActTblReg_Upd01() {
		aMfgActTblReg_Upd01.call();
	};

	/**
	 * MfgActTblReg_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR createMfgActTblReg_Upd01_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR.create();
	}

	/**
	 * MfgActTblReg_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> createMfgActTblReg_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd02 aMfgActTblReg_Upd02;

	protected void initMfgActTblReg_Upd02() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd02_INFO;
		this.aMfgActTblReg_Upd02 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd02();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd02 crtMfgActTblReg_Upd02() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd02();
		return lgc.aMfgActTblReg_Upd02;
	}

	protected void paramMfgActTblReg_Upd02(MCParam p) {
		if (this.aMfgActTblReg_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd02.up0());
	}

	protected void doMfgActTblReg_Upd02() {
		aMfgActTblReg_Upd02.call();
	};

	/**
	 * MfgActTblReg_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR createMfgActTblReg_Upd02_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR.create();
	}

	/**
	 * MfgActTblReg_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> createMfgActTblReg_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd03 aMfgActTblReg_Upd03;

	protected void initMfgActTblReg_Upd03() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd03_INFO;
		this.aMfgActTblReg_Upd03 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd03();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd03 crtMfgActTblReg_Upd03() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd03();
		return lgc.aMfgActTblReg_Upd03;
	}

	protected void paramMfgActTblReg_Upd03(MCParam p) {
		if (this.aMfgActTblReg_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd03.up0());
	}

	protected void doMfgActTblReg_Upd03() {
		aMfgActTblReg_Upd03.call();
	};

	/**
	 * MfgActTblReg_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR createMfgActTblReg_Upd03_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR.create();
	}

	/**
	 * MfgActTblReg_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> createMfgActTblReg_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd04 aMfgActTblReg_Upd04;

	protected void initMfgActTblReg_Upd04() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd04_INFO;
		this.aMfgActTblReg_Upd04 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd04();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd04 crtMfgActTblReg_Upd04() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd04();
		return lgc.aMfgActTblReg_Upd04;
	}

	protected void paramMfgActTblReg_Upd04(MCParam p) {
		if (this.aMfgActTblReg_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd04.up0());
		p.addUpBlock(aMfgActTblReg_Upd04.up1());
		p.addUpBlock(aMfgActTblReg_Upd04.up2());
		p.addUpBlock(aMfgActTblReg_Upd04.up3());
		p.addUpBlock(aMfgActTblReg_Upd04.up4());
		p.addUpBlock(aMfgActTblReg_Upd04.up5());
		p.addDownBlock(aMfgActTblReg_Upd04.down0());
		p.addDownBlock(aMfgActTblReg_Upd04.down1());
		p.addDownBlock(aMfgActTblReg_Upd04.down2());
	}

	protected void doMfgActTblReg_Upd04() {
		aMfgActTblReg_Upd04.call();
	};

	/**
	 * MfgActTblReg_Upd04_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR createMfgActTblReg_Upd04_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.create();
	}

	/**
	 * MfgActTblReg_Upd04_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> createMfgActTblReg_Upd04_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.class);
	}

	/**
	 * MfgActTblReg_Upd04_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR createMfgActTblReg_Upd04_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR.create();
	}

	/**
	 * MfgActTblReg_Upd04_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> createMfgActTblReg_Upd04_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR.class);
	}

	/**
	 * MfgActTblReg_Upd04_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR createMfgActTblReg_Upd04_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR.create();
	}

	/**
	 * MfgActTblReg_Upd04_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> createMfgActTblReg_Upd04_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR.class);
	}

	/**
	 * MfgActTblReg_Upd04_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR createMfgActTblReg_Upd04_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR.create();
	}

	/**
	 * MfgActTblReg_Upd04_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> createMfgActTblReg_Upd04_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR.class);
	}

	/**
	 * MfgActTblReg_Upd04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR createMfgActTblReg_Upd04_HdrR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.create();
	}

	/**
	 * MfgActTblReg_Upd04_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> createMfgActTblReg_Upd04_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.class);
	}

	/**
	 * MfgActTblReg_Upd04_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR createMfgActTblReg_Upd04_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.create();
	}

	/**
	 * MfgActTblReg_Upd04_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> createMfgActTblReg_Upd04_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 aMfgActTblReg_Upd05;

	protected void initMfgActTblReg_Upd05() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd05_INFO;
		this.aMfgActTblReg_Upd05 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd05();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 crtMfgActTblReg_Upd05() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd05();
		return lgc.aMfgActTblReg_Upd05;
	}

	protected void paramMfgActTblReg_Upd05(MCParam p) {
		if (this.aMfgActTblReg_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd05.up0());
		p.addDownBlock(aMfgActTblReg_Upd05.down0());
	}

	protected void doMfgActTblReg_Upd05() {
		aMfgActTblReg_Upd05.call();
	};

	/**
	 * MfgActTblReg_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR createMfgActTblReg_Upd05_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.create();
	}

	/**
	 * MfgActTblReg_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> createMfgActTblReg_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.class);
	}
	protected MSBCL_MfgActTblRegService.MfgActTblReg_Upd06 aMfgActTblReg_Upd06;

	protected void initMfgActTblReg_Upd06() {
		this.info = PDef.MS_MSBCL6060_MfgActTblReg_Upd06_INFO;
		this.aMfgActTblReg_Upd06 = ((MSBCL_MfgActTblRegService)this).new MfgActTblReg_Upd06();
	}

	public static MSBCL_MfgActTblRegService.MfgActTblReg_Upd06 crtMfgActTblReg_Upd06() {
		MSBCL_MfgActTblRegService lgc = new MSBCL_MfgActTblRegService();
		lgc.initMfgActTblReg_Upd06();
		return lgc.aMfgActTblReg_Upd06;
	}

	protected void paramMfgActTblReg_Upd06(MCParam p) {
		if (this.aMfgActTblReg_Upd06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActTblReg_Upd06.up0());
	}

	protected void doMfgActTblReg_Upd06() {
		aMfgActTblReg_Upd06.call();
	};

	/**
	 * MfgActTblReg_Upd06_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR createMfgActTblReg_Upd06_DtlR(){
		return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR.create();
	}

	/**
	 * MfgActTblReg_Upd06_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> createMfgActTblReg_Upd06_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgActTblReg_Chk05オペレーション.<p>
	 *
	 * 工数実績を更新するために共通的なチェックを行う<br>
	 */
	abstract public class MfgActTblReg_Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActTblReg_Chk05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR createMfgActTblReg_Chk05_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.create();
		}

		/**
		 * MfgActTblReg_Chk05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> createMfgActTblReg_Chk05_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> up0() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Chk05_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd01オペレーション.<p>
	 *
	 * 製造実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgActTblReg_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR createMfgActTblReg_Upd01_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR.create();
		}

		/**
		 * MfgActTblReg_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> createMfgActTblReg_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.act_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.arr_purc_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd02オペレーション.<p>
	 *
	 * 工程実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgActTblReg_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR createMfgActTblReg_Upd02_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR.create();
		}

		/**
		 * MfgActTblReg_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> createMfgActTblReg_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_act.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_act.oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_act.oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_act.bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act.wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act.oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_act.bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act.data_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.mes_id</td></tr>
		 * 	<tr><td><br></td><td>oper_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act.act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_act.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_act.ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act.if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd03オペレーション.<p>
	 *
	 * 出来高実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgActTblReg_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR createMfgActTblReg_Upd03_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR.create();
		}

		/**
		 * MfgActTblReg_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> createMfgActTblReg_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.div_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_act.mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>yield_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>yield_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.yield_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.act_tm</td></tr>
		 * 	<tr><td><br></td><td>yield_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_act.bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.lot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.not_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.data_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act.mes_id</td></tr>
		 * 	<tr><td><br></td><td>yield_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act.act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_act.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_act.ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd04オペレーション.<p>
	 *
	 * 投入実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> up5;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> down2;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * MfgActTblReg_Upd04_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR createMfgActTblReg_Upd04_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.create();
		}

		/**
		 * MfgActTblReg_Upd04_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> createMfgActTblReg_Upd04_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR.class);
		}

		/**
		 * MfgActTblReg_Upd04_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR createMfgActTblReg_Upd04_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR.create();
		}

		/**
		 * MfgActTblReg_Upd04_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> createMfgActTblReg_Upd04_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR.class);
		}

		/**
		 * MfgActTblReg_Upd04_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR createMfgActTblReg_Upd04_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR.create();
		}

		/**
		 * MfgActTblReg_Upd04_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> createMfgActTblReg_Upd04_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR.class);
		}

		/**
		 * MfgActTblReg_Upd04_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR createMfgActTblReg_Upd04_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR.create();
		}

		/**
		 * MfgActTblReg_Upd04_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> createMfgActTblReg_Upd04_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR.class);
		}

		/**
		 * MfgActTblReg_Upd04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR createMfgActTblReg_Upd04_HdrR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.create();
		}

		/**
		 * MfgActTblReg_Upd04_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> createMfgActTblReg_Upd04_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR.class);
		}

		/**
		 * MfgActTblReg_Upd04_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR createMfgActTblReg_Upd04_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.create();
		}

		/**
		 * MfgActTblReg_Upd04_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> createMfgActTblReg_Upd04_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>slf_support_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_upri</td></tr>
		 * 	<tr><td><br></td><td>slf_support_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate</td></tr>
		 * 	<tr><td><br></td><td>vmi_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_upri</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_md_mfg_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_only_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.div_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.act_tm</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.base_unit_std_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.cont_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.acxfr_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.data_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.mes_id</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act.loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act.inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act.loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_act.fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_act.cont_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>loss_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>loss_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>loss_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>loss_act.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> up5() {
			return up5;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_reg_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act.base_unit_fxd_loss_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd05オペレーション.<p>
	 *
	 * 工数実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> down0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActTblReg_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR createMfgActTblReg_Upd05_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.create();
		}

		/**
		 * MfgActTblReg_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> createMfgActTblReg_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.div_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_act.st_tm</td></tr>
		 * 	<tr><td><br></td><td>wk_act.end_tm</td></tr>
		 * 	<tr><td><br></td><td>wk_act.brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_act.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>wk_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wk_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wk_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wk_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_act.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_act.ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act.wk_cost</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActTblReg_Upd06オペレーション.<p>
	 *
	 * 副産品実績を更新する<br>
	 */
	abstract public class MfgActTblReg_Upd06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActTblReg_Upd06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgActTblReg_Upd06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR.class);

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
			invoke((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgActTblReg_Upd06_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR createMfgActTblReg_Upd06_DtlR(){
			return mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR.create();
		}

		/**
		 * MfgActTblReg_Upd06_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> createMfgActTblReg_Upd06_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.div_seq</td></tr>
		 * 	<tr><td><br></td><td>by_prod.mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>by_prod.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>by_prod.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>by_prod.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>by_prod.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>by_prod.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>by_prod.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_typ</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_rate</td></tr>
		 * 	<tr><td><br></td><td>by_prod.lot_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sno1</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sno2</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sno3</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sno4</td></tr>
		 * 	<tr><td><br></td><td>by_prod.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>by_prod.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>by_prod.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.yield_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.act_tm</td></tr>
		 * 	<tr><td><br></td><td>by_prod.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>by_prod.bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>by_prod.lot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>by_prod.data_no</td></tr>
		 * 	<tr><td><br></td><td>by_prod.mes_id</td></tr>
		 * 	<tr><td><br></td><td>by_prod.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>by_prod.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>by_prod.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>by_prod.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>by_prod.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>by_prod.ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActTblRegService)MSBCL_MfgActTblRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}