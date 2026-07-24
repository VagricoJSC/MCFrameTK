package mcframe.serverMABS.MABSL1100;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABSL_MfgItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_MfgItmReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL1100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_MfgItmReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL1100_Srch01_INFO;
		this.aSrch01 = ((MABSL_MfgItmReg)this).new Srch01();
	}

	public static MABSL_MfgItmReg.Srch01 crtSrch01() {
		MABSL_MfgItmReg lgc = new MABSL_MfgItmReg();
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
		p.addDownBlock(aSrch01.down8());
		p.addDownBlock(aSrch01.down9());
		p.addDownBlock(aSrch01.down10());
		p.addDownBlock(aSrch01.down11());
		p.addDownBlock(aSrch01.down12());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL1100.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt0R createSrch01_Rslt0R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.create();
	}

	/**
	 * Srch01_Rslt0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> createSrch01_Rslt0L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt5R.class);
	}

	/**
	 * Srch01_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt6R createSrch01_Rslt6R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt6R.create();
	}

	/**
	 * Srch01_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> createSrch01_Rslt6L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt6R.class);
	}

	/**
	 * Srch01_Rslt7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt7R createSrch01_Rslt7R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt7R.create();
	}

	/**
	 * Srch01_Rslt7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> createSrch01_Rslt7L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt7R.class);
	}

	/**
	 * Srch01_Rslt8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt8R createSrch01_Rslt8R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt8R.create();
	}

	/**
	 * Srch01_Rslt8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> createSrch01_Rslt8L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt8R.class);
	}

	/**
	 * Srch01_Rslt9ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt9R createSrch01_Rslt9R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt9R.create();
	}

	/**
	 * Srch01_Rslt9ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> createSrch01_Rslt9L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt9R.class);
	}

	/**
	 * Srch01_Rslt10ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt10R createSrch01_Rslt10R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt10R.create();
	}

	/**
	 * Srch01_Rslt10ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> createSrch01_Rslt10L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt10R.class);
	}

	/**
	 * Srch01_Rslt11ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt11R createSrch01_Rslt11R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt11R.create();
	}

	/**
	 * Srch01_Rslt11ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> createSrch01_Rslt11L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt11R.class);
	}

	/**
	 * Srch01_Rslt12ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt12R createSrch01_Rslt12R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt12R.create();
	}

	/**
	 * Srch01_Rslt12ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> createSrch01_Rslt12L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt12R.class);
	}
	protected MABSL_MfgItmReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL1100_Upd01_INFO;
		this.aUpd01 = ((MABSL_MfgItmReg)this).new Upd01();
	}

	public static MABSL_MfgItmReg.Upd01 crtUpd01() {
		MABSL_MfgItmReg lgc = new MABSL_MfgItmReg();
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
		p.addUpBlock(aUpd01.up7());
		p.addUpBlock(aUpd01.up8());
		p.addUpBlock(aUpd01.up9());
		p.addUpBlock(aUpd01.up10());
		p.addUpBlock(aUpd01.up11());
		p.addUpBlock(aUpd01.up12());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl0ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1100.Srch01_Rslt0R createUpd01_Dtl0R(){
		return mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.create();
	}

	/**
	 * Upd01_Dtl0ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> createUpd01_Dtl0L(){
		return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
	}

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR createUpd01_Dtl6R(){
		return mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> createUpd01_Dtl6L(){
		return MCList.create(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR createUpd01_Dtl7R(){
		return mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> createUpd01_Dtl7L(){
		return MCList.create(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR createUpd01_Dtl8R(){
		return mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> createUpd01_Dtl8L(){
		return MCList.create(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl9ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl9R(){
		return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl9ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl9L(){
		return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl10ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR createUpd01_Dtl10R(){
		return mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl10ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> createUpd01_Dtl10L(){
		return MCList.create(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl11ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR createUpd01_Dtl11R(){
		return mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl11ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> createUpd01_Dtl11L(){
		return MCList.create(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl12ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR createUpd01_Dtl12R(){
		return mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl12ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> createUpd01_Dtl12L(){
		return MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABS.MABSL1100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> down8;
		/** このオペレーションからの下り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> down9;
		/** このオペレーションからの下り電文パラメータの第10ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> down10;
		/** このオペレーションからの下り電文パラメータの第11ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> down11;
		/** このオペレーションからの下り電文パラメータの第12ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> down12;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM__R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB01<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_DTL__R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB01 = "SELECT_SUB01";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_DTL__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_DTL__R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_DTL__R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_DTL__R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB02<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_DTL__R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB02 = "SELECT_SUB02";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_DTL__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_DTL__R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_DTL__R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_DTL__R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB03<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_OPER_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB03 = "SELECT_SUB03";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_OPER_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_OPER_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_OPER_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_OPER_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB04<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB04 = "SELECT_SUB04";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BOM_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BOM_R> c4_down0;
		/**
		 * 連携情報 SELECT_SUB05<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt; （{@link #c5}）<br>
		 */
		public final String SELECT_SUB05 = "SELECT_SUB05";

		/**
		 * DBC連携 c5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_OPER_WK_COST_R&gt; （{@link #c5_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_WK_COST_R> c5;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_OPER_WK_COST_R> c5_down0;
		/**
		 * 連携情報 SELECT_SUB06<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STRG_R&gt; （{@link #c6}）<br>
		 */
		public final String SELECT_SUB06 = "SELECT_SUB06";

		/**
		 * DBC連携 c6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STRG_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_STRG_R&gt; （{@link #c6_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STRG_R> c6;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_STRG_R> c6_down0;
		/**
		 * 連携情報 SELECT_SUB07<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt; （{@link #c7}）<br>
		 */
		public final String SELECT_SUB07 = "SELECT_SUB07";

		/**
		 * DBC連携 c7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ALLOC_CTL_R&gt; （{@link #c7_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALLOC_CTL_R> c7;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ALLOC_CTL_R> c7_down0;
		/**
		 * 連携情報 SELECT_SUB08<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_RPL_R&gt; （{@link #c8}）<br>
		 */
		public final String SELECT_SUB08 = "SELECT_SUB08";

		/**
		 * DBC連携 c8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_RPL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_STK_RPL_R&gt; （{@link #c8_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_RPL_R> c8;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_STK_RPL_R> c8_down0;
		/**
		 * 連携情報 SELECT_SUB09<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #c9}）<br>
		 */
		public final String SELECT_SUB09 = "SELECT_SUB09";

		/**
		 * DBC連携 c9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_ITM_R&gt; （{@link #c9_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> c9;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_ITM_R> c9_down0;
		/**
		 * 連携情報 SELECT_SUB10<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_WG__R&gt; （{@link #c10}）<br>
		 */
		public final String SELECT_SUB10 = "SELECT_SUB10";

		/**
		 * DBC連携 c10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_WG__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_WG__R&gt; （{@link #c10_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_WG__R> c10;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_WG__R> c10_down0;
		/**
		 * 連携情報 SELECT_SUB11<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SITE_R&gt; （{@link #c11}）<br>
		 */
		public final String SELECT_SUB11 = "SELECT_SUB11";

		/**
		 * DBC連携 c11<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SITE_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_SITE_R&gt; （{@link #c11_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SITE_R> c11;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_SITE_R> c11_down0;
		/**
		 * 連携情報 SELECT_SUB12<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt; （{@link #c12}）<br>
		 */
		public final String SELECT_SUB12 = "SELECT_SUB12";

		/**
		 * DBC連携 c12<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_STR_LN_R&gt; （{@link #c12_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STR_LN_R> c12;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_STR_LN_R> c12_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL1100.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt1R.class);
			down2 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt2R.class);
			down3 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt3R.class);
			down4 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt4R.class);
			down5 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt5R.class);
			down6 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt6R.class);
			down7 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt7R.class);
			down8 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt8R.class);
			down9 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt9R.class);
			down10 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt10R.class);
			down11 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt11R.class);
			down12 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt12R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM__R.create("T1"));
			c1 = MCController.create(MAM_ITM_DTL__R.create("T1"));
			c2 = MCController.create(MAM_ITM_DTL__R.create("T1"));
			c3 = MCController.create(MAM_ITM_OPER_R.create("T1"));
			c4 = MCController.create(MAM_BOM_R.create("T1"));
			c5 = MCController.create(MAM_OPER_WK_COST_R.create("T1"));
			c6 = MCController.create(MAM_ITM_STRG_R.create("T1"));
			c7 = MCController.create(MAM_ALLOC_CTL_R.create("T1"));
			c8 = MCController.create(MAM_STK_RPL_R.create("T1"));
			c9 = MCController.create(MAM_BP_ITM_R.create("T1"));
			c10 = MCController.create(MAM_ITM_WG__R.create("T1"));
			c11 = MCController.create(MAM_ITM_SITE_R.create("T1"));
			c12 = MCController.create(MAM_ITM_STR_LN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM__R>)c0.down(0);
			c1_down0 = (MCList<MAM_ITM_DTL__R>)c1.down(0);
			c2_down0 = (MCList<MAM_ITM_DTL__R>)c2.down(0);
			c3_down0 = (MCList<MAM_ITM_OPER_R>)c3.down(0);
			c4_down0 = (MCList<MAM_BOM_R>)c4.down(0);
			c5_down0 = (MCList<MAM_OPER_WK_COST_R>)c5.down(0);
			c6_down0 = (MCList<MAM_ITM_STRG_R>)c6.down(0);
			c7_down0 = (MCList<MAM_ALLOC_CTL_R>)c7.down(0);
			c8_down0 = (MCList<MAM_STK_RPL_R>)c8.down(0);
			c9_down0 = (MCList<MAM_BP_ITM_R>)c9.down(0);
			c10_down0 = (MCList<MAM_ITM_WG__R>)c10.down(0);
			c11_down0 = (MCList<MAM_ITM_SITE_R>)c11.down(0);
			c12_down0 = (MCList<MAM_ITM_STR_LN_R>)c12.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB01, c1);
			appendOpe(SELECT_SUB02, c2);
			appendOpe(SELECT_SUB03, c3);
			appendOpe(SELECT_SUB04, c4);
			appendOpe(SELECT_SUB05, c5);
			appendOpe(SELECT_SUB06, c6);
			appendOpe(SELECT_SUB07, c7);
			appendOpe(SELECT_SUB08, c8);
			appendOpe(SELECT_SUB09, c9);
			appendOpe(SELECT_SUB10, c10);
			appendOpe(SELECT_SUB11, c11);
			appendOpe(SELECT_SUB12, c12);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB01<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB02<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB03<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB04<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB05<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB06<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB07<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB08<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB09<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB10<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB11<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB12<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_SUB01)) {
				up_SELECT_SUB01();
			}
			if (key.equals(SELECT_SUB02)) {
				up_SELECT_SUB02();
			}
			if (key.equals(SELECT_SUB03)) {
				up_SELECT_SUB03();
			}
			if (key.equals(SELECT_SUB04)) {
				up_SELECT_SUB04();
			}
			if (key.equals(SELECT_SUB05)) {
				up_SELECT_SUB05();
			}
			if (key.equals(SELECT_SUB06)) {
				up_SELECT_SUB06();
			}
			if (key.equals(SELECT_SUB07)) {
				up_SELECT_SUB07();
			}
			if (key.equals(SELECT_SUB08)) {
				up_SELECT_SUB08();
			}
			if (key.equals(SELECT_SUB09)) {
				up_SELECT_SUB09();
			}
			if (key.equals(SELECT_SUB10)) {
				up_SELECT_SUB10();
			}
			if (key.equals(SELECT_SUB11)) {
				up_SELECT_SUB11();
			}
			if (key.equals(SELECT_SUB12)) {
				up_SELECT_SUB12();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM__R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB01<br>
		 * MCList&lt;MAM_ITM_DTL__R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB02<br>
		 * MCList&lt;MAM_ITM_DTL__R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB03<br>
		 * MCList&lt;MAM_ITM_OPER_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB04<br>
		 * MCList&lt;MAM_BOM_R&gt;（{@link #c4_down0}）=> down4()<br>
		 * SELECT_SUB05<br>
		 * MCList&lt;MAM_OPER_WK_COST_R&gt;（{@link #c5_down0}）=> down5()<br>
		 * SELECT_SUB06<br>
		 * MCList&lt;MAM_ITM_STRG_R&gt;（{@link #c6_down0}）=> down6()<br>
		 * SELECT_SUB07<br>
		 * MCList&lt;MAM_ALLOC_CTL_R&gt;（{@link #c7_down0}）=> down7()<br>
		 * SELECT_SUB08<br>
		 * MCList&lt;MAM_STK_RPL_R&gt;（{@link #c8_down0}）=> down8()<br>
		 * SELECT_SUB09<br>
		 * MCList&lt;MAM_BP_ITM_R&gt;（{@link #c9_down0}）=> down9()<br>
		 * SELECT_SUB10<br>
		 * MCList&lt;MAM_ITM_WG__R&gt;（{@link #c10_down0}）=> down10()<br>
		 * SELECT_SUB11<br>
		 * MCList&lt;MAM_ITM_SITE_R&gt;（{@link #c11_down0}）=> down11()<br>
		 * SELECT_SUB12<br>
		 * MCList&lt;MAM_ITM_STR_LN_R&gt;（{@link #c12_down0}）=> down12()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB01)) {
				down_SELECT_SUB01(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB02)) {
				down_SELECT_SUB02(down2(), c2_down0);
			}
			if (key.equals(SELECT_SUB03)) {
				down_SELECT_SUB03(down3(), c3_down0);
			}
			if (key.equals(SELECT_SUB04)) {
				down_SELECT_SUB04(down4(), c4_down0);
			}
			if (key.equals(SELECT_SUB05)) {
				down_SELECT_SUB05(down5(), c5_down0);
			}
			if (key.equals(SELECT_SUB06)) {
				down_SELECT_SUB06(down6(), c6_down0);
			}
			if (key.equals(SELECT_SUB07)) {
				down_SELECT_SUB07(down7(), c7_down0);
			}
			if (key.equals(SELECT_SUB08)) {
				down_SELECT_SUB08(down8(), c8_down0);
			}
			if (key.equals(SELECT_SUB09)) {
				down_SELECT_SUB09(down9(), c9_down0);
			}
			if (key.equals(SELECT_SUB10)) {
				down_SELECT_SUB10(down10(), c10_down0);
			}
			if (key.equals(SELECT_SUB11)) {
				down_SELECT_SUB11(down11(), c11_down0);
			}
			if (key.equals(SELECT_SUB12)) {
				down_SELECT_SUB12(down12(), c12_down0);
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
			if (i == 7) return down7();
			if (i == 8) return down8();
			if (i == 9) return down9();
			if (i == 10) return down10();
			if (i == 11) return down11();
			if (i == 12) return down12();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_MfgItmReg)MABSL_MfgItmReg_MC_A.this);
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
			down8().clear();
			down9().clear();
			down10().clear();
			down11().clear();
			down12().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL1100.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt0R createSrch01_Rslt0R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.create();
		}

		/**
		 * Srch01_Rslt0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> createSrch01_Rslt0L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt5R.class);
		}

		/**
		 * Srch01_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt6R createSrch01_Rslt6R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt6R.create();
		}

		/**
		 * Srch01_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> createSrch01_Rslt6L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt6R.class);
		}

		/**
		 * Srch01_Rslt7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt7R createSrch01_Rslt7R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt7R.create();
		}

		/**
		 * Srch01_Rslt7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> createSrch01_Rslt7L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt7R.class);
		}

		/**
		 * Srch01_Rslt8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt8R createSrch01_Rslt8R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt8R.create();
		}

		/**
		 * Srch01_Rslt8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> createSrch01_Rslt8L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt8R.class);
		}

		/**
		 * Srch01_Rslt9ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt9R createSrch01_Rslt9R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt9R.create();
		}

		/**
		 * Srch01_Rslt9ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> createSrch01_Rslt9L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt9R.class);
		}

		/**
		 * Srch01_Rslt10ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt10R createSrch01_Rslt10R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt10R.create();
		}

		/**
		 * Srch01_Rslt10ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> createSrch01_Rslt10L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt10R.class);
		}

		/**
		 * Srch01_Rslt11ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt11R createSrch01_Rslt11R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt11R.create();
		}

		/**
		 * Srch01_Rslt11ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> createSrch01_Rslt11L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt11R.class);
		}

		/**
		 * Srch01_Rslt12ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt12R createSrch01_Rslt12R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt12R.create();
		}

		/**
		 * Srch01_Rslt12ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> createSrch01_Rslt12L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt12R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL1100.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>ln_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rec_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>no_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty2</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>in_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>buf_qty</td></tr>
		 * 	<tr><td><br></td><td>rord_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>rord_rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_sizing_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> down8() {
			return down8;
		}

		/**
		 * 下り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> down9() {
			return down9;
		}

		/**
		 * 下り電文の第10ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第10ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_wg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_mst</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_mst_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_wg</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_mst</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_mst_nm</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_wg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_mst</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_mst_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_wg</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_mst</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_mst_nm</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons_wg</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons_mst</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days_wg</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days_mst</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days_wg</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days_mst</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days_wg</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days_mst</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty_mst</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>sch_tgt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> down10() {
			return down10;
		}

		/**
		 * 下り電文の第11ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第11ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>ntfy_nm</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>so_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> down11() {
			return down11;
		}

		/**
		 * 下り電文の第12ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第12ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> down12() {
			return down12;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MfgItmReg)MABSL_MfgItmReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_SUB01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB01(){
		}
		//-----------------------SELECT_SUB02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB02(){
		}
		//-----------------------SELECT_SUB03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB03(){
		}
		//-----------------------SELECT_SUB04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB04(){
		}
		//-----------------------SELECT_SUB05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB05(){
		}
		//-----------------------SELECT_SUB06専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB06の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB06(){
		}
		//-----------------------SELECT_SUB07専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB07の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB07(){
		}
		//-----------------------SELECT_SUB08専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB08の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB08(){
		}
		//-----------------------SELECT_SUB09専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB09の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB09(){
		}
		//-----------------------SELECT_SUB10専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB10の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB10(){
		}
		//-----------------------SELECT_SUB11専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB11の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB11(){
		}
		//-----------------------SELECT_SUB12専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB12の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB12(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> dest_Srch01_Rslt0, MCList<MAM_ITM__R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt0, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("def_mfg_aprv_flg", "def_mfg_aprv_flg");
				addColumnPathMap("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_dest, MAM_ITM__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> dest, MCList<MAM_ITM__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM__R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB01(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ITM_DTL__R> src0_0){
			down_SELECT_SUB01_c1_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB01_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB01_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB01_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB01_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB01_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_loc_nm", "mfg_loc_nm");
				addColumnPathMap("loc_sppl_cd", "loc_sppl_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("mfg_lt", "mfg_lt");
				addColumnPathMap("mfg_lt_add_qty", "mfg_lt_add_qty");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("purc_basis_typ_nm", "purc_basis_typ_nm");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("lot_issue_typ", "lot_issue_typ");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("ln_stk_flg", "ln_stk_flg");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("inst_rec_issue_flg", "inst_rec_issue_flg");
				addColumnPathMap("no_mfg_aprv_flg", "no_mfg_aprv_flg");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("rqst_wg_nm", "rqst_wg_nm");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_nm1", "rsrc_nm1");
				addColumnPathMap("rsrc_std_qty1", "rsrc_std_qty1");
				addColumnPathMap("rsrc_unit_qty1", "rsrc_unit_qty1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("rsrc_nm2", "rsrc_nm2");
				addColumnPathMap("rsrc_std_qty2", "rsrc_std_qty2");
				addColumnPathMap("rsrc_unit_qty2", "rsrc_unit_qty2");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB01_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB01_c1_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt1R r_dest, MAM_ITM_DTL__R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB01_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB01_c1_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt1R> dest, MCList<MAM_ITM_DTL__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB01_c1_0();
			for(MAM_ITM_DTL__R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB01_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB02(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_ITM_DTL__R> src0_0){
			down_SELECT_SUB02_c2_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB02_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB02_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB02_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB02_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB02_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("rqst_loc_nm", "rqst_loc_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB02_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB02_c2_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt2R r_dest, MAM_ITM_DTL__R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB02_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB02_c2_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt2R> dest, MCList<MAM_ITM_DTL__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB02_c2_0();
			for(MAM_ITM_DTL__R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB02_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB03(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_ITM_OPER_R> src0_0){
			down_SELECT_SUB03_c3_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB03_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB03_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB03_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB03_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB03_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_lt", "oper_lt");
				addColumnPathMap("oper_lt_add_qty", "oper_lt_add_qty");
				addColumnPathMap("oper_offst_typ", "oper_offst_typ");
				addColumnPathMap("oper_offst", "oper_offst");
				addColumnPathMap("oper_offst_add_qty", "oper_offst_add_qty");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_unit_nm", "oper_unit_nm");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("unit_conv_rnd_typ", "unit_conv_rnd_typ");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("oper_loc_nm", "oper_loc_nm");
				addColumnPathMap("lmt_fr_dt_flg", "lmt_fr_dt_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("wip_rate", "wip_rate");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB03_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB03_c3_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt3R r_dest, MAM_ITM_OPER_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB03_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB03_c3_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt3R> dest, MCList<MAM_ITM_OPER_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB03_c3_0();
			for(MAM_ITM_OPER_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB03_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB04(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_BOM_R> src0_0){
			down_SELECT_SUB04_c4_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB04_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB04_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB04_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB04_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB04_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("chd_itm_typ", "chd_itm_typ");
				addColumnPathMap("chd_itm_typ_d_cd", "chd_itm_typ_d_cd");
				addColumnPathMap("chd_itm_typ_d_nm", "chd_itm_typ_d_nm");
				addColumnPathMap("chd_stk_mng_typ", "chd_stk_mng_typ");
				addColumnPathMap("chd_asset_mng_typ", "chd_asset_mng_typ");
				addColumnPathMap("chd_base_unit_cd", "chd_base_unit_cd");
				addColumnPathMap("chd_base_unit_nm", "chd_base_unit_nm");
				addColumnPathMap("chd_dec_place", "chd_dec_place");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("chd_sno1_mng_typ", "chd_sno1_mng_typ");
				addColumnPathMap("chd_sno2_mng_typ", "chd_sno2_mng_typ");
				addColumnPathMap("chd_sno3_mng_typ", "chd_sno3_mng_typ");
				addColumnPathMap("chd_sno4_mng_typ", "chd_sno4_mng_typ");
				addColumnPathMap("chd_def_bom_ptn", "chd_def_bom_ptn");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB04_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB04_c4_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt4R r_dest, MAM_BOM_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB04_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB04_c4_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt4R> dest, MCList<MAM_BOM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB04_c4_0();
			for(MAM_BOM_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB04_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB05専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB05の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB05(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_OPER_WK_COST_R> src0_0){
			down_SELECT_SUB05_c5_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB05_c5の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB05_c5_0() {
			MCRowMapper map = new Map_down_SELECT_SUB05_c5_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB05_c5の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB05_c5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_unit_dec_place", "wk_cost_unit_dec_place");
				addColumnPathMap("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB05_c5の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB05_c5_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt5R r_dest, MAM_OPER_WK_COST_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB05_c5の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB05_c5_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt5R> dest, MCList<MAM_OPER_WK_COST_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB05_c5_0();
			for(MAM_OPER_WK_COST_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB05_c5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB06専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB06の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB06(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> dest_Srch01_Rslt6, MCList<MAM_ITM_STRG_R> src0_0){
			down_SELECT_SUB06_c6_0(dest_Srch01_Rslt6, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB06_c6の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB06_c6_0() {
			MCRowMapper map = new Map_down_SELECT_SUB06_c6_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB06_c6の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB06_c6_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB06_c6の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB06_c6_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt6R r_dest, MAM_ITM_STRG_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB06_c6の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB06_c6_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt6R> dest, MCList<MAM_ITM_STRG_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB06_c6_0();
			for(MAM_ITM_STRG_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt6R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB06_c6_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB07専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB07の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB07(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> dest_Srch01_Rslt7, MCList<MAM_ALLOC_CTL_R> src0_0){
			down_SELECT_SUB07_c7_0(dest_Srch01_Rslt7, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB07_c7の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB07_c7_0() {
			MCRowMapper map = new Map_down_SELECT_SUB07_c7_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB07_c7の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB07_c7_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_loc_cd", "to_loc_cd");
				addColumnPathMap("to_loc_nm", "to_loc_nm");
				addColumnPathMap("to_wg_cd", "to_wg_cd");
				addColumnPathMap("to_wg_nm", "to_wg_nm");
				addColumnPathMap("to_lg_grp_cd", "to_lg_grp_cd");
				addColumnPathMap("fr_loc_cd", "fr_loc_cd");
				addColumnPathMap("fr_loc_nm", "fr_loc_nm");
				addColumnPathMap("fr_wg_cd", "fr_wg_cd");
				addColumnPathMap("fr_lg_grp_cd", "fr_lg_grp_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("xfr_lot_unit_qty", "xfr_lot_unit_qty");
				addColumnPathMap("in_loc_flg", "in_loc_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB07_c7の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB07_c7_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt7R r_dest, MAM_ALLOC_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB07_c7の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB07_c7_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt7R> dest, MCList<MAM_ALLOC_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB07_c7_0();
			for(MAM_ALLOC_CTL_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt7R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB07_c7_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB08専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB08の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB08(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> dest_Srch01_Rslt8, MCList<MAM_STK_RPL_R> src0_0){
			down_SELECT_SUB08_c8_0(dest_Srch01_Rslt8, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB08_c8の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB08_c8_0() {
			MCRowMapper map = new Map_down_SELECT_SUB08_c8_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB08_c8の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB08_c8_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_qty", "buf_qty");
				addColumnPathMap("rord_stk_qty", "rord_stk_qty");
				addColumnPathMap("gi_schd_flg", "gi_schd_flg");
				addColumnPathMap("rord_rqst_qty", "rord_rqst_qty");
				addColumnPathMap("lot_sizing_flg", "lot_sizing_flg");
				addColumnPathMap("gi_loc_cd", "gi_loc_cd");
				addColumnPathMap("gi_loc_nm", "gi_loc_nm");
				addColumnPathMap("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg");
				addColumnPathMap("gi_str_ln_cd", "gi_str_ln_cd");
				addColumnPathMap("gi_str_ln_nm", "gi_str_ln_nm");
				addColumnPathMap("inpt_gi_loc_cd", "inpt_gi_loc_cd");
				addColumnPathMap("inpt_gi_loc_nm", "inpt_gi_loc_nm");
				addColumnPathMap("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg");
				addColumnPathMap("inpt_gi_str_ln_cd", "inpt_gi_str_ln_cd");
				addColumnPathMap("inpt_gi_str_ln_nm", "inpt_gi_str_ln_nm");
				addColumnPathMap("ship_gi_loc_cd", "ship_gi_loc_cd");
				addColumnPathMap("ship_gi_loc_nm", "ship_gi_loc_nm");
				addColumnPathMap("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg");
				addColumnPathMap("ship_gi_str_ln_cd", "ship_gi_str_ln_cd");
				addColumnPathMap("ship_gi_str_ln_nm", "ship_gi_str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB08_c8の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB08_c8_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt8R r_dest, MAM_STK_RPL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB08_c8の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB08_c8_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt8R> dest, MCList<MAM_STK_RPL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB08_c8_0();
			for(MAM_STK_RPL_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt8R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB08_c8_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB09専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB09の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB09(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> dest_Srch01_Rslt9, MCList<MAM_BP_ITM_R> src0_0){
			down_SELECT_SUB09_c9_0(dest_Srch01_Rslt9, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB09_c9の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB09_c9_0() {
			MCRowMapper map = new Map_down_SELECT_SUB09_c9_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB09_c9の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB09_c9_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB09_c9の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB09_c9_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt9R r_dest, MAM_BP_ITM_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB09_c9の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB09_c9_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt9R> dest, MCList<MAM_BP_ITM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB09_c9_0();
			for(MAM_BP_ITM_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt9R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB09_c9_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB10専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB10の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB10(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> dest_Srch01_Rslt10, MCList<MAM_ITM_WG__R> src0_0){
			down_SELECT_SUB10_c10_0(dest_Srch01_Rslt10, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB10_c10の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB10_c10_0() {
			MCRowMapper map = new Map_down_SELECT_SUB10_c10_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB10_c10の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB10_c10_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("mfg_inst_unit_typ_wg", "mfg_inst_unit_typ_wg");
				addColumnPathMap("mfg_inst_unit_typ_mst", "mfg_inst_unit_typ_mst");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ_wg", "mrp_proc_typ_wg");
				addColumnPathMap("mrp_proc_typ_mst", "mrp_proc_typ_mst");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ_wg", "rqmt_typ_wg");
				addColumnPathMap("rqmt_typ_mst", "rqmt_typ_mst");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ_wg", "prod_pln_typ_wg");
				addColumnPathMap("prod_pln_typ_mst", "prod_pln_typ_mst");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons_wg", "dmnd_date_div_mons_wg");
				addColumnPathMap("dmnd_date_div_mons_mst", "dmnd_date_div_mons_mst");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days_wg", "alloc_margin_days_wg");
				addColumnPathMap("alloc_margin_days_mst", "alloc_margin_days_mst");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days_wg", "mrp_alloc_margin_days_wg");
				addColumnPathMap("mrp_alloc_margin_days_mst", "mrp_alloc_margin_days_mst");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days_wg", "mrp_opn_xfr_days_wg");
				addColumnPathMap("mrp_opn_xfr_days_mst", "mrp_opn_xfr_days_mst");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty_mst", "rqmt_rstr_qty_mst");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_add_typ", "inpt_itm_add_typ");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("inpt_itm_del_typ", "inpt_itm_del_typ");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("sch_tgt_typ", "sch_tgt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB10_c10の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB10_c10_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt10R r_dest, MAM_ITM_WG__R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB10_c10の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB10_c10_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt10R> dest, MCList<MAM_ITM_WG__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB10_c10_0();
			for(MAM_ITM_WG__R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt10R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB10_c10_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB11専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB11の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB11(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> dest_Srch01_Rslt11, MCList<MAM_ITM_SITE_R> src0_0){
			down_SELECT_SUB11_c11_0(dest_Srch01_Rslt11, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB11_c11の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB11_c11_0() {
			MCRowMapper map = new Map_down_SELECT_SUB11_c11_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB11_c11の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB11_c11_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("ntfy_nm", "ntfy_nm");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("plnt_aprv_flg", "plnt_aprv_flg");
				addColumnPathMap("plnt_aprv_role_cd", "plnt_aprv_role_cd");
				addColumnPathMap("plnt_aprv_role_nm", "plnt_aprv_role_nm");
				addColumnPathMap("insp_aprv_flg", "insp_aprv_flg");
				addColumnPathMap("insp_aprv_role_cd", "insp_aprv_role_cd");
				addColumnPathMap("insp_aprv_role_nm", "insp_aprv_role_nm");
				addColumnPathMap("mfg_aprv_flg", "mfg_aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("mfg_aprv_role_nm", "mfg_aprv_role_nm");
				addColumnPathMap("xfr_lot_flg", "xfr_lot_flg");
				addColumnPathMap("so_prmt_insp_flg", "so_prmt_insp_flg");
				addColumnPathMap("in_prmt_insp_flg", "in_prmt_insp_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB11_c11の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB11_c11_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt11R r_dest, MAM_ITM_SITE_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB11_c11の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB11_c11_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt11R> dest, MCList<MAM_ITM_SITE_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB11_c11_0();
			for(MAM_ITM_SITE_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt11R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB11_c11_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB12専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB12の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB12(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> dest_Srch01_Rslt12, MCList<MAM_ITM_STR_LN_R> src0_0){
			down_SELECT_SUB12_c12_0(dest_Srch01_Rslt12, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB12_c12の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB12_c12_0() {
			MCRowMapper map = new Map_down_SELECT_SUB12_c12_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB12_c12の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB12_c12_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB12_c12の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB12_c12_0(mcframe.serverMABS.MABSL1100.Srch01_Rslt12R r_dest, MAM_ITM_STR_LN_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB12_c12の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB12_c12_0(MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt12R> dest, MCList<MAM_ITM_STR_LN_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB12_c12_0();
			for(MAM_ITM_STR_LN_R r_src : src){
				mcframe.serverMABS.MABSL1100.Srch01_Rslt12R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB12_c12_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
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
		private final MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> up6;
		/** このオペレーションへの上り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> up7;
		/** このオペレーションへの上り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> up8;
		/** このオペレーションへの上り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up9;
		/** このオペレーションへの上り電文パラメータの第10ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> up10;
		/** このオペレーションへの上り電文パラメータの第11ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> up11;
		/** このオペレーションへの上り電文パラメータの第12ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> up12;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> chkMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.ItmOper_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.OperWkCost_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE06<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_UpdChk01 （{@link #chk06}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_Upd01 （{@link #upd06}）<br>
		 */
		public final String CALL_OPE06 = "CALL_OPE06";

		/**
		 * 連携オペレーション chk06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_UpdChk01 chk06;
		/**
		 * 連携オペレーション upd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.ItmStrg_Upd01 upd06;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> chk06_up0;
		public final MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> upd06_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE07<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_UpdChk01 （{@link #chk07}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_Upd01 （{@link #upd07}）<br>
		 */
		public final String CALL_OPE07 = "CALL_OPE07";

		/**
		 * 連携オペレーション chk07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_UpdChk01 chk07;
		/**
		 * 連携オペレーション upd07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.AllocCtl_Upd01 upd07;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> chk07_up0;
		public final MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> upd07_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE08<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_UpdChk01 （{@link #chk08}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_Upd01 （{@link #upd08}）<br>
		 */
		public final String CALL_OPE08 = "CALL_OPE08";

		/**
		 * 連携オペレーション chk08<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR&gt; （{@link #chk08_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_UpdChk01 chk08;
		/**
		 * 連携オペレーション upd08<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR&gt; （{@link #upd08_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.StkRpl_Upd01 upd08;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> chk08_up0;
		public final MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> upd08_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE09<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 （{@link #chk09}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 （{@link #upd09}）<br>
		 */
		public final String CALL_OPE09 = "CALL_OPE09";

		/**
		 * 連携オペレーション chk09<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk09_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 chk09;
		/**
		 * 連携オペレーション upd09<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd09_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 upd09;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> chk09_up0;
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> upd09_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE10<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_UpdChk01 （{@link #chk10}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_Upd01 （{@link #upd10}）<br>
		 */
		public final String CALL_OPE10 = "CALL_OPE10";

		/**
		 * 連携オペレーション chk10<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR&gt; （{@link #chk10_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_UpdChk01 chk10;
		/**
		 * 連携オペレーション upd10<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR&gt; （{@link #upd10_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.ItmWg_Upd01 upd10;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> chk10_up0;
		public final MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> upd10_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE11<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_UpdChk01 （{@link #chk11}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_Upd01 （{@link #upd11}）<br>
		 */
		public final String CALL_OPE11 = "CALL_OPE11";

		/**
		 * 連携オペレーション chk11<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR&gt; （{@link #chk11_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_UpdChk01 chk11;
		/**
		 * 連携オペレーション upd11<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR&gt; （{@link #upd11_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.ItmSite_Upd01 upd11;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> chk11_up0;
		public final MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> upd11_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE12<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01 （{@link #chk12}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01 （{@link #upd12}）<br>
		 */
		public final String CALL_OPE12 = "CALL_OPE12";

		/**
		 * 連携オペレーション chk12<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #chk12_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01 chk12;
		/**
		 * 連携オペレーション upd12<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #upd12_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01 upd12;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> chk12_up0;
		public final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> upd12_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
			up5 = MCList.create(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR.class);
			up6 = MCList.create(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR.class);
			up7 = MCList.create(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR.class);
			up8 = MCList.create(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR.class);
			up9 = MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
			up10 = MCList.create(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR.class);
			up11 = MCList.create(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR.class);
			up12 = MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chk01 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_Upd01();
			chk02 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_Upd01();
			chk03 = mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.crtItmOper_UpdChk01();
			upd03 = mcframe.serverMABS.MABSL0090.MABSL_ItmOperReg.crtItmOper_Upd01();
			chk04 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_UpdChk01();
			upd04 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_Upd01();
			chk05 = mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.crtOperWkCost_UpdChk01();
			upd05 = mcframe.serverMABS.MABSL0110.MABSL_OperWkCostReg.crtOperWkCost_Upd01();
			chk06 = mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.crtItmStrg_UpdChk01();
			upd06 = mcframe.serverMABS.MABSL0150.MABSL_ItmStrgReg.crtItmStrg_Upd01();
			chk07 = mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.crtAllocCtl_UpdChk01();
			upd07 = mcframe.serverMABS.MABSL0780.MABSL_AllocCtlReg.crtAllocCtl_Upd01();
			chk08 = mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.crtStkRpl_UpdChk01();
			upd08 = mcframe.serverMABS.MABSL0800.MABSL_StkRplReg.crtStkRpl_Upd01();
			chk09 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_UpdChk01();
			upd09 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_Upd01();
			chk10 = mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.crtItmWg_UpdChk01();
			upd10 = mcframe.serverMABS.MABSL0340.MABSL_ItmWgReg.crtItmWg_Upd01();
			chk11 = mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.crtItmSite_UpdChk01();
			upd11 = mcframe.serverMABS.MABSL0350.MABSL_ItmSiteReg.crtItmSite_Upd01();
			chk12 = mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.crtItmStrLn_UpdChk01();
			upd12 = mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.crtItmStrLn_Upd01();
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COM_R>)chkMaster.up(1);
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR>)upd05.up(0);
			chk06_up0 = (MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR>)chk06.up(0);
			upd06_up0 = (MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR>)upd06.up(0);
			chk07_up0 = (MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR>)chk07.up(0);
			upd07_up0 = (MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR>)upd07.up(0);
			chk08_up0 = (MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR>)chk08.up(0);
			upd08_up0 = (MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR>)upd08.up(0);
			chk09_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)chk09.up(0);
			upd09_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)upd09.up(0);
			chk10_up0 = (MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR>)chk10.up(0);
			upd10_up0 = (MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR>)upd10.up(0);
			chk11_up0 = (MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR>)chk11.up(0);
			upd11_up0 = (MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR>)upd11.up(0);
			chk12_up0 = (MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR>)chk12.up(0);
			upd12_up0 = (MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR>)upd12.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
			appendOpe(CALL_OPE05, chk05);
			appendOpe(CALL_OPE05, upd05);
			appendOpe(CALL_OPE06, chk06);
			appendOpe(CALL_OPE06, upd06);
			appendOpe(CALL_OPE07, chk07);
			appendOpe(CALL_OPE07, upd07);
			appendOpe(CALL_OPE08, chk08);
			appendOpe(CALL_OPE08, upd08);
			appendOpe(CALL_OPE09, chk09);
			appendOpe(CALL_OPE09, upd09);
			appendOpe(CALL_OPE10, chk10);
			appendOpe(CALL_OPE10, upd10);
			appendOpe(CALL_OPE11, chk11);
			appendOpe(CALL_OPE11, upd11);
			appendOpe(CALL_OPE12, chk12);
			appendOpe(CALL_OPE12, upd12);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 * CALL_OPE01<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 * CALL_OPE06<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 * CALL_OPE07<br>
		 * up7() => MCList&lt;mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 * up7() => MCList&lt;mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 * CALL_OPE08<br>
		 * up8() => MCList&lt;mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR&gt; （{@link #chk08_up0}）<br>
		 * up8() => MCList&lt;mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR&gt; （{@link #upd08_up0}）<br>
		 * CALL_OPE09<br>
		 * up9() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk09_up0}）<br>
		 * up9() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd09_up0}）<br>
		 * CALL_OPE10<br>
		 * up10() => MCList&lt;mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR&gt; （{@link #chk10_up0}）<br>
		 * up10() => MCList&lt;mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR&gt; （{@link #upd10_up0}）<br>
		 * CALL_OPE11<br>
		 * up11() => MCList&lt;mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR&gt; （{@link #chk11_up0}）<br>
		 * up11() => MCList&lt;mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR&gt; （{@link #upd11_up0}）<br>
		 * CALL_OPE12<br>
		 * up12() => MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #chk12_up0}）<br>
		 * up12() => MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #upd12_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up1());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up2());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up3());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up4());
			}
			if (key.equals(CALL_OPE05)) {
				up_CALL_OPE05(chk05_up0, upd05_up0, up5());
			}
			if (key.equals(CALL_OPE06)) {
				up_CALL_OPE06(chk06_up0, upd06_up0, up6());
			}
			if (key.equals(CALL_OPE07)) {
				up_CALL_OPE07(chk07_up0, upd07_up0, up7());
			}
			if (key.equals(CALL_OPE08)) {
				up_CALL_OPE08(chk08_up0, upd08_up0, up8());
			}
			if (key.equals(CALL_OPE09)) {
				up_CALL_OPE09(chk09_up0, upd09_up0, up9());
			}
			if (key.equals(CALL_OPE10)) {
				up_CALL_OPE10(chk10_up0, upd10_up0, up10());
			}
			if (key.equals(CALL_OPE11)) {
				up_CALL_OPE11(chk11_up0, upd11_up0, up11());
			}
			if (key.equals(CALL_OPE12)) {
				up_CALL_OPE12(chk12_up0, upd12_up0, up12());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE04<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE05<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE06<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE07<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE08<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE09<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE10<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE11<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE12<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
			if (key.equals(CALL_OPE05)) {
				down_CALL_OPE05();
			}
			if (key.equals(CALL_OPE06)) {
				down_CALL_OPE06();
			}
			if (key.equals(CALL_OPE07)) {
				down_CALL_OPE07();
			}
			if (key.equals(CALL_OPE08)) {
				down_CALL_OPE08();
			}
			if (key.equals(CALL_OPE09)) {
				down_CALL_OPE09();
			}
			if (key.equals(CALL_OPE10)) {
				down_CALL_OPE10();
			}
			if (key.equals(CALL_OPE11)) {
				down_CALL_OPE11();
			}
			if (key.equals(CALL_OPE12)) {
				down_CALL_OPE12();
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
			if (i == 9) return up9();
			if (i == 10) return up10();
			if (i == 11) return up11();
			if (i == 12) return up12();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_MfgItmReg)MABSL_MfgItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl0ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1100.Srch01_Rslt0R createUpd01_Dtl0R(){
			return mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.create();
		}

		/**
		 * Upd01_Dtl0ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> createUpd01_Dtl0L(){
			return MCList.create(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R.class);
		}

		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR createUpd01_Dtl6R(){
			return mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> createUpd01_Dtl6L(){
			return MCList.create(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR createUpd01_Dtl7R(){
			return mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> createUpd01_Dtl7L(){
			return MCList.create(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR createUpd01_Dtl8R(){
			return mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> createUpd01_Dtl8L(){
			return MCList.create(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl9ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl9R(){
			return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl9ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl9L(){
			return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl10ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR createUpd01_Dtl10R(){
			return mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl10ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> createUpd01_Dtl10L(){
			return MCList.create(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl11ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR createUpd01_Dtl11R(){
			return mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl11ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> createUpd01_Dtl11L(){
			return MCList.create(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl12ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR createUpd01_Dtl12R(){
			return mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl12ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> createUpd01_Dtl12L(){
			return MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> up0() {
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
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>ln_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rec_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>no_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_std_qty2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_qty2</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
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
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> up6() {
			return up6;
		}

		/**
		 * 上り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>in_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> up7() {
			return up7;
		}

		/**
		 * 上り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>buf_qty</td></tr>
		 * 	<tr><td><br></td><td>rord_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>rord_rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_sizing_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> up8() {
			return up8;
		}

		/**
		 * 上り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up9() {
			return up9;
		}

		/**
		 * 上り電文の第10ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第10ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_typ</td></tr>
		 * 	<tr><td><br></td><td>sch_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> up10() {
			return up10;
		}

		/**
		 * 上り電文の第11ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第11ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>ntfy_nm</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>so_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> up11() {
			return up11;
		}

		/**
		 * 上り電文の第12ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第12ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> up12() {
			return up12;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MfgItmReg)MABSL_MfgItmReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> src_Upd01_Dtl0){
			up_UPDATE_updMaster_0(dest0_0, src_Upd01_Dtl0);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> src_Upd01_Dtl0){
			up_MAIN_chkMaster_0(dest0_0, src_Upd01_Dtl0);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABS.MABSL1100.Srch01_Rslt0R> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL1100.Srch01_Rslt0R r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("mfg_lt", "mfg_lt");
				addColumnPathMap("mfg_lt_add_qty", "mfg_lt_add_qty");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("lot_issue_typ", "lot_issue_typ");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("ln_stk_flg", "ln_stk_flg");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("inst_rec_issue_flg", "inst_rec_issue_flg");
				addColumnPathMap("no_mfg_aprv_flg", "no_mfg_aprv_flg");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("rsrc_std_qty1", "rsrc_std_qty1");
				addColumnPathMap("rsrc_unit_qty1", "rsrc_unit_qty1");
				addColumnPathMap("rsrc_std_qty2", "rsrc_std_qty2");
				addColumnPathMap("rsrc_unit_qty2", "rsrc_unit_qty2");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("mfg_lt", "mfg_lt");
				addColumnPathMap("mfg_lt_add_qty", "mfg_lt_add_qty");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("lot_issue_typ", "lot_issue_typ");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("ln_stk_flg", "ln_stk_flg");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("inst_rec_issue_flg", "inst_rec_issue_flg");
				addColumnPathMap("no_mfg_aprv_flg", "no_mfg_aprv_flg");
				addColumnPathMap("itm_lower_yield", "itm_lower_yield");
				addColumnPathMap("itm_std_yield", "itm_std_yield");
				addColumnPathMap("itm_upper_yield", "itm_upper_yield");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("rsrc_std_qty1", "rsrc_std_qty1");
				addColumnPathMap("rsrc_unit_qty1", "rsrc_unit_qty1");
				addColumnPathMap("rsrc_std_qty2", "rsrc_std_qty2");
				addColumnPathMap("rsrc_unit_qty2", "rsrc_unit_qty2");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_lt", "oper_lt");
				addColumnPathMap("oper_lt_add_qty", "oper_lt_add_qty");
				addColumnPathMap("oper_offst_typ", "oper_offst_typ");
				addColumnPathMap("oper_offst", "oper_offst");
				addColumnPathMap("oper_offst_add_qty", "oper_offst_add_qty");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("unit_conv_rnd_typ", "unit_conv_rnd_typ");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("lmt_fr_dt_flg", "lmt_fr_dt_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("wip_rate", "wip_rate");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_lt", "oper_lt");
				addColumnPathMap("oper_lt_add_qty", "oper_lt_add_qty");
				addColumnPathMap("oper_offst_typ", "oper_offst_typ");
				addColumnPathMap("oper_offst", "oper_offst");
				addColumnPathMap("oper_offst_add_qty", "oper_offst_add_qty");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("unit_conv_rnd_typ", "unit_conv_rnd_typ");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
				addColumnPathMap("oper_inst_grp", "oper_inst_grp");
				addColumnPathMap("oper_loc_cd", "oper_loc_cd");
				addColumnPathMap("lmt_fr_dt_flg", "lmt_fr_dt_flg");
				addColumnPathMap("oper_lower_yield", "oper_lower_yield");
				addColumnPathMap("oper_std_yield", "oper_std_yield");
				addColumnPathMap("oper_upper_yield", "oper_upper_yield");
				addColumnPathMap("wip_rate", "wip_rate");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0090.ItmOper_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src_Upd01_Dtl4){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl4);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl4);
		}
		
		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_chk04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_chk04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_upd04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_upd04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> src_Upd01_Dtl5){
			up_CALL_OPE05_chk05_0(dest0_0, src_Upd01_Dtl5);
			up_CALL_OPE05_upd05_0(dest1_0, src_Upd01_Dtl5);
		}
		
		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_chk05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_chk05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_chk05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_upd05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_upd05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_upd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0110.OperWkCost_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE06専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE06の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE06(MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> src_Upd01_Dtl6){
			up_CALL_OPE06_chk06_0(dest0_0, src_Upd01_Dtl6);
			up_CALL_OPE06_upd06_0(dest1_0, src_Upd01_Dtl6);
		}
		
		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_chk06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_chk06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_chk06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_chk06_0(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_chk06_0(MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_chk06_0();
			for(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_chk06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_upd06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_upd06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_upd06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_upd06_0(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_upd06_0(MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_upd06_0();
			for(mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0150.ItmStrg_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_upd06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE07専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE07の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE07(MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> src_Upd01_Dtl7){
			up_CALL_OPE07_chk07_0(dest0_0, src_Upd01_Dtl7);
			up_CALL_OPE07_upd07_0(dest1_0, src_Upd01_Dtl7);
		}
		
		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE07_chk07_0() {
			MCRowMapper map = new Map_up_CALL_OPE07_chk07_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE07_chk07_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_loc_cd", "to_loc_cd");
				addColumnPathMap("fr_loc_cd", "fr_loc_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("xfr_lot_unit_qty", "xfr_lot_unit_qty");
				addColumnPathMap("in_loc_flg", "in_loc_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_chk07_0(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_chk07_0(MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_chk07_0();
			for(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE07_chk07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE07_upd07_0() {
			MCRowMapper map = new Map_up_CALL_OPE07_upd07_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE07_upd07_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_loc_cd", "to_loc_cd");
				addColumnPathMap("fr_loc_cd", "fr_loc_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("xfr_lot_unit_qty", "xfr_lot_unit_qty");
				addColumnPathMap("in_loc_flg", "in_loc_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_upd07_0(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_upd07_0(MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_upd07_0();
			for(mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0780.AllocCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE07_upd07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE08専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE08の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE08(MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> src_Upd01_Dtl8){
			up_CALL_OPE08_chk08_0(dest0_0, src_Upd01_Dtl8);
			up_CALL_OPE08_upd08_0(dest1_0, src_Upd01_Dtl8);
		}
		
		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE08_chk08_0() {
			MCRowMapper map = new Map_up_CALL_OPE08_chk08_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE08_chk08_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_qty", "buf_qty");
				addColumnPathMap("rord_stk_qty", "rord_stk_qty");
				addColumnPathMap("gi_schd_flg", "gi_schd_flg");
				addColumnPathMap("rord_rqst_qty", "rord_rqst_qty");
				addColumnPathMap("lot_sizing_flg", "lot_sizing_flg");
				addColumnPathMap("gi_loc_cd", "gi_loc_cd");
				addColumnPathMap("gi_str_ln_cd", "gi_str_ln_cd");
				addColumnPathMap("inpt_gi_loc_cd", "inpt_gi_loc_cd");
				addColumnPathMap("inpt_gi_str_ln_cd", "inpt_gi_str_ln_cd");
				addColumnPathMap("ship_gi_loc_cd", "ship_gi_loc_cd");
				addColumnPathMap("ship_gi_str_ln_cd", "ship_gi_str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE08_chk08_0(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE08_chk08_0(MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE08_chk08_0();
			for(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE08_chk08_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE08_upd08_0() {
			MCRowMapper map = new Map_up_CALL_OPE08_upd08_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE08_upd08_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("buf_qty", "buf_qty");
				addColumnPathMap("rord_stk_qty", "rord_stk_qty");
				addColumnPathMap("gi_schd_flg", "gi_schd_flg");
				addColumnPathMap("rord_rqst_qty", "rord_rqst_qty");
				addColumnPathMap("lot_sizing_flg", "lot_sizing_flg");
				addColumnPathMap("gi_loc_cd", "gi_loc_cd");
				addColumnPathMap("gi_str_ln_cd", "gi_str_ln_cd");
				addColumnPathMap("inpt_gi_loc_cd", "inpt_gi_loc_cd");
				addColumnPathMap("inpt_gi_str_ln_cd", "inpt_gi_str_ln_cd");
				addColumnPathMap("ship_gi_loc_cd", "ship_gi_loc_cd");
				addColumnPathMap("ship_gi_str_ln_cd", "ship_gi_str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE08_upd08_0(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE08_upd08_0(MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE08_upd08_0();
			for(mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0800.StkRpl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE08_upd08_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE09専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE09の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE09(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src_Upd01_Dtl9){
			up_CALL_OPE09_chk09_0(dest0_0, src_Upd01_Dtl9);
			up_CALL_OPE09_upd09_0(dest1_0, src_Upd01_Dtl9);
		}
		
		/**
		 * 連携処理CALL_OPE09_chk09の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE09_chk09_0() {
			MCRowMapper map = new Map_up_CALL_OPE09_chk09_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE09_chk09の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE09_chk09_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE09_chk09の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE09_chk09_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE09_chk09の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE09_chk09_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE09_chk09_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE09_chk09_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE09_upd09の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE09_upd09_0() {
			MCRowMapper map = new Map_up_CALL_OPE09_upd09_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE09_upd09の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE09_upd09_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE09_upd09の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE09_upd09_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE09_upd09の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE09_upd09_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE09_upd09_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE09_upd09_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE10専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE10の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE10(MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> src_Upd01_Dtl10){
			up_CALL_OPE10_chk10_0(dest0_0, src_Upd01_Dtl10);
			up_CALL_OPE10_upd10_0(dest1_0, src_Upd01_Dtl10);
		}
		
		/**
		 * 連携処理CALL_OPE10_chk10の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE10_chk10_0() {
			MCRowMapper map = new Map_up_CALL_OPE10_chk10_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE10_chk10の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE10_chk10_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_typ", "inpt_itm_add_typ");
				addColumnPathMap("inpt_itm_del_typ", "inpt_itm_del_typ");
				addColumnPathMap("sch_tgt_typ", "sch_tgt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE10_chk10の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE10_chk10_0(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE10_chk10の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE10_chk10_0(MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE10_chk10_0();
			for(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE10_chk10_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE10_upd10の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE10_upd10_0() {
			MCRowMapper map = new Map_up_CALL_OPE10_upd10_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE10_upd10の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE10_upd10_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_typ", "inpt_itm_add_typ");
				addColumnPathMap("inpt_itm_del_typ", "inpt_itm_del_typ");
				addColumnPathMap("sch_tgt_typ", "sch_tgt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE10_upd10の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE10_upd10_0(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE10_upd10の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE10_upd10_0(MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE10_upd10_0();
			for(mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0340.ItmWg_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE10_upd10_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE11専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE11の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE11(MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> src_Upd01_Dtl11){
			up_CALL_OPE11_chk11_0(dest0_0, src_Upd01_Dtl11);
			up_CALL_OPE11_upd11_0(dest1_0, src_Upd01_Dtl11);
		}
		
		/**
		 * 連携処理CALL_OPE11_chk11の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE11_chk11_0() {
			MCRowMapper map = new Map_up_CALL_OPE11_chk11_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE11_chk11の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE11_chk11_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("ntfy_nm", "ntfy_nm");
				addColumnPathMap("plnt_aprv_flg", "plnt_aprv_flg");
				addColumnPathMap("plnt_aprv_role_cd", "plnt_aprv_role_cd");
				addColumnPathMap("insp_aprv_flg", "insp_aprv_flg");
				addColumnPathMap("insp_aprv_role_cd", "insp_aprv_role_cd");
				addColumnPathMap("mfg_aprv_flg", "mfg_aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("xfr_lot_flg", "xfr_lot_flg");
				addColumnPathMap("so_prmt_insp_flg", "so_prmt_insp_flg");
				addColumnPathMap("in_prmt_insp_flg", "in_prmt_insp_flg");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE11_chk11の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE11_chk11_0(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE11_chk11の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE11_chk11_0(MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE11_chk11_0();
			for(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE11_chk11_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE11_upd11の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE11_upd11_0() {
			MCRowMapper map = new Map_up_CALL_OPE11_upd11_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE11_upd11の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE11_upd11_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("ntfy_nm", "ntfy_nm");
				addColumnPathMap("plnt_aprv_flg", "plnt_aprv_flg");
				addColumnPathMap("plnt_aprv_role_cd", "plnt_aprv_role_cd");
				addColumnPathMap("insp_aprv_flg", "insp_aprv_flg");
				addColumnPathMap("insp_aprv_role_cd", "insp_aprv_role_cd");
				addColumnPathMap("mfg_aprv_flg", "mfg_aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("xfr_lot_flg", "xfr_lot_flg");
				addColumnPathMap("so_prmt_insp_flg", "so_prmt_insp_flg");
				addColumnPathMap("in_prmt_insp_flg", "in_prmt_insp_flg");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE11_upd11の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE11_upd11_0(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE11_upd11の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE11_upd11_0(MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE11_upd11_0();
			for(mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0350.ItmSite_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE11_upd11_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE12専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE12の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE12(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src_Upd01_Dtl12){
			up_CALL_OPE12_chk12_0(dest0_0, src_Upd01_Dtl12);
			up_CALL_OPE12_upd12_0(dest1_0, src_Upd01_Dtl12);
		}
		
		/**
		 * 連携処理CALL_OPE12_chk12の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE12_chk12_0() {
			MCRowMapper map = new Map_up_CALL_OPE12_chk12_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE12_chk12の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE12_chk12_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE12_chk12の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE12_chk12_0(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE12_chk12の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE12_chk12_0(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE12_chk12_0();
			for(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE12_chk12_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE12_upd12の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE12_upd12_0() {
			MCRowMapper map = new Map_up_CALL_OPE12_upd12_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE12_upd12の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE12_upd12_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE12_upd12の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE12_upd12_0(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE12_upd12の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE12_upd12_0(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE12_upd12_0();
			for(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE12_upd12_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
		//-----------------------CALL_OPE05専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE05の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE05(){
		}
		//-----------------------CALL_OPE06専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE06の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE06(){
		}
		//-----------------------CALL_OPE07専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE07の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE07(){
		}
		//-----------------------CALL_OPE08専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE08の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE08(){
		}
		//-----------------------CALL_OPE09専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE09の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE09(){
		}
		//-----------------------CALL_OPE10専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE10の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE10(){
		}
		//-----------------------CALL_OPE11専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE11の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE11(){
		}
		//-----------------------CALL_OPE12専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE12の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE12(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}