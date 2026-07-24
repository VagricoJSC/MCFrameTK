package mcframe.serverMSBC.MSBCL5010;

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
 * "MSBCL_OrdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_OrdRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_OrdRegService.Ord_Upd01 aOrd_Upd01;

	protected void initOrd_Upd01() {
		this.info = PDef.MS_MSBCL5010_Ord_Upd01_INFO;
		this.aOrd_Upd01 = ((MSBCL_OrdRegService)this).new Ord_Upd01();
	}

	public static MSBCL_OrdRegService.Ord_Upd01 crtOrd_Upd01() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Upd01();
		return lgc.aOrd_Upd01;
	}

	protected void paramOrd_Upd01(MCParam p) {
		if (this.aOrd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Upd01.up0());
		p.addUpBlock(aOrd_Upd01.up1());
		p.addDownBlock(aOrd_Upd01.down0());
		p.addDownBlock(aOrd_Upd01.down1());
	}

	protected void doOrd_Upd01() {
		aOrd_Upd01.call();
	};

	/**
	 * Ord_Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Upd01_Dtl1R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * Ord_Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Upd01_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}

	/**
	 * Ord_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrd_Upd01_Dtl2R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
	}

	/**
	 * Ord_Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrd_Upd01_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
	}

	/**
	 * Ord_Upd01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R createOrd_Upd01_Rslt1R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R.create();
	}

	/**
	 * Ord_Upd01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R> createOrd_Upd01_Rslt1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R.class);
	}

	/**
	 * Ord_Upd01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R createOrd_Upd01_Rslt2R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R.create();
	}

	/**
	 * Ord_Upd01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R> createOrd_Upd01_Rslt2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R.class);
	}
	protected MSBCL_OrdRegService.Ord_Sprt01 aOrd_Sprt01;

	protected void initOrd_Sprt01() {
		this.info = PDef.MS_MSBCL5010_Ord_Sprt01_INFO;
		this.aOrd_Sprt01 = ((MSBCL_OrdRegService)this).new Ord_Sprt01();
	}

	public static MSBCL_OrdRegService.Ord_Sprt01 crtOrd_Sprt01() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Sprt01();
		return lgc.aOrd_Sprt01;
	}

	protected void paramOrd_Sprt01(MCParam p) {
		if (this.aOrd_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Sprt01.up0());
		p.addDownBlock(aOrd_Sprt01.down0());
	}

	protected void doOrd_Sprt01() {
		aOrd_Sprt01.call();
	};

	/**
	 * Ord_Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR createOrd_Sprt01_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR.create();
	}

	/**
	 * Ord_Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> createOrd_Sprt01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR.class);
	}

	/**
	 * Ord_Sprt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR createOrd_Sprt01_RsltR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR.create();
	}

	/**
	 * Ord_Sprt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR> createOrd_Sprt01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR.class);
	}
	protected MSBCL_OrdRegService.Ord_Sprt02 aOrd_Sprt02;

	protected void initOrd_Sprt02() {
		this.info = PDef.MS_MSBCL5010_Ord_Sprt02_INFO;
		this.aOrd_Sprt02 = ((MSBCL_OrdRegService)this).new Ord_Sprt02();
	}

	public static MSBCL_OrdRegService.Ord_Sprt02 crtOrd_Sprt02() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Sprt02();
		return lgc.aOrd_Sprt02;
	}

	protected void paramOrd_Sprt02(MCParam p) {
		if (this.aOrd_Sprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Sprt02.up0());
		p.addUpBlock(aOrd_Sprt02.up1());
		p.addDownBlock(aOrd_Sprt02.down0());
	}

	protected void doOrd_Sprt02() {
		aOrd_Sprt02.call();
	};

	/**
	 * Ord_Sprt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR createOrd_Sprt02_CndR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR.create();
	}

	/**
	 * Ord_Sprt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR createOrd_Sprt02_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR.create();
	}

	/**
	 * Ord_Sprt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR> createOrd_Sprt02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR.class);
	}

	/**
	 * Ord_Sprt02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR createOrd_Sprt02_RsltR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR.create();
	}

	/**
	 * Ord_Sprt02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR> createOrd_Sprt02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR.class);
	}
	protected MSBCL_OrdRegService.Ord_Sprt03 aOrd_Sprt03;

	protected void initOrd_Sprt03() {
		this.info = PDef.MS_MSBCL5010_Ord_Sprt03_INFO;
		this.aOrd_Sprt03 = ((MSBCL_OrdRegService)this).new Ord_Sprt03();
	}

	public static MSBCL_OrdRegService.Ord_Sprt03 crtOrd_Sprt03() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Sprt03();
		return lgc.aOrd_Sprt03;
	}

	protected void paramOrd_Sprt03(MCParam p) {
		if (this.aOrd_Sprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Sprt03.up0());
		p.addDownBlock(aOrd_Sprt03.down0());
	}

	protected void doOrd_Sprt03() {
		aOrd_Sprt03.call();
	};

	/**
	 * Ord_Sprt03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR createOrd_Sprt03_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR.create();
	}

	/**
	 * Ord_Sprt03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR> createOrd_Sprt03_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR.class);
	}

	/**
	 * Ord_Sprt03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR createOrd_Sprt03_RsltR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR.create();
	}

	/**
	 * Ord_Sprt03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR> createOrd_Sprt03_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR.class);
	}
	protected MSBCL_OrdRegService.Ord_Sprt04 aOrd_Sprt04;

	protected void initOrd_Sprt04() {
		this.info = PDef.MS_MSBCL5010_Ord_Sprt04_INFO;
		this.aOrd_Sprt04 = ((MSBCL_OrdRegService)this).new Ord_Sprt04();
	}

	public static MSBCL_OrdRegService.Ord_Sprt04 crtOrd_Sprt04() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Sprt04();
		return lgc.aOrd_Sprt04;
	}

	protected void paramOrd_Sprt04(MCParam p) {
		if (this.aOrd_Sprt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Sprt04.up0());
		p.addDownBlock(aOrd_Sprt04.down0());
	}

	protected void doOrd_Sprt04() {
		aOrd_Sprt04.call();
	};

	/**
	 * Ord_Sprt04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Sprt04_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * Ord_Sprt04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Sprt04_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}
	protected MSBCL_OrdRegService.Ord_Chk01 aOrd_Chk01;

	protected void initOrd_Chk01() {
		this.info = PDef.MS_MSBCL5010_Ord_Chk01_INFO;
		this.aOrd_Chk01 = ((MSBCL_OrdRegService)this).new Ord_Chk01();
	}

	public static MSBCL_OrdRegService.Ord_Chk01 crtOrd_Chk01() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Chk01();
		return lgc.aOrd_Chk01;
	}

	protected void paramOrd_Chk01(MCParam p) {
		if (this.aOrd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Chk01.up0());
		p.addUpBlock(aOrd_Chk01.up1());
		p.addDownBlock(aOrd_Chk01.down0());
	}

	protected void doOrd_Chk01() {
		aOrd_Chk01.call();
	};

	/**
	 * Ord_Chk01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Chk01_Dtl1R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * Ord_Chk01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Chk01_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}

	/**
	 * Ord_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrd_Chk01_Dtl2R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
	}

	/**
	 * Ord_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrd_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
	}
	protected MSBCL_OrdRegService.Ord_Chk02 aOrd_Chk02;

	protected void initOrd_Chk02() {
		this.info = PDef.MS_MSBCL5010_Ord_Chk02_INFO;
		this.aOrd_Chk02 = ((MSBCL_OrdRegService)this).new Ord_Chk02();
	}

	public static MSBCL_OrdRegService.Ord_Chk02 crtOrd_Chk02() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Chk02();
		return lgc.aOrd_Chk02;
	}

	protected void paramOrd_Chk02(MCParam p) {
		if (this.aOrd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Chk02.up0());
		p.addDownBlock(aOrd_Chk02.down0());
	}

	protected void doOrd_Chk02() {
		aOrd_Chk02.call();
	};

	/**
	 * Ord_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Chk02_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * Ord_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}
	protected MSBCL_OrdRegService.Ord_Upd02 aOrd_Upd02;

	protected void initOrd_Upd02() {
		this.info = PDef.MS_MSBCL5010_Ord_Upd02_INFO;
		this.aOrd_Upd02 = ((MSBCL_OrdRegService)this).new Ord_Upd02();
	}

	public static MSBCL_OrdRegService.Ord_Upd02 crtOrd_Upd02() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Upd02();
		return lgc.aOrd_Upd02;
	}

	protected void paramOrd_Upd02(MCParam p) {
		if (this.aOrd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Upd02.up0());
		p.addDownBlock(aOrd_Upd02.down0());
	}

	protected void doOrd_Upd02() {
		aOrd_Upd02.call();
	};

	/**
	 * Ord_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Upd02_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * Ord_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}
	protected MSBCL_OrdRegService.Ord_Upd03 aOrd_Upd03;

	protected void initOrd_Upd03() {
		this.info = PDef.MS_MSBCL5010_Ord_Upd03_INFO;
		this.aOrd_Upd03 = ((MSBCL_OrdRegService)this).new Ord_Upd03();
	}

	public static MSBCL_OrdRegService.Ord_Upd03 crtOrd_Upd03() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Upd03();
		return lgc.aOrd_Upd03;
	}

	protected void paramOrd_Upd03(MCParam p) {
		if (this.aOrd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Upd03.up0());
	}

	protected void doOrd_Upd03() {
		aOrd_Upd03.call();
	};

	/**
	 * Ord_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR createOrd_Upd03_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR.create();
	}

	/**
	 * Ord_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR> createOrd_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR.class);
	}
	protected MSBCL_OrdRegService.Ord_Upd04 aOrd_Upd04;

	protected void initOrd_Upd04() {
		this.info = PDef.MS_MSBCL5010_Ord_Upd04_INFO;
		this.aOrd_Upd04 = ((MSBCL_OrdRegService)this).new Ord_Upd04();
	}

	public static MSBCL_OrdRegService.Ord_Upd04 crtOrd_Upd04() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Upd04();
		return lgc.aOrd_Upd04;
	}

	protected void paramOrd_Upd04(MCParam p) {
		if (this.aOrd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Upd04.up0());
	}

	protected void doOrd_Upd04() {
		aOrd_Upd04.call();
	};

	/**
	 * Ord_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR createOrd_Upd04_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR.create();
	}

	/**
	 * Ord_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR> createOrd_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR.class);
	}
	protected MSBCL_OrdRegService.Ord_Upd05 aOrd_Upd05;

	protected void initOrd_Upd05() {
		this.info = PDef.MS_MSBCL5010_Ord_Upd05_INFO;
		this.aOrd_Upd05 = ((MSBCL_OrdRegService)this).new Ord_Upd05();
	}

	public static MSBCL_OrdRegService.Ord_Upd05 crtOrd_Upd05() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Upd05();
		return lgc.aOrd_Upd05;
	}

	protected void paramOrd_Upd05(MCParam p) {
		if (this.aOrd_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Upd05.up0());
	}

	protected void doOrd_Upd05() {
		aOrd_Upd05.call();
	};

	/**
	 * Ord_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR createOrd_Upd05_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR.create();
	}

	/**
	 * Ord_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR> createOrd_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR.class);
	}
	protected MSBCL_OrdRegService.Ord_Imp01 aOrd_Imp01;

	protected void initOrd_Imp01() {
		this.info = PDef.MS_MSBCL5010_Ord_Imp01_INFO;
		this.aOrd_Imp01 = ((MSBCL_OrdRegService)this).new Ord_Imp01();
	}

	public static MSBCL_OrdRegService.Ord_Imp01 crtOrd_Imp01() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Imp01();
		return lgc.aOrd_Imp01;
	}

	protected void paramOrd_Imp01(MCParam p) {
		if (this.aOrd_Imp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Imp01.up0());
		p.addDownBlock(aOrd_Imp01.down0());
	}

	protected void doOrd_Imp01() {
		aOrd_Imp01.call();
	};

	/**
	 * Ord_Imp01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR createOrd_Imp01_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.create();
	}

	/**
	 * Ord_Imp01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> createOrd_Imp01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.class);
	}
	protected MSBCL_OrdRegService.Ord_Imp02 aOrd_Imp02;

	protected void initOrd_Imp02() {
		this.info = PDef.MS_MSBCL5010_Ord_Imp02_INFO;
		this.aOrd_Imp02 = ((MSBCL_OrdRegService)this).new Ord_Imp02();
	}

	public static MSBCL_OrdRegService.Ord_Imp02 crtOrd_Imp02() {
		MSBCL_OrdRegService lgc = new MSBCL_OrdRegService();
		lgc.initOrd_Imp02();
		return lgc.aOrd_Imp02;
	}

	protected void paramOrd_Imp02(MCParam p) {
		if (this.aOrd_Imp02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrd_Imp02.up0());
		p.addDownBlock(aOrd_Imp02.down0());
	}

	protected void doOrd_Imp02() {
		aOrd_Imp02.call();
	};

	/**
	 * Ord_Imp02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR createOrd_Imp02_DtlR(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.create();
	}

	/**
	 * Ord_Imp02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> createOrd_Imp02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Ord_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Ord_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R> down1;
		
		
		// コンストラクタ
		protected Ord_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ord_Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Upd01_Dtl1R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * Ord_Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Upd01_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		/**
		 * Ord_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrd_Upd01_Dtl2R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
		}

		/**
		 * Ord_Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrd_Upd01_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
		}

		/**
		 * Ord_Upd01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R createOrd_Upd01_Rslt1R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R.create();
		}

		/**
		 * Ord_Upd01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R> createOrd_Upd01_Rslt1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R.class);
		}

		/**
		 * Ord_Upd01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R createOrd_Upd01_Rslt2R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R.create();
		}

		/**
		 * Ord_Upd01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R> createOrd_Upd01_Rslt2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>uplnd_outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Sprt01オペレーション.<p>
	 *
	 */
	abstract public class Ord_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Ord_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR createOrd_Sprt01_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR.create();
		}

		/**
		 * Ord_Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> createOrd_Sprt01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR.class);
		}

		/**
		 * Ord_Sprt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR createOrd_Sprt01_RsltR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR.create();
		}

		/**
		 * Ord_Sprt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR> createOrd_Sprt01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>mst_oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>mst_oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Sprt02オペレーション.<p>
	 *
	 */
	abstract public class Ord_Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR> down0;
		
		
		// コンストラクタ
		protected Ord_Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Sprt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR createOrd_Sprt02_CndR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR.create();
		}

		/**
		 * Ord_Sprt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR createOrd_Sprt02_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR.create();
		}

		/**
		 * Ord_Sprt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR> createOrd_Sprt02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR.class);
		}

		/**
		 * Ord_Sprt02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR createOrd_Sprt02_RsltR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR.create();
		}

		/**
		 * Ord_Sprt02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR> createOrd_Sprt02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inst_exp_flg</td></tr>
		 * 	<tr><td><br></td><td>get_prov_upri_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>bom_id</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_in_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_ratio</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_ratio</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_inpt_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Sprt03オペレーション.<p>
	 *
	 */
	abstract public class Ord_Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR> down0;
		
		
		// コンストラクタ
		protected Ord_Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Sprt03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR createOrd_Sprt03_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR.create();
		}

		/**
		 * Ord_Sprt03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR> createOrd_Sprt03_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR.class);
		}

		/**
		 * Ord_Sprt03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR createOrd_Sprt03_RsltR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR.create();
		}

		/**
		 * Ord_Sprt03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR> createOrd_Sprt03_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Sprt04オペレーション.<p>
	 *
	 */
	abstract public class Ord_Sprt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Sprt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected Ord_Sprt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Sprt04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Sprt04_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * Ord_Sprt04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Sprt04_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_schd_yield</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Chk01オペレーション.<p>
	 *
	 */
	abstract public class Ord_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected Ord_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Chk01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Chk01_Dtl1R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * Ord_Chk01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Chk01_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		/**
		 * Ord_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrd_Chk01_Dtl2R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
		}

		/**
		 * Ord_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrd_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>uplnd_outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Chk02オペレーション.<p>
	 *
	 */
	abstract public class Ord_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected Ord_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Chk02_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * Ord_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Upd02オペレーション.<p>
	 *
	 */
	abstract public class Ord_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected Ord_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrd_Upd02_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * Ord_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrd_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>b_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_mfg_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Upd03オペレーション.<p>
	 *
	 */
	abstract public class Ord_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected Ord_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ord_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR createOrd_Upd03_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR.create();
		}

		/**
		 * Ord_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR> createOrd_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>wk.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>wk.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>wk.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wk.oper_schd_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Upd04オペレーション.<p>
	 *
	 */
	abstract public class Ord_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected Ord_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ord_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR createOrd_Upd04_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR.create();
		}

		/**
		 * Ord_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR> createOrd_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Upd05オペレーション.<p>
	 *
	 */
	abstract public class Ord_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR> up0;
		
		
		// コンストラクタ
		protected Ord_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ord_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR createOrd_Upd05_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR.create();
		}

		/**
		 * Ord_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR> createOrd_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd05_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Imp01オペレーション.<p>
	 *
	 */
	abstract public class Ord_Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> down0;
		
		
		// コンストラクタ
		protected Ord_Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Imp01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR createOrd_Imp01_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.create();
		}

		/**
		 * Ord_Imp01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> createOrd_Imp01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR.class);
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
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_schd_yield</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}
	/**
	 * Ord_Imp02オペレーション.<p>
	 *
	 */
	abstract public class Ord_Imp02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ord_Imp02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> down0;
		
		
		// コンストラクタ
		protected Ord_Imp02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.class);

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
			invoke((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ord_Imp02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR createOrd_Imp02_DtlR(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.create();
		}

		/**
		 * Ord_Imp02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> createOrd_Imp02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR.class);
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
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_schd_yield</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_site_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_order_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Imp02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdRegService)MSBCL_OrdRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}